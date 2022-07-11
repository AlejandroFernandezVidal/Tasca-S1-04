package n1exercici3;

import org.junit.jupiter.api.Test;

class ExcepcionTest {
	
	@Test//(expected = ArrayIndexOutOfBoundsException.class)
	void testNumeroMayor(){
		try {
		Excepcion.numeros();
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		 }	
	}
}