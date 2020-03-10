package mx.codster.examen.expediente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.codster.examen.expediente.model.Usuario;
import mx.codster.examen.expediente.service.UsuarioService;
import mx.codster.examen.util.dto.ResponsePayloadDTO;

/*
 * Implementando arquitectura REST a traves de Restful de Spring para la generacion 
 * de los recursos de web services del aplicativo. Al ser distribuida, el proyecto puede escalarse con una 
 * arquitectura de microservicios con su propios controladores REST.
 *
 * */
@RestController
@RequestMapping(value = "/demo")
public class PayloadRestController {

	@Autowired
	private UsuarioService usuarioService; 
	
	private static final String msgOK = "Petición completada";
	private static final String msgRequestSinDatos= "El id de usuario no existe";
	private static final String msgRequestError= "Ocurrió; un error al obtener expediente";
	
	
	/* Recurso home del aplicativo de recursos. En un arquitectura MVC podemos crear una clase de Controladores
	 * que funcionara como comunicacion de los metodos de las vistas y del modelo. La implementacion en esta clase 
	 * es distinta ya que manejará unicamente los recursos y controladores REST del aplicativo
	 * */
	@RequestMapping("/")
    public ResponseEntity<?> home(){
		return new ResponseEntity<String>("Bienvenido a proyecto demo - Codster -", HttpStatus.OK);
    }

	
	/* Recurso general para la solucion del pproyecto, la forma de utilizarlo fue:
	 * http://localhost:8080/demo/v1/accounts/10/record
	 * En donde 10 es el registro de usuario que se va a consultar
	 * */
	@RequestMapping("/v1/accounts/{id}/record")
	public ResponsePayloadDTO getPayloadByNum(@PathVariable(name = "id") Integer id) {

		ResponsePayloadDTO response = new ResponsePayloadDTO();
		Usuario usuario = usuarioService.obtenUsuarioPorClave(id);
		try {
			if (usuario != null) {
				response.setCodigo(HttpStatus.OK.value());
				response.setMensaje(msgOK);
				response.setPayload(usuario);
			}
			else {
				response.setCodigo(HttpStatus.BAD_REQUEST.value());
				response.setMensaje(msgRequestSinDatos);
			}
		}
		catch (Exception ex) {
			response.setCodigo(HttpStatus.INTERNAL_SERVER_ERROR.value());
			response.setMensaje(msgRequestError);
			ex.printStackTrace();
		}
		return response;
	}
	
}
