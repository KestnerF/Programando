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
		
		
		JOptionPane.showMessageDialog(null, "Divisao para pessoas deu " + divisao + " carros e sobrou " + resto +" carros");
	}

}
