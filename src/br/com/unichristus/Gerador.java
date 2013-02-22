package br.com.unichristus;

import java.util.ArrayList;
import java.util.Collections;

public class Gerador {
	public int[] gerarConjunto(int num) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < num; i++) {
			array.add(i);
		}
		Collections.shuffle(array);// Embaralhamos os números
		int vetor[] = new int[num];
		for (int i = 0; i < num; i++) {// Mostrando aleatórios
			vetor[i] = array.get(i);
		}
		return vetor;
	}

}
