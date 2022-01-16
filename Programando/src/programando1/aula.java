package programando1;

import javax.swing.JOptionPane;

public class aula {

	/* main e um metodo auto executavel em Java */
	public static void main(String[] args) {

		/* ENTRADA DE DADOS*/
		
		String carros = JOptionPane.showInputDialog("informe a quantidade de carros?"); 
		String pessoas = JOptionPane.showInputDialog("informe a quantidade de pessoas?");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNumero / pessoaNumero);
		
		double resto = carroNumero % pessoaNumero;
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisao?");
		
		if(resposta == 0) {
			JOptionPane.showMessageDialog(null, "Divisao para pessoas deu " + divisao );
		}else { 
			System.out.println("nao quiz ver o resultado");
		}
		
	
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divisao?");
		
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "o resto da divisao e  " + resto );
		}else { 
			System.out.println("nao quiz ver o resultado");
		}
		
	}

}
