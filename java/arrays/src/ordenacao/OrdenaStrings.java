package ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import util.Converter;

public class OrdenaStrings {

	
	/**
	 * Ordena uma lista de Strings utilizando um Comparator<>
	 * @param sArray
	 * @return
	 */
	public static String[] ordenaLista(String[] sArray) {
		Converter<String> converte = new Converter<String>();
		List<String> lista = converte.deUmaArray(sArray); 
		
		Collections.sort(lista, String.CASE_INSENSITIVE_ORDER);
		
		
		
		
		// Transforma a lista em uma array de Strings e retorna
		String[] result = new String[lista.size()];
		return lista.toArray(result);
	}
	
	
	
	/**
	 * Utiliza algoritmo de ordenação bubbleSort
	 * @param sArray
	 * @return
	 */
	public static String[] bubbleSort(String[] sArray) {		
		for(int i=0, size=sArray.length; i<size; i++) {
			for(int j=i+1; j<size; j++) {
				if(compare(sArray[i], sArray[j])>0){
					String tmp = sArray[i];
					sArray[i] = sArray[j];
					sArray[j] = tmp;
				}
			}
		}
		return sArray;
	}
	
	/**
	 * Compara a diferença entre duas strings, ou se uma delas for nula.
	 * @param str1
	 * @param str2
	 * @return
	 */
	private static int compare(String str1, String str2) {
		if( str1 == str2 ) return 0;
        if( str1 == null ) return 1;
        if( str2 == null ) return -1;
        return str1.compareTo( str2 );
	}
	
}
