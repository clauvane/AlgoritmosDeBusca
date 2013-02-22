package br.com.unichristus;

public class InsertionSort extends Ordenacao {

	public void ordenar(int[] x) {
		for (int i = 1; i < x.length; i++) {
			int a = x[i];
			int j;
			for (j = i - 1; j >= 0 && x[j] > a; j--) {
				troca++;
				comparacoes++;
				x[j + 1] = x[j];
				x[j] = a;
			}
		}

	}

//	public static void main(String[] args) {
//
//		int element[] = { 06, 22, 10, 16, 01, 10, 05, 12};
//		int chave;
//		int i;
//
//		for (int j = 1; j < element.length; j++) {
//			chave = element[j];
//			i = j - 1;
//			while (i >= 0 && element[i] > chave) {
//				element[i + 1] = element[i];
//				i = i - 1;
//			}
//			element[i + 1] = chave;
//		}
//
//		// imprime todos os elementos da lista reordenada
//		for (int j = 0; j < element.length; j++) {
//			System.out.print(element[j] + ", ");
//		}
//	}

}
