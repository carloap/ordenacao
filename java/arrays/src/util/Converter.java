package util;

import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Instancia um novo objeto de Converter&lt;T&gt; com um tipo (classe ou interface) genérico.
 * @author cpereira
 * @param <T>
 */
public class Converter<T> {
	/**
	 * Atributo reflect
	 */
    private Class<T> instance;
	
	/**
	 * Construtor
	 */
	public Converter() {
	}

	
	
	
	/**
	 * Cria uma lista com tamanho fixo a partir de uma array.
	 * @param array
	 * @return
	 */
	public List<T> deUmaArray(T[] array) {
		List<T> list = Arrays.asList(array);
		return list;
	}
	
	
	/**
	 * Cria uma nova lista e insere os valores de uma array, percorrendo-a.
	 * @param array
	 * @return
	 */
	public List<T> percorrendoArray(T[] array) {
		List<T> list = new ArrayList<T>();
		for (T string : array) {
			list.add(string);
		}
		return list;
	}
	
	
	/**
	 * Transforma uma Lista gerérica em uma array genérica, a partir do reflection do tipo genérico especificado.<br><br>
	 * <b>Exemplo:</b> <br>
	 * Se for instanciado esta classe como Converter&lt;String&gt;, <br>
	 * então esse método criará uma instância imutável desse &lt;String&gt; com o tamanho da Lista. <br>
	 * <br>
	 * <b>Logo:</b> Array.newInstance(INSTÂNCIA, TAMANHO DA LISTA);
	 * 
	 * @param list
	 * @return
	 */
	public T[] deUmaLista(List<T> list) {
		System.out.println(instance);
		
		@SuppressWarnings("unchecked")
		final T[] result = (T[]) Array.newInstance(instance.getClass(), list.size());
		return list.toArray(result);
	}
	
	
	
	
	
}
