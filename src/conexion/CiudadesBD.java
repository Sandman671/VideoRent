/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conexion;

import java.sql.ResultSet;
import tablas.ciudades;

/**
 *
 * @author Marcelo Cazon & Pablo Carrizo
 */
public class CiudadesBD {


private int datos;
private ResultSet rs;
conexionBD conecta=new conexionBD();
ciudades cd = new ciudades();


    public int insertarciudad(ciudades cd)
{
    datos=this.conecta.Inserta("INSERT into ciudades (codigo_postal,ciudad)values ( '"+cd.getCodigopostal()+"','"+cd.getNombreciudad()+"')");
    return datos;
}



public int eliminarciudad(ciudades cd)
{
    datos=this.conecta.Elimina("DELETE FROM  ciudades WHERE codigo_postal='"+cd.getCodigopostal()+"'");
    return datos;
}

public int modificarciudad(ciudades cd)
{
    datos=this.conecta.Modifica("UPDATE ciudades SET ciudad='"+cd.getNombreciudad()+"'  WHERE codigo_postal='"+cd.getCodigopostal()+"'");
    return datos;
}

 public ResultSet tablaciudad(){

        rs = this.conecta.Consulta("SELECT * FROM ciudades");
        return rs;
}


}