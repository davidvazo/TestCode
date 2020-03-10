package mx.codster.examen.util.dto;

import mx.codster.examen.expediente.model.Usuario;

public class ResponsePayloadDTO {

	private int codigo;
	private String mensaje;
	private Usuario payload;
	
	public ResponsePayloadDTO() {}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Usuario getPayload() {
		return payload;
	}

	public void setPayload(Usuario payload) {
		this.payload = payload;
	}
	
	
}
