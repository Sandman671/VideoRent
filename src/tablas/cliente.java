/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tablas;
import conexion.*;

/**
 *
 * @author Marcelo Cazon & Pablo Carrizo
 */
public class cliente {

    private String nombre;
    private int dni;
    private String direccion;
    private String telefono;
    private String ciudad;
    private String mail;
    private String cant_peliculas;
    private String restantes;
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * @return the dni
     */
    public int getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(int dni) {
        this.dni = dni;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the cant_peliculas
     */
    public String getCant_peliculas() {
        return cant_peliculas;
    }

    /**
     * @param cant_peliculas the cant_peliculas to set
     */
    public void setCant_peliculas(String cant_peliculas) {
        this.cant_peliculas = cant_peliculas;
    }

    /**
     * @return the restantes
     */
    public String getRestantes() {
        return restantes;
    }

    /**
     * @param restantes the restantes to set
     */
    public void setRestantes(String restantes) {
        this.restantes = restantes;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

   

}