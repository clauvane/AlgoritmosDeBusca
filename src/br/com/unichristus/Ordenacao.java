package br.com.unichristus;

public abstract class Ordenacao {
	public int troca;
	public int comparacoes;

	public abstract void ordenar(int x[]);

	public void ordenarAnalisar(int x[]) {
		troca = 0;
		comparacoes = 0;
		long tempoInicial = System.currentTimeMillis();
		ordenar(x);
		long tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo: "+(tempoFinal - tempoInicial) / 1000d);
		System.out.println("Comparações: " + comparacoes);
		System.out.println("Troca: " + troca);
		System.out.println("Tamanho do Vetor: " + x.length);
	}

}
