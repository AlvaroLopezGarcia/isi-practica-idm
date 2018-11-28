import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MiDescuentoBlackFridayTest
{

	private DescuentoBlackFriday precio;

 	@Before      // Set up - Called before every test method.
    public void setUp()
    {
	  precio = new DescuentoBlackFriday();//Hay que hacer un constructor con una fecha que sea por ejemplo la fecha actual
	}


	@Test (expected = IllegalArgumentException.class)
    @SuppressWarnings ("unchecked")
	public void testprecionegativo()
	{
		precio.PrecioFinal(-5.0);
	}

	@Test public void testlimitesuperior()
	{
		double valor = 15.2;
        precio.day = 24;
		precio.month = 11;
		assertTrue("El total es 15.2", valor == precio.PrecioFinal(valor));
	}

	@Test public void testlimiteinferior()
	{
		double valor = 15.2;
        precio.day = 22;
		precio.month = 11;
		assertTrue("El total es 15.2", valor == precio.PrecioFinal(valor));
	}

	@Test public void testcorrectofunc()
	{
		double valor = 15.2;
        precio.day = 23;
        precio.month = 11;
        assertTrue("El total es 15.2", 0.7*valor == precio.PrecioFinal(valor));
	}
}
