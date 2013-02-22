package br.com.unichristus;

public class Complexidade {
	Gerador gerador = new Gerador();
	Ordenacao ord = new BubbleSort();
	final int MAX = 10000;

	public void complexBubble() {
		for (int i = 1000; i <= MAX; i = i + 1000) {
			System.out.println("\nVETOR ");
			ord.ordenarAnalisar(gerador.gerarConjunto(MAX));
		}

	}
	public void complexInsertion() {
		for (int i = 1000; i <= MAX; i = i + 1000) {
			System.out.println("\nVETOR ");
			ord.ordenarAnalisar(gerador.gerarConjunto(MAX));
		}

	}
	
	public void complexSelection(){
		for (int i = 1000; i <= MAX; i = i + 1000) {
			System.out.println("\nVETOR " + i);
			ord.ordenarAnalisar(gerador.gerarConjunto(MAX));
		}
	}
	public void complexShell(){
		for (int i = 1000; i <= MAX; i = i + 1000) {
			System.out.println("\nVETOR " + i);
			ord.ordenarAnalisar(gerador.gerarConjunto(i));
		}
	}
	public void complexMerge(){
		for (int i = 1000; i <= MAX; i = i + 1000) {
			System.out.println("\nVETOR " + i);
			ord.ordenarAnalisar(gerador.gerarConjunto(MAX));
		}
	}
	public void complexQuick(){
		for (int i = 1000; i <= MAX; i = i + 1000) {
			System.out.println("\nVETOR " + i);
			ord.ordenarAnalisar(gerador.gerarConjunto(i));
		}
	}
	public void complexHeap(){
		for (int i = 1000; i <= MAX; i = i + 1000) {
			System.out.println("\nVETOR " + i);
			ord.ordenarAnalisar(gerador.gerarConjunto(i));
		}
	}

}
