package mx.codster.examen.expediente.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alergia")
public class Alergia {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idAlergia")
    private Integer idAlergia;
 
    @Column(name = "nombre")
    private String nombre;
 
    @Column(name = "fecha_alta")
    private Date fechaAlta;

    @Column(name = "medicamento")
    private String medicamento;

    @Column(name = "clave_alergia")
    private Integer claveAlergia;
    
	public Integer getIdAlergia() {
		return idAlergia;
	}

	public void setIdAlergia(Integer idAlergia) {
		this.idAlergia = idAlergia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public String getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(String medicamento) {
		this.medicamento = medicamento;
	}
    
    
    
}