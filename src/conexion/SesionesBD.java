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
public class SesionesBD {
     private int datos;
     private ResultSet rs;
        conexionBD conecta=new conexionBD();
        sesiones s = new sesiones();


        public int insertarsesion(sesiones s)
        {
            datos=this.conecta.Inserta("INSERT into sesiones (id_sesion,usuario,rol,hora_inicio,hora_cierre)values ('"+s.getId()+"','"+s.getUsuario()+"','"+s.getRol()+"','"+s.getHora_inicio()+"','"+s.getHora_cierre()+"')");
            return datos;
        }

    public ResultSet tablaSesion(){

        rs = this.conecta.Consulta("SELECT * FROM sesiones");
        return rs;
}

      /*  public int eliminarpelicula(sesiones s)
        {
            datos=this.conecta.Elimina("DELETE FROM  peliculas WHERE id='"+p.getId()+"'");
            return datos;
        }

        public int modificarpelicula(sesiones s)
        {
            datos=this.conecta.Modifica("UPDATE peliculas SET nombre='"+p.getNombre()+"', genero='"+p.getGenero()+"', duracion='"+p.getDuracion()+"', director='"+p.getDirector()+"', actores='"+p.getActores()+"', fechaestreno='"+p.getFechaestreno()+"', nro_copias='"+p.getNro_copias()+"', sinopsis='"+p.getSinopsis()+"' WHERE id='"+p.getId()+"'");
            return datos;
        }*/


}