package main;

public class MainRecursivo {

	/**
	 * Método main: exemplo de recursão
	 */
	public static void main(String[] args) {
		System.out.println("o resultado de 2 elevado à 3 é: " + calculaPotenciaRecursivo(2, 3));
	}
	
	/**
	 * Método recursivo de potênciação
	 */
	public static int calculaPotenciaRecursivo(int base, int expoente) {
		if(expoente>1)
			return base * calculaPotenciaRecursivo(base, expoente-1);
		if(expoente==1)
			return base;
		return 0;
	}

	/**
	 * Método de potênciação
	 */
	public static int calculaPotencia(int base, int expoente) {
		return (int) Math.pow(base, expoente);
	} 
}
