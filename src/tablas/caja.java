/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

/**
 *
 * @author Marcelo Cazon <sandman.net@gmail.com>
 */
public class caja {
    private int saldo;
    private int ingreso;
    private int vuelto;
    private int monto=0;
    private int id;
    private int coeficiente;
    private int dni;

    public int getId() {
        return id;
    }

    public int getMonto() {
        return monto;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo + (this.ingreso-this.vuelto);
    }

    public int getIngreso() {
        return ingreso;
    }

    public int getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(int coeficiente) {
        this.coeficiente = coeficiente;
    }

    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }

    public int getVuelto() {
        return vuelto;
    }

    public void setVuelto(int vuelto) {
        this.vuelto = (ingreso-monto);
    }


}
