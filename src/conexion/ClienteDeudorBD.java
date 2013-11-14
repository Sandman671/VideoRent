/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.*;
import tablas.clientedeudor;
import videorent.ClienteDeudor;
import warnings.Warning1;

/**
 *
 * @author Marcelo Cazon <sandman.net@gmail.com>
 */
public class ClienteDeudorBD {

    private int datos;
    conexionBD conecta = new conexionBD();
    ClienteDeudor cd1 = new ClienteDeudor();
    clientedeudor cd = new clientedeudor();
    private ResultSet rs;
    private int k;

    public int insertarDeuda() {
        datos = this.conecta.Inserta("INSERT into deudores (saldo)values ('" + cd.getDeuda() + "') WHERE id_cliente='" + cd.getDni() + "'");
        return datos;
    }

    public int insertarDeudor(clientedeudor cd) {
        datos = this.conecta.Inserta("INSERT into deudores (id_cliente,nombre) values('" + cd.getDni() + "','" + cd.getNombre() + "')");
        return datos;
    }

    public int actualizarDeuda(clientedeudor cd) {
        datos = this.conecta.Modifica("UPDATE deudores SET saldo='" + cd1.getDeuda() + "' WHERE id_cliente='" + cd.getDni() + "'");
        return datos;
    }

    public int buscarDeudor(clientedeudor cd) {
        rs = this.conecta.Consulta("SELECT id_cliente,nombre,saldo FROM deudores WHERE id_cliente='" + cd.getDni() + "'");
        datos = 0;

        try {
            while (rs.next()) {
                cd1.setDni(rs.getInt("id_cliente"));
                cd1.setNombre(rs.getString("nombre"));
                cd1.setDeuda(rs.getInt("saldo"));
            }
            int m=cd1.getDeuda();
            int l=m+10;
            cd1.setDeuda(l);
            actualizarDeuda(cd);
            int k = cd1.getDni();
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

    public void nuevoDeudor() {
        rs = this.conecta.Consulta("SELECT dni,nombre FROM cliente WHERE dni='" + cd1.getDni() + "' ");
        try {
            while (rs.next()) {
                cd1.setDni(rs.getInt("dni"));
                cd1.setNombre(rs.getString("nombre"));
            }
        } catch (Exception e) {

            Warning1 w = new Warning1();
            w.setVisible(true);
        }
    }

    public int buscarDeuda(clientedeudor cd) {
        rs = this.conecta.Consulta("SELECT * FROM deudores WHERE id_cliente='" + cd.getDni() + "'");
        datos = 0;
        try {

            while (rs.next()) {
                cd1.setDni(rs.getInt("id_cliente"));
                cd1.setNombre(rs.getString("nombre"));
                cd1.setDeuda(rs.getInt("saldo"));
            }
            int k = cd.getDni();
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

    public int calcularDeuda(clientedeudor cd) {
        int g = 0;
        rs = this.conecta.Consulta("SELECT * FROM alquileres WHERE id_cliente='" + cd.getDni() + "'");
        try {
            while (rs.next()) {
                g = g++;
            }
            int k = cd.getDni();
            if (k != 0) {
                datos = 1;
                cd.setCoeficiente(g);
            } else {
                datos = 0;
            }
        } catch (Exception e) {

            Warning1 w = new Warning1();
            w.setVisible(true);

        }
        return datos;
    }
    
    public int deuda (clientedeudor cd) {
        rs = this.conecta.Consulta("SELECT saldo FROM deudores WHERE id_cliente='" + cd.getDni() + "'");
                try {
            while (rs.next()) {
                cd1.setDeuda(rs.getInt("saldo"));
            }
             k = cd1.getDeuda();

        } catch (Exception e) {

            Warning1 w = new Warning1();
            w.setVisible(true);

        }
                return k;
    }
}
