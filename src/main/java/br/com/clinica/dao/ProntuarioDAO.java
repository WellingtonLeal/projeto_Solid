package br.com.clinica.dao;


import javax.persistence.EntityManager;


import br.com.clinica.Prontuario;
import br.com.clinica.conection.ConectionFactory;

public class ProntuarioDAO {
	
	public Prontuario salvar(Prontuario prontuario) {
		
		EntityManager em = new ConectionFactory().getConnection();
		
		try {
			em.getTransaction().begin();
			em.persist(prontuario);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			System.err.println(e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		return prontuario;
		
	}
//-----------------------------------------------------------------	
	public Prontuario editar(Prontuario prontuario) {
		EntityManager em = new ConectionFactory().getConnection();
		
		try {
			em.getTransaction().begin();
			em.merge(prontuario);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			System.err.println(e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		
		return prontuario;
	}
//---------------------------------------------------------------------
	
		public Prontuario remover(Integer id) {
			EntityManager em = new ConectionFactory().getConnection();
			
			Prontuario prontuario = null;
			
			try {
				prontuario = em.find(Prontuario.class, id);
				em.getTransaction().begin();
				em.remove(prontuario);
				em.getTransaction().commit();
				
			} catch (Exception e) {
				System.err.println(e);
			}finally {
				em.close();
			}
			return prontuario;
		}
//-----------------------------------------------------------------------------	


}
