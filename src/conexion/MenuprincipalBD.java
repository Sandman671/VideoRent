/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conexion;

import java.sql.ResultSet;
import tablas.menuprincipal;

/**
 *
 * @author Marcelo Cazon & Pablo Carrizo
 */
public class MenuprincipalBD {

      private int datos;
      private ResultSet rs;
      conexionBD conecta=new conexionBD();
      menuprincipal mp = new menuprincipal();

public int insertaralquiler(menuprincipal mp)
{
    datos=this.conecta.Inserta("INSERT into alquileres (id_cliente,nombrecliente,id_pelicula,nombrepelicula,fechaalquiler,fechadevolucion)values ( '"+mp.getId_cliente()+"','"+mp.getNombrecliente()+"','"+mp.getId_pelicula()+"','"+mp.getNombrepelicula()+"',CURDATE(),ADDDATE(CURDATE(), INTERVAL 1 DAY))");
    return datos;
}

public int modificarestadopelicula(menuprincipal mp)
{
    datos=this.conecta.Modifica("UPDATE peliculas SET estado='Alquilada' WHERE id='"+mp.getId_pelicula()+"'");
    return datos;
}
public int modificarestadopelicula2(menuprincipal mp)
{
    datos=this.conecta.Modifica("UPDATE peliculas SET estado='Disponible' WHERE id='"+mp.getId_pelicula()+"'");
    return datos;
}
public int modificarrestantes(menuprincipal mp)
{
    datos=this.conecta.Modifica("UPDATE chequeras2 SET restantes='"+mp.getRestantes()+"' WHERE id_usuario='"+mp.getId_cliente()+"'");
    return datos;
}
public int modificarestadoalq(menuprincipal mp)
{
    datos=this.conecta.Modifica("UPDATE alquileres SET estado='No' WHERE id_alquiler='"+mp.getId_alquiler()+"'");
    return datos;
}
public ResultSet tablaCliente(){

        rs = this.conecta.Consulta("SELECT * FROM cliente");
        return rs;
}

public ResultSet tablapelicula(){

        rs = this.conecta.Consulta("SELECT * FROM peliculas WHERE estado = 'Disponible'");
        return rs;
}
public ResultSet tablanodeudor(){

        rs = this.conecta.Consulta("SELECT * FROM alquileres WHERE (curdate()-fechadevolucion)<=0 AND estado='Si'");
        return rs;
}
public ResultSet tabladeudor(){

        rs = this.conecta.Consulta("SELECT * FROM alquileres WHERE (curdate()-fechadevolucion)>0 AND estado='Si'");
        return rs;
}
//,fechaalquiler,fechadevolucion
//,CURDATE(),ADDDATE(CURDATE(), INTERVAL 1 DAY)");




}