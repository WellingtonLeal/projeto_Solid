package br.com.clinica.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.clinica.Consulta;
import br.com.clinica.conection.ConectionFactory;

public class ConsultaDAO {

	
public Consulta salvar(Consulta consulta) {
		
		EntityManager em = new ConectionFactory().getConnection();
		
		try {
			em.getTransaction().begin();
			em.persist(consulta);
			em.getTransaction().commit();
			
			
		} catch (Exception e) {
			System.err.println(e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		return consulta;
	}
//------------------------------------------------------------------------------
public Consulta buscaPorId(Integer id) {
	
	EntityManager em = new ConectionFactory().getConnection();
	Consulta consulta = null;
	
	try {
		consulta = em.find(Consulta.class, id);
		
	} catch (Exception e) {
		System.err.println(e);
	}finally {
		em.close();
	}
	
	return consulta;
	
}
//------------------------------------------------------------------------------------

public Consulta editar(Consulta consulta) {
	
	EntityManager em = new ConectionFactory().getConnection();
	
	try {
		em.getTransaction().begin();
		em.merge(consulta);
		em.getTransaction().commit();
		
		
	} catch (Exception e) {
		System.err.println(e);
		em.getTransaction().rollback();
	}finally {
		em.close();
	}
	return consulta;
}
//---------------------------------------------------------------------------------------

public List<Consulta> listar(){
	EntityManager em = new ConectionFactory().getConnection();
	
	List<Consulta> consultas = null;
	
	try {
		
		consultas = em.createQuery("from Consulta").getResultList();
	} catch (Exception e) {
		System.err.println(e);
	}finally {
		em.close();
	}
	return consultas;
}
//--------------------------------------------------------------

public Consulta remover(Integer id) {
	
	EntityManager em = new ConectionFactory().getConnection();
	
	Consulta consulta = null;
	
	try {
		consulta = em.find(Consulta.class, id);
		em.getTransaction().begin();
		em.remove(consulta);
		em.getTransaction().commit();
				
		
	} catch (Exception e) {
		System.err.println(e);
		em.getTransaction().rollback();
	}finally {
		em.close();
	}
	
	return consulta;
}
}
