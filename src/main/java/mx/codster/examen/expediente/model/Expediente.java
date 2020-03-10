package mx.codster.examen.expediente.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
 
@Entity
@Table(name = "expediente")
public class Expediente {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "num_expediente")
    private Integer numExpediente;
 
    @Column(name = "fecha_ultima_consulta")
    @Temporal(TemporalType.DATE)
    private Date fechaUltimaConsulta;
 
    @Column(name = "tipo_sangre")
    private String tipoSangre;
 
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