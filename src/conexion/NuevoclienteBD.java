/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conexion;
import java.sql.ResultSet;
import tablas.*;
//import videoclub.*;
/**
 *
 * @author Marcelo Cazon & Pablo Carrizo
 */
public class NuevoclienteBD {
private int datos;
private ResultSet rs;
conexionBD conecta=new conexionBD();
cliente c = new cliente();

public int insertarcliente(cliente c)
{
    datos=this.conecta.Inserta("INSERT into cliente (dni,nombre,direccion,telefono,mail,ciudad)values ( '"+c.getDni()+"','"+c.getNombre()+"','"+c.getDireccion()+"','"+c.getTelefono()+"','"+c.getMail()+"','"+c.getCiudad()+"')");
    return datos;
}
public int insertarchequera(cliente c)
{
    datos=this.conecta.Inserta("INSERT into chequeras2 (id_usuario,tamanio,restantes)values ( '"+c.getDni()+"','"+c.getCant_peliculas()+"','"+c.getCant_peliculas()+"')");
    return datos;
}


public int eliminarcliente(cliente c)
{
    datos=this.conecta.Elimina("DELETE FROM  cliente WHERE dni='"+c.getDni()+"'");
    return datos;
}

public int modificarcliente(cliente c)
{
    datos=this.conecta.Modifica("UPDATE cliente SET nombre='"+c.getNombre()+"', direccion='"+c.getDireccion()+"', telefono='"+c.getTelefono()+"', mail='"+c.getMail()+"' , ciudad='"+c.getCiudad()+"'  WHERE dni='"+c.getDni()+"'");
    return datos;
}

public int modificarchequeras(cliente c)
{
    datos=this.conecta.Modifica("UPDATE cliente SET chequera='Si'  WHERE dni='"+c.getDni()+"'");
    return datos;
}

public int modifichequerano(cliente c)
{
    datos=this.conecta.Modifica("UPDATE cliente SET chequera='No'  WHERE dni='"+c.getDni()+"'");
    return datos;
}
public ResultSet tablacliente(){

        rs = this.conecta.Consulta("SELECT * FROM cliente");
        return rs;
}



/*public ResultSet tabladeudores(){

        rs = this.conecta.Consulta("SELECT * FROM cliente");
        return rs;
}*/

}