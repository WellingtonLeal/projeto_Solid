package br.com.clinica.dao;

import javax.persistence.EntityManager;

import br.com.clinica.Exame;
import br.com.clinica.Medico;
import br.com.clinica.conection.ConectionFactory;

public class ExameDAO {

	public Exame salvar(Exame exame) {
		
		EntityManager em = new ConectionFactory().getConnection();
		
		try {
			em.getTransaction().begin();
			em.persist(exame);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			System.err.println(e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		return exame;
		
	}
//-----------------------------------------------------------------	
	public Exame editar(Exame exame) {
		EntityManager em = new ConectionFactory().getConnection();
		
		try {
			em.getTransaction().begin();
			em.merge(exame);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			System.err.println(e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		
		return exame;
	}
//---------------------------------------------------------------------
	
		public Exame remover(Integer id) {
			EntityManager em = new ConectionFactory().getConnection();
			
			Exame exame = null;
			
			try {
				exame = em.find(Exame.class, id);
				em.getTransaction().begin();
				em.remove(exame);
				em.getTransaction().commit();
				
			} catch (Exception e) {
				System.err.println(e);
			}finally {
				em.close();
			}
			return exame;
		}
//-----------------------------------------------------------------------------	

}
