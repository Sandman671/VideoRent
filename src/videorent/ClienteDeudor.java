/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package videorent;

import conexion.*;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import tablas.clientedeudor;
import tablas.menuprincipal;
import warnings.Warning1;

/**
 *
 * @author Marcelo Cazon <sandman.net@gmail.com>
 */
public class ClienteDeudor {

    private int dni;
    private int deuda;
    private String nombre;
    private ResultSet rs;
    private int deuda1 = 0;

    public void nuevoDeudor() {
        conexionBD con = new conexionBD();
        ClienteDeudorBD gestor = new ClienteDeudorBD();
        clientedeudor cd = new clientedeudor();
        int k;
        k = dni;
        cd.setDni(dni);
        cd.setNombre(nombre);
        if (k != 0) {
            gestor.insertarDeudor(cd);
            //actualizarDeuda();
            // calcularDeuda();
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo crear cliente deudor", "Error", 1);
        }
    }

    public int getDeuda() {
        return deuda;
    }

    public void setDeuda(int deuda) {
        this.deuda = deuda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void buscarDeudor() {
        ClienteDeudorBD gestor = new ClienteDeudorBD();
        clientedeudor cd = new clientedeudor();
        cd.setDni(dni);
        int l = gestor.buscarDeudor(cd);
        if (l == 1) {
           // actualizarDeuda();
        } else {
            nuevoDeudor();
        }
    }

    public void actualizarDeuda() {
        ClienteDeudorBD gestor = new ClienteDeudorBD();
        clientedeudor cd = new clientedeudor();
        cd.setDni(dni);
        int s = gestor.actualizarDeuda(cd);
        if (s != 0) {
            System.out.print(getDni());

        } else {

            Warning1 w = new Warning1();
            w.setVisible(true);

        }
    }

    public void calcularDeuda() {
        conexionBD con = new conexionBD();
        clientedeudor cd = new clientedeudor();
        ClienteDeudorBD gestor = new ClienteDeudorBD();
        gestor.calcularDeuda(cd);
        int g = cd.getCoeficiente();
        this.deuda = g * 10;
        cd.setDeuda(deuda);
    }
}
