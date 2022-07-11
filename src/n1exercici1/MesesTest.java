package n1exercici1;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MesesTest {

	@Test
	void testDimensionArray() {
	
		int resultado = Meses.guardarMes().size();
		int esperado = 12;
		
		assertEquals(esperado, resultado);
	}
	@Test
	void testNotNull() {
		assertNotNull(Meses.guardarMes());
	}
	@Test
	void testMesAgosto() {
		String resultado = Meses.guardarMes().get(7);
		String esperado = "Agosto";
		
		assertEquals(esperado,resultado);
	}
}