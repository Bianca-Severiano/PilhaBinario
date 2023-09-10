package controller;

import Model.PilhaInt;

public class ControllerBinarioPilhas {
	PilhaInt p = new PilhaInt();

	public ControllerBinarioPilhas() {
		super();
	}

	public String ConverteController(int dado) throws Exception { //Metodo 1
		int res = 0;
		// Carrega pilha
		if (dado == 0) {
			return "0";
		} else {
			while (dado != 0) {
				if (dado % 2 == 0) {
					res = 0;
				} else {
					res = 1;
				}
				p.push(res);
				dado = dado / 2;
			}

			// Concatena resultado
			String resultado = "";
			while (!p.isEmpty()) {
				resultado = resultado + p.pop();
			}
			return resultado;
		}
	}

	public String decToBin(int dado) throws Exception { //Método 2
		String resultado = "";
		if (dado == 0) {
			return Integer.toString(p.pop());
		} else {
			if (dado % 2 == 0) {
				p.push(0);
			} else {
				p.push(1);
			}
			resultado = decToBin(dado / 2);
			if(!p.isEmpty()) {
				resultado = resultado + p.pop();
			}
		}
		return resultado;

	}

}
