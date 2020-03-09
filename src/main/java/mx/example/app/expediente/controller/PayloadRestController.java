package mx.example.app.expediente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.example.app.expediente.model.Expediente;
import mx.example.app.expediente.service.ExpedienteService;
import mx.example.app.util.dto.ResponsePayloadDTO;


@RestController
@RequestMapping(value = "/demo")
public class PayloadRestController {

	private static final String msgOK = "Petición completada";
	private static final String msgRequestError= "Ocurrió; un error al obtener expediente";

	@Autowired
	private ExpedienteService expedienteService;
	
	@RequestMapping("/")
    public ResponseEntity<?> home(){
		return new ResponseEntity<String>("Bienvenido", HttpStatus.OK);
    }

	@RequestMapping("/v1/accounts/{id}/record")
	public ResponsePayloadDTO getPayloadByNum(@PathVariable(name = "id") Integer id) {

		ResponsePayloadDTO response = new ResponsePayloadDTO();
		Expediente expediente = null;
		try {
			expediente = expedienteService.obtenExpedientePorNum(id);
			response.setCodigo(HttpStatus.OK.value());
			response.setExpediente(expediente);
			response.setMensaje(msgOK);
		}
		catch (Exception ex) {
			response.setCodigo(HttpStatus.INTERNAL_SERVER_ERROR.value());
			response.setMensaje(msgRequestError + ex.getMessage());
		}
		return response;
	}
	
}
