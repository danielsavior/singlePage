package br.com.restaurante.daos;
import org.springframework.data.repository.CrudRepository;
import br.com.restaurante.models.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long>{

}
