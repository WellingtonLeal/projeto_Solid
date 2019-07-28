package br.com.clinica.teste;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import br.com.clinica.Agendamento;
import br.com.clinica.Paciente;
import br.com.clinica.dao.AgendamentoDAO;

public class TesteAgendamento {

	public static void main(String[] args) throws Exception{
		
		
		
//TESTE SALVAR ----------------------------------------------		
		//DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		//AgendamentoDAO dao = new AgendamentoDAO();
		//Agendamento agendamento = new Agendamento();
		//Paciente paciente = new Paciente();
		//paciente.setIdPaciente(1);
		
		//agendamento.setDataAgendamento(df.parse("01/07/2019 09:00"));
		//agendamento.setPaciente(paciente);
		
		//dao.salvar(agendamento);
//-------------------------------------------------------------

//TESTE EDITAR MEDICO------------------------------------------	
	
		//DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		//Agendamento agendamento = new Agendamento();
			
		//AgendamentoDAO dao = new AgendamentoDAO();
			
		//Paciente paciente = new Paciente();
		//paciente.setIdPaciente(1);
			
		//agendamento.setIdAgendamento(7);
		//agendamento.setDataAgendamento(df.parse("02/07/2019 16:00"));
		//agendamento.setPaciente(paciente);
							
		//dao.editar(agendamento);
//--------------------------------------------------
	
//TESTE BUSCAR POR ID--------------------------------------------
		
		//AgendamentoDAO dao = new AgendamentoDAO();
				
		//Agendamento agendamento = dao.buscaPorId(6);
				
		//System.out.println("Data da agendamento: " +agendamento.getDataAgendamento());
		//System.out.println("Paciente: " +agendamento.getPaciente().getNomePaciente());
				

//TESTE LISTAR TODOS----------------------------------------------------
				
		//AgendamentoDAO dao = new AgendamentoDAO();
				
				
		//for(Agendamento agendamento : dao.listar()) {
					
		//System.out.println("Data do Agendamento: " +agendamento.getDataAgendamento());
		//System.out.println("Paciente: " +agendamento.getPaciente().getNomePaciente());
		//System.out.println("Telefone : " +agendamento.getPaciente().getTelefonePaciente());
		//System.out.println("Data da Consulta: " +agendamento.getConsulta().getDataConsulta());
		//System.out.println("Médico: " +agendamento.getConsulta().getMedico().getNomeMedico());
		//System.out.println("Especialidade: " +agendamento.getConsulta().getMedico().getEspecialidade());
		//System.out.println("----------------------------------------------------------");
					
		//}
//TESTE DE REMOVER -------------------------------------
				
		//AgendamentoDAO dao = new AgendamentoDAO();
				
		//dao.remover(6);
		

	}

}
