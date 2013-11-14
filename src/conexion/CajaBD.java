/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.ResultSet;
import tablas.*;
import videorent.Caja;
import warnings.*;

/**
 *
 * @author Marcelo Cazon <sandman.net@gmail.com>
 */
public class CajaBD {

    private int datos;
    private ResultSet rs;
    conexionBD conecta = new conexionBD();
    caja ca = new caja();
    Caja cc = new Caja();
    private int k;

    public int insertarIngreso(caja ca) {
        datos = this.conecta.Inserta("INSERT into caja (ingreso,egreso,saldo)values ( '" + ca.getIngreso() + "','" + ca.getVuelto() + "','" + (ca.getSaldo()-ca.getMonto()) + "')");
        return datos;
    }

    public int retornarId(caja ca) {
        rs = this.conecta.Consulta("SELECT COUNT() FROM caja");
        datos = 0;
        try {

            while (rs.next()) {
                ca.setId(rs.getInt("id"));
            }
            int k = ca.getSaldo();
            if (k != 0) {
                datos = 1;
            } else {
                datos = 0;
            }
        } catch (Exception e) {

            Warning1 w = new Warning1();
            w.setVisible(true);

        }
        return datos;
    }

    public int calcularMonto(menuprincipal mp) {
        rs = this.conecta.Consulta("SELECT COUNT(id_cliente) FROM alquileres WHERE id_cliente='" + mp.getId_cliente() + "'");
        datos = 0;
        try {

            while (rs.next()) {
                ca.setCoeficiente(rs.getInt("id_cliente"));
            }
            int k = ca.getCoeficiente() * 10;
            ca.setMonto(k);
            if (k != 0) {
                datos = 1;
            } else {
                datos = 0;
            }
        } catch (Exception e) {

            Warning1 w = new Warning1();
            w.setVisible(true);

        }
        return datos;
    }

    public int retornarMontos(caja ca) {

        rs = this.conecta.Consulta("SELECT ingreso,egreso,saldo FROM caja WHERE id='" + ca.getId() + "'");
        datos = 0;
        try {

            while (rs.next()) {
                ca.setIngreso(rs.getInt("ingreso"));
                ca.setVuelto(rs.getInt("egreso"));
                ca.setSaldo(rs.getInt("saldo"));
            }
            int k = ca.getSaldo();
            if (k != 0) {
                datos = 1;
            } else {
                datos = 0;
            }
        } catch (Exception e) {

            Warning1 w = new Warning1();
            w.setVisible(true);

        }
        return datos;
    }

    public int saldo() {
        rs = this.conecta.Consulta("SELECT saldo FROM caja WHERE id=(SELECT MAX(id) FROM caja)");
        try {
            while (rs.next()) {
                cc.setSaldo1(rs.getInt("saldo"));
            }
            k = cc.getSaldo1();
        } catch (Exception e) {
            Warning1 w = new Warning1();
            w.setVisible(true);
        }

        return k;
    }
    
    public void atraso (caja ca) {
        datos=this.conecta.Modifica("UPDATE atraso SET dias='" + ca.getCoeficiente() +"' WHERE dni='" + ca.getDni() +"'");
    }
    
      public void atraso1 (caja ca) {
        datos=this.conecta.Inserta("INSERT into atraso values dni='" + ca.getDni() +"', dias='0'");
    }
}
