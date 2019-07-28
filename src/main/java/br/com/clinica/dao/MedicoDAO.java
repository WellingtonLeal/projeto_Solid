package br.com.clinica.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.clinica.Medico;
import br.com.clinica.Paciente;
import br.com.clinica.conection.ConectionFactory;

public class MedicoDAO {
	
	
	public Medico salvar(Medico medico) {
		
		EntityManager em = new ConectionFactory().getConnection();
		
		try {
			em.getTransaction().begin();
			em.persist(medico);
			em.getTransaction().commit();
			
			
		} catch (Exception e) {
			System.out.println(e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		return medico;
	}
//-----------------------------------------------------------------------------
	
	public Medico editar(Medico medico) {
		EntityManager em = new ConectionFactory().getConnection();
		
		try {
			em.getTransaction().begin();
			em.merge(medico);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			System.err.println(e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		
		return medico;
	}
//-----------------------------------------------------------------------------------
	
	public Medico buscarId(Integer id) {
		EntityManager em = new ConectionFactory().getConnection();
		
		Medico medico = null;
		
		try {
			
			medico = em.find(Medico.class, id);
			
			
		} catch (Exception e) {
			System.err.println(e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		return medico;
					
	}
//---------------------------------------------------------------------	
	
	public List<Medico> listarTodos(){
		
		EntityManager em = new ConectionFactory().getConnection();
		
		List<Medico> medicos = null;
		
		try {
			medicos = em.createQuery("FROM Medico m").getResultList();
			
		} catch (Exception e) {
			System.out.println(e);
		
		}finally {
			em.close();
		}
		return medicos;		
	}
//---------------------------------------------------------------------
	
	public Medico remover(Integer id) {
		EntityManager em = new ConectionFactory().getConnection();
		
		Medico medico = null;
		
		try {
			medico = em.find(Medico.class, id);
			em.getTransaction().begin();
			em.remove(medico);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			System.err.println(e);
		}finally {
			em.close();
		}
		return medico;
	}
//-----------------------------------------------------------------------------	

}
