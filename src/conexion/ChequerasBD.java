/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conexion;
import java.sql.ResultSet;
import tablas.chequeras;
/**
 *
 * @author Marcelo Cazon & Pablo Carrizo
 */
public class ChequerasBD {
private int datos;
private ResultSet rs;
conexionBD conecta=new conexionBD();
chequeras ch = new chequeras();


    public int insertarchequera(chequeras ch)
{
    datos=this.conecta.Inserta("INSERT into chequeras (cant_peliculas,precio_total)values ( '"+ch.getCantpeliculas()+"','"+ch.getPreciototal()+"')");
    return datos;
}



public int eliminarchequera(chequeras ch)
{
    datos=this.conecta.Elimina("DELETE FROM  chequeras WHERE id_chequera='"+ch.getId_chequera()+"'");
    return datos;
}

public int modificarchequera(chequeras ch)
{
    datos=this.conecta.Modifica("UPDATE chequeras SET cant_peliculas='"+ch.getCantpeliculas()+"', precio_total='"+ch.getPreciototal()+"'  WHERE id_chequera='"+ch.getId_chequera()+"'");
    return datos;
}

 public ResultSet tablachequeras(){

        rs = this.conecta.Consulta("SELECT * FROM chequeras");
        return rs;
}

}