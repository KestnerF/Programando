package programando1;

public class aula {

	/* main e um metodo auto executavel em Java */
	public static void main(String[] args) {

		/* Estrutura de repeticao FOR e continue*/

		for (int numero = 0; numero <= 10; numero ++) {
			if (numero == 3 || numero == 6 || numero == 9) {
				
				System.out.println("obaa, encontrei o numero " + numero);
				continue;
			}
			
		}

	}

}
