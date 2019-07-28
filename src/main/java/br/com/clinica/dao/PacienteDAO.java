package br.com.clinica.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.clinica.Paciente;
import br.com.clinica.conection.ConectionFactory;

public class PacienteDAO {

	
	public Paciente salvar(Paciente paciente) {
		EntityManager em = new ConectionFactory().getConnection();
		
		try {
			em.getTransaction().begin();
			em.persist(paciente);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.err.println(e);
			
		}finally {
			em.close();
		}
		
		return paciente;
	}
	
//------------------------------------------------------------------------------	
	public Paciente editar(Paciente paciente) {
		EntityManager em = new ConectionFactory().getConnection();
		
		try {
			em.getTransaction().begin();
			em.merge(paciente);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.err.println(e);
			
		}finally {
			em.close();
		}
		
		return paciente;
	}
	
//---------------------------------------------------------------------------------
	public Paciente buscarPorId(Integer id) {
		EntityManager em = new ConectionFactory().getConnection();
		Paciente paciente = null;
		
		try {
			paciente = em.find(Paciente.class, id);
			
		} catch (Exception e) {
			System.err.println(e);
		}finally {
			em.close();
		}
		return paciente;
	}
//--------------------------------------------------------------------------------------
	
	public List<Paciente> buscarTodos(){
		EntityManager em = new ConectionFactory().getConnection();
		List<Paciente> pacientes = null;
		
		try {
			pacientes = em.createQuery("FROM Paciente c").getResultList();
			
		} catch (Exception e) {
			System.err.println(e);
		}finally {
			em.close();
		}
		return pacientes;
	}
//-----------------------------------------------------------------------------------------
	
	public Paciente remover(Integer id) {
		EntityManager em = new ConectionFactory().getConnection();
		
		Paciente paciente = null;
		
		try {
			paciente = em.find(Paciente.class, id);
			em.getTransaction().begin();
			em.remove(paciente);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			System.err.println(e);
		}finally {
			em.close();
		}
		return paciente;
	}
//-----------------------------------------------------------	
	
	
	
}
