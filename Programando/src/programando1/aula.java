package programando1;

public class aula {

	/* main e um metodo auto executavel em Java */
	public static void main(String[] args) {

		int nota1 = 70;
		int nota2 = 70;
		int nota3 = 70;
		int nota4 = 70;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		/* SWITCH CASE: OPERA��ES EXATAS */
		switch (media) {
		case 70:
			System.out.println("Aluno aprovado");
			break;
		
			
		default: System.out.println("Outro valor" + media);
			break;
		}
	
		}

	}
