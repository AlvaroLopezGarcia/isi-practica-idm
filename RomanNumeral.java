//package sut_code;
import java.util.*;
import java.lang.String;

public class RomanNumeral {

	/**
    * Returns the mininum element in a list
    * @param romanNumber number to convert
    * @return decimal conversion
		* @throws NullStringException if string is null
    */

	public int convierte (String romanNumber) {

		if (romanNumber == ""){
			throw new IllegalArgumentException ("RomanNumeral.convierte");
		}

		int decimal = 0;
		int lastNumber = 0;
		String romanNum = romanNumber.toUpperCase(); // caso de minusculas
		for (int x = romanNum.length() - 1; x >= 0 ; x--) {
			char romanChar = romanNum.charAt(x); // cogemos char a char
			switch (romanChar) {
	    case 'M':
	    	decimal = processDecimal(1000, lastNumber, decimal);
	    	lastNumber = 1000;
	      break;

			case 'D':
	    	decimal = processDecimal(500, lastNumber, decimal);
	    	lastNumber = 500;
	    	break;

	    case 'C':
	    	decimal = processDecimal(100, lastNumber, decimal);
	    	lastNumber = 100;
	    	break;

			case 'L':
	    	decimal = processDecimal(50, lastNumber, decimal);
	     	lastNumber = 50;
	      break;

			case 'X':
	    	decimal = processDecimal(10, lastNumber, decimal);
	    	lastNumber = 10;
	    	break;

	    case 'V':
	    	decimal = processDecimal(5, lastNumber, decimal);
	      lastNumber = 5;
	      break;

	    case 'I':
	    	decimal = processDecimal(1, lastNumber, decimal);
	    	lastNumber = 1;
     		break;

	    default: //caso no romano
	    	throw new IllegalArgumentException ("RomanNumeral.convierte");
	    }
	  }
	  return decimal;
		}

		//necesario un boolean flag para numeros tipo IIII if (lastNumber == decimal && flag true error)
		public static int processDecimal(int decimal, int lastNumber, int lastDecimal) {
	  	if (lastNumber > decimal) {
	    	return lastDecimal - decimal;
	    } else {
	    	return lastDecimal + decimal;
	    }
		}

	  public static void main(String args[]) {
			RomanNumeral test = new RomanNumeral();

			System.out.println(test.convierte("XIV"));
	    System.out.println(test.convierte("MMCM"));
	    System.out.println(test.convierte("IIIIIIII"));
	    System.out.println(test.convierte("HJK"));
	    }
}
