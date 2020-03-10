package mx.codster.examen.expediente.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.codster.examen.expediente.model.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

	/* Obtiene usuario a partir de id */
	Usuario findByClave(Integer clave);
	
}
