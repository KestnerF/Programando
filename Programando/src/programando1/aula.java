package programando1;

public class aula{ 
	
	/* main e um metodo auto executavel em Java */
	public static void main(String[] args) {
	
	
	int mediaAluno = 70;
	String nome = "Junior";
	
	
	if (mediaAluno >= 70 && nome.equals("Alex")) {
		System.out.println("Parabens voce esta aprovado");	
	     }else if (mediaAluno < 70) {
		System.out.println("voce foi reprovado");
	     } else {
	            	 System.out.println("Aluno não encontrado");
	             
	             }
	

	
	}
}