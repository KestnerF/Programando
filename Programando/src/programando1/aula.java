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

		/* Opera��es logicas aninhadas: S�o operacoes dentro de opera�oes */

		if (media >= 50) {
			if (media >= 70) {
				System.out.println("Aluno esta aprovado direto");
			}
		} else {
			System.out.println("Aluno esta em recupera�ao");
		}

	}
}