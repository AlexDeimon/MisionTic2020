/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Spring.Reto5.Redflix3.Modelos;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Yesid93
 */
@Entity
@Table(name = "Usuario")
public class Usuario {

    @Id
    @Column(name = "id_username")
    private String idUsername;
    
    @Column(name = "nombre")
    private String nombreUsuario;
    
    @Column(name = "apellido")
    private String apellidoUsuario;

    public String getIdUsername() {
        return idUsername;
    }

    public void setIdUsername(String idUsername) {
        this.idUsername = idUsername;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsername=" + idUsername + ", nombreUsuario=" + nombreUsuario + ", apellidoUsuario=" + apellidoUsuario + '}';
    }
    
}
