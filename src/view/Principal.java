package view;

import javax.swing.JOptionPane;

import controller.ControllerBinarioPilhas;

public class Principal {

	public static void main(String[] args) throws Exception {
		
		ControllerBinarioPilhas cp = new ControllerBinarioPilhas();
		int valor;
		do {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Digite valor para convertê-lo para binário (precisa ser menor que 1000)"));
		} while (valor > 1000);
		
		
		try {
			System.out.print(valor + " em binário é: " + cp.ConverteController(valor));	
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
			
	}

}
