package mx.codster.examen.expediente.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.codster.examen.expediente.model.Usuario;
import mx.codster.examen.expediente.persistence.UsuarioRepository;
import mx.codster.examen.expediente.service.UsuarioService;

/*
 * Se realiza construccion con una arquitectura SOA para los servicios de logica de negocio que contienen
 * la actividad de negocio con soluciones especificas y se encuentran representados en metodos definidos en interfaces
 * y a su vez implementados en clases. El nombre del metodo indica la descripcion de la accion/operacion 
 * del metodo en si mismo. 
 * */
@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public Usuario obtenUsuarioPorClave(Integer id) {
		return usuarioRepository.findByClave(id);
	}

}
