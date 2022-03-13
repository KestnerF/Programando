package programando1;

import programando1.classes.Aluno;

public class aula {

	/* main e um metodo auto executavel em Java */
	public static void main(String[] args) {

		/*Objeto ainda nao existe na memoria*/
		/*Aluno aluno1;*/
	/*-------------------------------------------------*/
		/*Agora temos um objeto real na memoria*/
		Aluno aluno1 = new Aluno(); /*aqui sera joao*/
		aluno1.setNome("joao");
		
		System.out.println("Nome e = " + aluno1.getNome());
		
		Aluno aluno2 = new Aluno(); /*aqui sera Pedro*/
		
		Aluno aluno3 = new Aluno(); /*aqui sera o alex*/
		
		
	}

}
