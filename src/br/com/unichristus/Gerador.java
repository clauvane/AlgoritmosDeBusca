package br.com.unichristus;

import java.util.ArrayList;
import java.util.Collections;

public class Gerador {
	public int[] gerarConjunto(int num) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < num; i++) {
			array.add(i);
		}
		Collections.shuffle(array);// Embaralhamos os n�meros
		int vetor[] = new int[num];
		for (int i = 0; i < num; i++) {// Mostrando aleat�rios
			vetor[i] = array.get(i);
		}
		return vetor;
	}

}
