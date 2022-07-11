package n2exercici1;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

class ContarLetrasPalabraTest{
	public static Matcher<String> length(Matcher<? super Integer> matcher){
		return new FeatureMatcher<String, Integer>(matcher,"Obtenemos la longitud de la palabra","longitud incorrecta"){
			@Override
			protected Integer featureValueOf(String palabra) {
				return palabra.length();
			}
		};
	}
	@Test
	public void testContarLetrasPalabra() {
		String palabra = "Mordor";
		assertThat(palabra,length(is(8)));
	}
}