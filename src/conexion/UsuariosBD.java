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
public class UsuariosBD {

    private int datos;
    private ResultSet rs;
    conexionBD conecta = new conexionBD();
    usuarios c = new usuarios();

    public int insertarusuario(usuarios c) {
        datos = this.conecta.Inserta("INSERT into usuario (dni,nombre,apellido,turno,rol,usuario,pass)values ( '" + c.getDni() + "','" + c.getNombre() + "','" + c.getApellido() + "','" + c.getTurno() + "','" + c.getRol() + "','" + c.getUsuario() + "','" + c.getPass() + "')");
        return datos;
    }

    public int eliminarusuario(usuarios c) {
        datos = this.conecta.Elimina("DELETE FROM  usuario WHERE dni='" + c.getDni() + "'");
        return datos;
    }

    public int modificarusuario(usuarios c) {
        datos = this.conecta.Modifica("UPDATE usuario SET dni='" + c.getDni() + "', nombre='" + c.getNombre() + "', apellido='" + c.getApellido() + "', turno='" + c.getTurno() + "', rol='" + c.getRol() + "' , usuario='" + c.getUsuario() + "' , pass='" + c.getPass() + "' WHERE dni='" + c.getDni() + "'");
        return datos;

    }

    public ResultSet tablaUsuario() {

        rs = this.conecta.Consulta("SELECT * FROM usuario");
        return rs;

    }
}