package controller;

import fernando.fatec.br.bubble.BubbleSort;
import fernando.fatec.br.merge.MergeSort;

public class Ordena {

	public Ordena() {
		super();
	}

	public void ordenaBubble(int[] vetor) {
		BubbleSort bubble = new BubbleSort();
		vetor = bubble.bubbleSort(vetor);
		
		System.out.print("Ordenado por bubble: ");
		for (int valor : vetor) {	
			System.out.print(valor + " ");
		}	
			
	}
	
	
	public void ordenaMerge(int [] vetor) {
		MergeSort merge = new MergeSort();
		int tamanho = vetor.length;
		vetor = merge.mergeSort(vetor, 0, tamanho - 1);
		
		System.out.print("\nOrdenado por merge: ");
		for(int valor : vetor) {
			System.out.print(valor + " ");
		}
	}
}
