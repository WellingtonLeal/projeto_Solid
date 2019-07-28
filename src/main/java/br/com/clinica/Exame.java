package br.com.clinica;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class Exame {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idExame;
	private String tipoExame;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataExame;
	private String diagnostico;
	
	
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public int getIdExame() {
		return idExame;
	}
	public void setIdExame(int idExame) {
		this.idExame = idExame;
	}
	public String getTipoExame() {
		return tipoExame;
	}
	public void setTipoExame(String tipoExame) {
		this.tipoExame = tipoExame;
	}
	public Date getDataExame() {
		return dataExame;
	}
	public void setDataExame(Date dataExame) {
		this.dataExame = dataExame;
	}
	
	
	
}
