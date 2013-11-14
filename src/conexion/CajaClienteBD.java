/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.ResultSet;

/**
 *
 * @author Marcelo Cazon <sandman.net@gmail.com>
 */
public class CajaClienteBD {

    private int datos;
    conexionBD conecta = new conexionBD();
    private ResultSet rs;
    
    
    public ResultSet clientescombobox(){

        rs = this.conecta.Consulta("SELECT dni FROM cliente");
        return rs;
}
}
