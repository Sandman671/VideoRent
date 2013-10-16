/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tablas;

/**
 *
 * @author Marcelo Cazon & Pablo Carrizo
 */
public class sesiones {

    private int id;
    private int usuario;
    private String hora_inicio;
    private String hora_cierre;
    private String rol;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the usuario
     */
    public int getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the hora_inicio
     */
    public String getHora_inicio() {
        return hora_inicio;
    }

    /**
     * @param hora_inicio the hora_inicio to set
     */
    public void setHora_inicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    /**
     * @return the hora_cierre
     */
    public String getHora_cierre() {
        return hora_cierre;
    }

    /**
     * @param hora_cierre the hora_cierre to set
     */
    public void setHora_cierre(String hora_cierre) {
        this.hora_cierre = hora_cierre;
    }

    /**
     * @return the rol
     */
    public String getRol() {
        return rol;
    }

    /**
     * @param rol the rol to set
     */
    public void setRol(String rol) {
        this.rol = rol;
    }

}