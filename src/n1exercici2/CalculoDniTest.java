package n1exercici2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculoDniTest {

 @ParameterizedTest

@CsvSource({"49273835,S","82701494,A","14948260,P","27379177,T","27337167,B","58804268,F","24573108,T","87446252,E","46809578,R","24548790,Q"})
 void testCalculoDni(int numeroDni, String letraDni) {
	 String letraEsperada = CalculoDni.obtenerLetra(numeroDni);
	 assertEquals(letraDni, letraEsperada);
 }
}