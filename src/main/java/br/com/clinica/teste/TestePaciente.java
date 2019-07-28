package br.com.clinica.teste;

import br.com.clinica.Paciente;
import br.com.clinica.dao.PacienteDAO;

public class TestePaciente {
	
	
	public static void main (String[] args) {
		
		
		// TESTE SALVAR PACIENTE ------------------------
				
				
				//Paciente p = new Paciente();
				//p.setNomePaciente("teste Lemos");
				//p.setEmailPaciente("wanessa@gmail.com");
				//p.setTelefonePaciente("83 555555");
				
				//PacienteDAO dao = new PacienteDAO();		
				//dao.salvar(p);
		// -----------------------------------------------------		
				
				
				
		// TESTE EDITAR PACIENTE ------------------------------		
				
				  //Paciente p = new Paciente();
				  //p.setIdPaciente(1);
				  //p.setNomePaciente("Wellington Lemos");
				  //p.setEmailPaciente("wellington@gmail.com");
				  //p.setTelefonePaciente("83 555555"); 
				  //PacienteDAO dao = new PacienteDAO(); 
				  //dao.editar(p);
		// ----------------------------------------------------------------------
			
		// TESTE BUSCAR POR ID --------------------------------------------------
						
				//PacienteDAO dao = new PacienteDAO();		
				//Paciente p = dao.buscarPorId(1);
				//System.out.println("Paciente: " + p.getNomePaciente());
				//System.out.println("Paciente: " + p.getEmailPaciente());
				//System.out.println("Paciente: " + p.getTelefonePaciente());
		//--------------------------------------------------------------------------				

		// TESTE BUSCAR TODOS --------------------------------------------------

				//PacienteDAO dao = new PacienteDAO();
				
				//for(Paciente p: dao.buscarTodos()) {
				//	System.out.println("Pacientes: " +p.getNomePaciente() + " - " + "Telefone: " +p.getTelefonePaciente());
				//}
		//---------------------------------------------------------------------------------		
				
		// TESTE DE REMOVER ---------------------------------------------------------------		
				//PacienteDAO dao = new PacienteDAO();
				//dao.remover(4);
		//---------------------------------------------------------------------------------		
				
	}

}
