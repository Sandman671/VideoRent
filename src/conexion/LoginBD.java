/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conexion;

import java.sql.ResultSet;
import tablas.*;

/**
 *
 * @author Marcelo Cazon & Pablo Carrizo
 */
public class LoginBD {

    private ResultSet datos;
    private int datos2;
    conexionBD conecta=new conexionBD();
    login l = new login();

public int insertarsesion(login log)
{
    datos2=this.conecta.Inserta("INSERT into sesiones (usuario,fecha)values ( '"+log.getUsuario()+"',CURRENT_TIMESTAMP)");
    return datos2;
}




    public ResultSet consultausuario(login l)
{
    datos=this.conecta.Consulta("SELECT * FROM usuario where usuario= '"+l.getUsuario()+"' and pass='" +l.getPass()+"'");
    return datos;
}




}