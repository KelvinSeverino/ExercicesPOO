package br.fatec.engine;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Start {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Agenda a =  new Agenda();
		int sair = 1;
		while(sair != 0)
		{
			int opcao = Integer.parseInt(JOptionPane.showInputDialog("Agenda Eletr�nica FATEC\n1 - Cadastro de contatos\n2 - Exibir Contatos\n3 - Editar Contatos\n4 - Deletar Contatos\n5 - Criar Arquivo txt\n6 - Importar Arquivo\n0 - SAIR"));
			switch(opcao)
			{			
			case 1:
				int escolhaC = Integer.parseInt(JOptionPane.showInputDialog("Cadastro de contatos!\nInsira:\n1 para cadastrar Professores:\n2 para cadastrar Alunos: "));
				if(escolhaC == 1)
				{
					a.cadastroProfessor();
				}
				if(escolhaC == 2)
				{
					a.cadastroAluno();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "ERROR! Insira um valor correto!");
				}
				break;
			case 2:
				int escolhaE = Integer.parseInt(JOptionPane.showInputDialog("Exibi��o de contatos!\nInsira:\n1 para Exibir dados dos Professores:\n2 para Exibir Alunos: "));
				if(escolhaE == 1)
				{
					a.listarTodosProfessores();
				}
				if(escolhaE == 2)
				{
					a.listarTodosAlunos();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "ERROR! Insira um valor correto!");
				}
				break;
			case 3:
				int escolhaEdit = Integer.parseInt(JOptionPane.showInputDialog("Edi��o de contatos!\nInsira\n1 para Exibir dados dos Professores:\n2 para Exibir Alunos: "));
				if(escolhaEdit == 1)
				{
					a.edicaoProfessores();
				}
				if(escolhaEdit == 2)
				{
					a.edicaoAlunos();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "ERROR! Insira um valor correto!");
				}
				break;
			case 4:
				int escolhaD = Integer.parseInt(JOptionPane.showInputDialog("Exclus�o de contatos!\nInsira\n1 para Exibir dados dos Professores:\n2 para Exibir Alunos: "));
				if(escolhaD == 1)
				{
					a.removerProf();;
				}
				if(escolhaD == 2)
				{
					a.removerAlunos();;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "ERROR! Insira um valor correto!");
				}
				break;
			case 5:
				a.criarArquivo();
				break;
			case 6:
				a.lerArquivo();
				break;
			case 0:
				sair = 0;
				break;				
			}
		}
	}
}