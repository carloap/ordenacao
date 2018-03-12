package main;

import ordenacao.OrdenaStrings;

public class MainOrdenaStrings {

	public static void main(String[] args) {
		// Array de Strings que precisa ser ordenada
		String[] strings = {"Aline Barros", "Ana Paula", "Robiscleverson dos Santos", "Anna Belle", "Paulinho Sanchez", 
				"Beirutte Soares", "Catarina Consuelo", "Pedrosa de Oliveira", "Hector Haviolli"};
		
		System.out.println("Array antes: ");
		for (String string : strings) {
			System.out.print(" | "+string);
		}
		
		System.out.println();
		
		// retorna a array de Strings ordenada e pronta para imprimir...
		System.out.println("Array depois: ");
		String[] stringsOrdenadas = OrdenaStrings.ordenaLista(strings);
		for (String string : stringsOrdenadas) {
			System.out.print(" | "+string);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
