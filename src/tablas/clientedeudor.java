/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

/**
 *
 * @author Marcelo Cazon <sandman.net@gmail.com>
 */
public class clientedeudor {

    private int deuda;
    private int dni;
    private String nombre;
    private int coeficiente;

    public int getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(int coeficiente) {
        this.coeficiente = coeficiente;
    }

    public int getDeuda() {
        return deuda;
    }

    public void setDeuda(int deuda) {
        this.deuda = deuda;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
