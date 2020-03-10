package mx.codster.examen.expediente.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.codster.examen.expediente.model.Expediente;
import mx.codster.examen.expediente.persistence.ExpedienteRepository;
import mx.codster.examen.expediente.service.ExpedienteService;

@Service
public class ExpedienteServiceImpl implements ExpedienteService {

	@Autowired
	private ExpedienteRepository expedienteRepository;

	@Override
	public Expediente obtenExpedientePorNum(Integer numExpediente) {
		return expedienteRepository.findByNumExpediente(numExpediente);
	}
	
	
	
}
