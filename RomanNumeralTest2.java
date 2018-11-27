//
// Instrucciones de compilación:
// javac -cp .:./hamcrest-core-1.3.jar:./junit-4.12.jar MinTest.java
//

import static org.junit.Assert.*; // En este paquete están los métodos assertTrue, assertEquals, assertNull, fail, etc.
import org.junit.*;
import java.util.*;

public class RomanNumeralTest
{
	// Test para String nulo
	@Test (expected = IllegalArgumentException.class)
	public void testForNullString()
	{
		RomanNumeral.convierte("");
	}

	// Test para String ilegal
	@Test (expected = IllegalArgumentException.class)
	public void testForNoRoman()
	{
		RomanNumeral.convierte("HJK");
	}

	// Test para String ilegal (pero parecido a romano)
	// @Test (expected = IllegalArgumentException.class)
	// public void testForIllegalRoman()
	// {
	// 	RomanNumeral.convierte("XIIII");
	// }

	// Test para String romano
	@Test
	public void testForRoman()
	{
		assertTrue("Ese numero no es romano", 17 == RomanNumeral.convierte("XVII")); // Se imprimirá este msg si test falla
	}

}
