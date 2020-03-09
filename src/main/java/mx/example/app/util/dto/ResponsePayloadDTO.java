package mx.example.app.util.dto;

import mx.example.app.expediente.model.Expediente;

public class ResponsePayloadDTO {

	private int codigo;
	private String mensaje;
	private Expediente expediente;
	
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

	public Expediente getExpediente() {
		return expediente;
	}

	public void setExpediente(Expediente expediente) {
		this.expediente = expediente;
	}

	
}