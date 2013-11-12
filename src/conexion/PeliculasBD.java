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
public class PeliculasBD {



        private int datos;
        conexionBD conecta=new conexionBD();
        peliculas p = new peliculas();
        private ResultSet rs;

        public int insertarpelicula(peliculas p)
        {
            datos=this.conecta.Inserta("INSERT into peliculas (nombre,genero,duracion,sinopsis)values ('"+p.getNombre()+"','"+p.getGenero()+"','"+p.getDuracion()+"','"+p.getSinopsis()+"')");
            return datos;
        }



        public int eliminarpelicula(peliculas p)
        {
            datos=this.conecta.Elimina("DELETE FROM  peliculas WHERE id='"+p.getId()+"'");
            return datos;
        }

        public int modificarpelicula(peliculas p)
        {
            datos=this.conecta.Modifica("UPDATE peliculas SET nombre='"+p.getNombre()+"', genero='"+p.getGenero()+"', duracion='"+p.getDuracion()+"', sinopsis='"+p.getSinopsis()+"' WHERE id='"+p.getId()+"'");
            return datos;
        }
        public ResultSet tablapelicula(){

        rs = this.conecta.Consulta("SELECT * FROM peliculas");
        return rs;
}

        public ResultSet tablapelicula1(){

        rs = this.conecta.Consulta("SELECT * FROM peliculas WHERE estado='Disponible'");
        return rs;
}        

}