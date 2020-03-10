package mx.example.app.expediente.model;

import java.util.Date;

public class Expediente {
 
    private Integer numExpediente;
 
    private Date fechaUltimaConsulta;
 
    private String tipoSangre;
 
    private String msg;
    
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Integer getNumExpediente() {
		return numExpediente;
	}

	public void setNumExpediente(Integer numExpediente) {
		this.numExpediente = numExpediente;
	}

	public Date getFechaUltimaConsulta() {
		return fechaUltimaConsulta;
	}

	public void setFechaUltimaConsulta(Date fechaUltimaConsulta) {
		this.fechaUltimaConsulta = fechaUltimaConsulta;
	}

	public String getTipoSangre() {
		return tipoSangre;
	}

	public void setTipoSangre(String tipoSangre) {
		this.tipoSangre = tipoSangre;
	}
    
    
}