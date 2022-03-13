package programando1.classes;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {

	
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculadoString;
	private List <Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	
	public void setDisciplinas(List<Disciplina> disciplina) {
		
	}
	
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	
	}
	
	public Aluno (String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	
	}
	/*Veremos o metodos SETTERS e GETTERS do objeto*/
	/*SET e para adicionar ou receber dados para os atributos*/
	/*GET e para resgatar ou obter o valor do atributo*/
	
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	
	public String getNome() {
		return nome;
	}
}
