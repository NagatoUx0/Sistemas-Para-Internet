
package br.com.locadora.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import br.com.locadora.model.Usuario;


//@Component
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
}
