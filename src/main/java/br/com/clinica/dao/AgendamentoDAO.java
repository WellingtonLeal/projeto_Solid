package br.com.clinica.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.clinica.Agendamento;
import br.com.clinica.Consulta;
import br.com.clinica.conection.ConectionFactory;

public class AgendamentoDAO {
	
//------------------------------------------------------------------------------------	
	public Agendamento salvar(Agendamento agendamento) {
		
		EntityManager em = new ConectionFactory().getConnection();
		
		try {
			em.getTransaction().begin();
			em.persist(agendamento);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			System.out.println(e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		return agendamento;
	}
//----------------------------------------------------------------------------------	

	public Agendamento buscaPorId(Integer id) {
		
		EntityManager em = new ConectionFactory().getConnection();
		Agendamento agendamento = null;
		
		try {
			agendamento = em.find(Agendamento.class, id);
			
		} catch (Exception e) {
			System.err.println(e);
		}finally {
			em.close();
		}
		
		return agendamento;
	}
	
//----------------------------------------------------------------------------------------
	
	public Agendamento editar(Agendamento agendamento) {
		
		EntityManager em = new ConectionFactory().getConnection();
		
		try {
			em.getTransaction().begin();
			em.merge(agendamento);
			em.getTransaction().commit();
			
			
		} catch (Exception e) {
			System.err.println(e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		return agendamento;
	}
//-----------------------------------------------------------------------
	public List<Agendamento> listar(){
		EntityManager em = new ConectionFactory().getConnection();
		
		List<Agendamento> agendamento = null;
		
		try {
			
			agendamento = em.createQuery("from Agendamento").getResultList();
		} catch (Exception e) {
			System.err.println(e);
		}finally {
			em.close();
		}
		return agendamento;
	}
//------------------------------------------------------------------------

	public Agendamento remover(Integer id) {
		
		EntityManager em = new ConectionFactory().getConnection();
		
		Agendamento agendamento = null;
		
		try {
			agendamento = em.find(Agendamento.class, id);
			em.getTransaction().begin();
			em.remove(agendamento);
			em.getTransaction().commit();
					
			
		} catch (Exception e) {
			System.err.println(e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		
		return agendamento;
	}
	
}
