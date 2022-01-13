package programando1;

public class aula {

	/* main e um metodo auto executavel em Java */
	public static void main(String[] args) {

		int nota1 = 90;
		int nota2 = 60;
		int nota3 = 90;
		int nota4 = 80;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		/*condições logica com IF e ELSE*/
		/*
		if (media >= 70) {
			System.out.println("Aluno aprovado: " + media);

		} else if (media >= 40 && media <= 69) {
			System.out.println("Aluno em recupeção:" + media);
		} else {
			System.out.println("Aluno reprovado:" + media);
		} */
		
	/*Operadores ternários são para micro validações*/	
		String saidaResultado;
		
		saidaResultado = media >= 70 ? "Aluno Aprovado" : (media >= 40 && media <= 69) ? "Aluno em Recuperacao" :"Aluno Reprovado";
		
		System.out.println(saidaResultado);
		
		
		
		
	
	}
}