/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tablas;

/**
 *
 * @author Marcelo Cazon & Pablo Carrizo
 */
public class menuprincipal {

    private int id_cliente;
    private int id_pelicula;
    private int id_alquiler;
    private String nombrecliente;
    private String nombrepelicula;
    private String fechaalquiler;
    private String fechadevolucion;
    private String estado;
    private int restantes;

    /**
     * @return the id_cliente
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * @return the id_pelicula
     */
    public int getId_pelicula() {
        return id_pelicula;
    }

    /**
     * @param id_pelicula the id_pelicula to set
     */
    public void setId_pelicula(int id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    /**
     * @return the fechaalquiler
     */
    public String getFechaalquiler() {
        return fechaalquiler;
    }

    /**
     * @param fechaalquiler the fechaalquiler to set
     */
    public void setFechaalquiler(String fechaalquiler) {
        this.fechaalquiler = fechaalquiler;
    }

    /**
     * @return the fechadevolucion
     */
    public String getFechadevolucion() {
        return fechadevolucion;
    }

    /**
     * @param fechadevolucion the fechadevolucion to set
     */
    public void setFechadevolucion(String fechadevolucion) {
        this.fechadevolucion = fechadevolucion;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the nombrecliente
     */
    public String getNombrecliente() {
        return nombrecliente;
    }

    /**
     * @param nombrecliente the nombrecliente to set
     */
    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    /**
     * @return the nombrepelicula
     */
    public String getNombrepelicula() {
        return nombrepelicula;
    }

    /**
     * @param nombrepelicula the nombrepelicula to set
     */
    public void setNombrepelicula(String nombrepelicula) {
        this.nombrepelicula = nombrepelicula;
    }

    /**
     * @return the restantes
     */
    public int getRestantes() {
        return restantes;
    }

    /**
     * @param restantes the restantes to set
     */
    public void setRestantes(int restantes) {
        this.restantes = restantes;
    }

    /**
     * @return the id_alquiler
     */
    public int getId_alquiler() {
        return id_alquiler;
    }

    /**
     * @param id_alquiler the id_alquiler to set
     */
    public void setId_alquiler(int id_alquiler) {
        this.id_alquiler = id_alquiler;
    }


}