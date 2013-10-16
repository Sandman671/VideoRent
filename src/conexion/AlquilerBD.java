/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conexion;

import java.sql.ResultSet;

/**
 *
 * @author Marcelo Cazon & Pablo Carrizo
 */
public class AlquilerBD {
    
    private int datos;
    conexionBD conecta=new conexionBD();
    private ResultSet rs;

public ResultSet tablaalquiler(){

        rs = this.conecta.Consulta("SELECT * FROM alquileres");
        return rs;
}

}