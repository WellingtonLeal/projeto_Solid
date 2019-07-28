package br.com.clinica.conection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConectionFactory {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("clinica");
	
	public EntityManager getConnection() {
		
		return emf.createEntityManager();
		
	}
}
