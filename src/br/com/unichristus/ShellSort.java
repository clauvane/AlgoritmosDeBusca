package br.com.unichristus;

public class ShellSort extends Ordenacao {

	public void ordenar(int[] x) {
		int n = x.length;
		int h = n / 2;
		int c, j;
		while (h > 0) {
			comparacoes++;
			for (int i = h; i < n; i++) {
				c = x[i];
				j = i;
				troca++;
				while (j >= h && x[j - h] > c) {
					x[j] = x[j - h];
					j = j - h;
				}
				x[j] = c;
			}
			h = h / 2;
		}
	}

}
