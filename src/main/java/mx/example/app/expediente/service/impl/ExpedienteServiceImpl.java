package mx.example.app.expediente.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import mx.example.app.expediente.model.Expediente;
import mx.example.app.expediente.service.ExpedienteService;

@Service
public class ExpedienteServiceImpl implements ExpedienteService {

	@Value("${example.message.value}")
	private String msgValue;
	
	@Value("${example.message.service}") 
	private String msgService;
	
	@Override
	public Expediente obtenExpedientePorNum(Integer numExpediente) {
		System.out.println(msgService);
		
		Expediente expediente = new Expediente ();
		expediente.setFechaUltimaConsulta(new Date());
		expediente.setNumExpediente(numExpediente);
		expediente.setTipoSangre("A+");
		expediente.setMsg(msgValue);
		return expediente;
	}
	
	
}
