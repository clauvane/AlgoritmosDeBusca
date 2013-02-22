package br.com.unichristus;

public class BubbleSort extends Ordenacao {

	public void ordenar(int[] x) {
		boolean houveTroca = true;
		while (houveTroca) {
			houveTroca = false;
			for (int i = 0; i < (x.length) - 1; i++) {
				comparacoes++;
				if (x[i] > x[i + 1]) {
					troca++;
					int variavelAuxiliar = x[i + 1];
					x[i + 1] = x[i];
					x[i] = variavelAuxiliar;
					houveTroca = true;
				}
			}
		}

	}

}
