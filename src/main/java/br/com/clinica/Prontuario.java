package br.com.clinica;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Prontuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProntuario;
	private String Descricao;
	
	
	
	
	public int getIdProntuario() {
		return idProntuario;
	}
	public void setIdProntuario(int idProntuario) {
		this.idProntuario = idProntuario;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	
	

}
