package mx.codster.examen.expediente.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.codster.examen.expediente.model.Expediente;

@Repository
public interface ExpedienteRepository extends CrudRepository<Expediente, Integer> {

	/* Obtiene expediente a partir de numExpediente */
	Expediente findByNumExpediente(Integer numExpediente);
	
}
