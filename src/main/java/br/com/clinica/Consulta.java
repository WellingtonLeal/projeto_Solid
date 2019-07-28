package br.com.clinica;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class Consulta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idConsulta;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataConsulta;
	
	@ManyToOne
	private Medico medico;
	@OneToOne
	private Exame exame;
	@OneToOne
	private Prontuario prontuario;
	
	

	public Prontuario getProntuario() {
		return prontuario;
	}



	public void setProntuario(Prontuario prontuario) {
		this.prontuario = prontuario;
	}



	public Exame getExame() {
		return exame;
	}



	public void setExame(Exame exame) {
		this.exame = exame;
	}



	public int getIdConsulta() {
		return idConsulta;
	}

	

	public void setIdConsulta(int idConsulta) {
		this.idConsulta = idConsulta;
	}



	public Date getDataConsulta() {
		return dataConsulta;
	}



	public void setDataConsulta(Date dataConsulta) {
		this.dataConsulta = dataConsulta;
	}



	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	
	
	

}
