package br.com.unichristus;

public class HeapSort extends Ordenacao {

	public void ordenar(int[] v) {
		buildMaxHeap(v);
		int n = v.length;

		for (int i = v.length - 1; i > 0; i--) {
			swap(v, i, 0);
			maxHeapify(v, 0, --n);
		}

	}
	public void buildMaxHeap(int[] v) {
		for (int i = v.length / 2 - 1; i >= 0; i--)
			maxHeapify(v, i, v.length);
	}
	public void maxHeapify(int[] v, int pos, int n) {
		int maxi;
		int l = 2 * pos + 1;
		int right = 2 * pos + 2;

		if ((l < n) && (v[l] > v[pos])) {
			comparacoes++;
			maxi = l;
		} else {
			maxi = pos;
		}
		if (right < n && v[right] > v[maxi]) {
			comparacoes++;
			maxi = right;
		}
		if (maxi != pos) {
			swap(v, pos, maxi);
			maxHeapify(v, maxi, n);
		}
	}

	public void swap(int[] v, int j, int aposJ) {
		troca++;
		int aux = v[j];
		v[j] = v[aposJ];
		v[aposJ] = aux;
	}

}
