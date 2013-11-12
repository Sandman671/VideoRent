/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conexion;

import java.sql.ResultSet;
import tablas.*;
import warnings.*;

/**
 *
 * @author Marcelo Cazon & Pablo Carrizo
 */
public class LoginBD {

    private ResultSet datos;
    private int datos2;
    conexionBD conecta=new conexionBD();
    login l = new login();
    String rol;

public int insertarsesion(login log)
{
    datos=this.conecta.Consulta("SELECT rol FROM usuario where usuario= '"+log.getUsuario()+"'");
    try {
           
    while (datos.next()) {
                  rol=(datos.getString("rol"));
            }
    } catch (Exception e) {

            Warning1 w = new Warning1();
            w.setVisible(true);

        }
    datos2=this.conecta.Inserta("INSERT into sesiones (usuario,rol,fecha,hora_inicio,hora_cierre)values ( '"+log.getUsuario()+"','" + rol + "',CURRENT_DATE,CURRENT_TIME,CURRENT_TIME)");
    return datos2;
}




    public ResultSet consultausuario(login l)
{
    datos=this.conecta.Consulta("SELECT * FROM usuario where usuario= '"+l.getUsuario()+"' and pass='" +l.getPass()+"'");
    return datos;
}




}