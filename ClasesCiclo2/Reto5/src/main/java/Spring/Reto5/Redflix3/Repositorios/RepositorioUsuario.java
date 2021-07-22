/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Spring.Reto5.Redflix3.Repositorios;
import Spring.Reto5.Redflix3.Modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Yesid93
 */
public interface RepositorioUsuario extends JpaRepository<Usuario, String>{
    
}