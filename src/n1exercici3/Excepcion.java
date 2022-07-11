package n1exercici3;

public class Excepcion {
	
	public static void numeros() throws ArrayIndexOutOfBoundsException{
		int numeros[] = {0,1,2,3};
	
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		throw new ArrayIndexOutOfBoundsException("Capturada excepcion ArrayIndexOutOfBounds");
	}
}