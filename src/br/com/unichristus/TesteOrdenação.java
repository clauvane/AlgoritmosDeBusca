package br.com.unichristus;


public class TesteOrdenação {

	public static void main(String[] args) {

		Complexidade complex = new Complexidade();
		System.out.println("\nBUBLE SORT");
		complex.complexBubble();
		System.out.println("\nMERGE SORT");
		complex.complexMerge();
		System.out.println("\nQUICK SORT");
		complex.complexQuick();
		System.out.println("\nINSERTION SORT");
		complex.complexInsertion();
		System.out.println("\nSELECTION SORT");
		complex.complexSelection();
		System.out.println("\nSHELL SORT");
		complex.complexShell();
		System.out.println("\nHEAP SORT");
		complex.complexHeap();
	}

}
