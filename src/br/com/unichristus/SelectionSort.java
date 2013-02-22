package br.com.unichristus;

public class SelectionSort extends Ordenacao {
	@Override
	public void ordenar(int[] v) {
		int index_min, aux;

		for (int i = 0; i < v.length; i++) {
			index_min = i;
			comparacoes++;
			for (int j = i + 1; j < v.length; j++) {
				if (v[j] < v[index_min]) {
					index_min = j;
				}
			}
			if (index_min != i) {
				troca++;
				aux = v[index_min];
				v[index_min] = v[i];
				v[i] = aux;
			}
		}
	}

}
