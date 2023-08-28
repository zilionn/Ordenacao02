package view;

import controller.Ordena;

public class Principal {

	public static void main(String[] args) {
		Ordena ord = new Ordena();
		
		int[] vet = {44, 43, 42, 41, 40, 39, 38};
		
		ord.ordenaBubble(vet);
		ord.ordenaMerge(vet);
	}
}
