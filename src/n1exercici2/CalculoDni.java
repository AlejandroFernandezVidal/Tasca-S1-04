package n1exercici2;

public class CalculoDni {
	
	public static String obtenerLetra (int numeroDni) {
		String letraDni;
		final int DIVISOR = 23;
		int resultado;
		String letras[] = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		
		resultado = numeroDni % DIVISOR;
		letraDni = letras[resultado];
	
		return letraDni;
	}
}