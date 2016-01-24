package br.com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
		String[] stringsOrdenadas = ordenaStrings(strings);
		for (String string : stringsOrdenadas) {
			System.out.print(" | "+string);
		}
	}
	
	
	public static String[] ordenaStrings(String[] sArray) {		
		bubble1:for(int i=0, size=sArray.length; i<size; i++) {
			bubble2:for(int j=i+1; j<size; j++) {
				if(compare(sArray[i], sArray[j])>0){
					String tmp = sArray[i];
					sArray[i] = sArray[j];
					sArray[j] = tmp;
				}
			}
		}
		return sArray;
	}
	
	public static String[] ordenaStrings2(String[] sArray) {
		List<String> lista = new ArrayList<String>();
		for (String string : sArray) {
			lista.add(string);
		}
		
		Collections.sort(lista, String.CASE_INSENSITIVE_ORDER);
		
		// Transforma a lista em uma array de Strings e retorna
		String[] result = new String[lista.size()];
		return lista.toArray(result);
	}
	
	
	/**
	 * Usando Arrays.sort tudo parece fácil...
	 * @param sArray
	 * @return
	 * @deprecated
	 */
	public static String[] ordenaStringsRapidao(String[] sArray) { 
		Arrays.sort(sArray);
		return sArray;
	}
	
	private static int compare(String str1, String str2) {
		if( str1 == str2 ) return 0;
        if( str1 == null ) return 1;
        if( str2 == null ) return -1;
        return str1.compareTo( str2 );
	}
	
}
