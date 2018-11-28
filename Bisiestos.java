//package sut_code;

import java.util.*;
public class Bisiestos {

	/**
	//Un año es bisiesto si es múltiplo de 4 (p.e. 1984). Los años múltiplos de 100 no son bisiestos,
	//salvo si ellos son también múltiplos de 400 (2000 es bisiesto, 1800 no lo es).
		* @param año year to check
		* @return if a year is bisiesto or not
		* @throws IllegalArgumentException if año < 0
		*/

	public boolean esBisiesto (int año) {

	if (año < 0) {
		throw new IllegalArgumentException ("Bisiesto.esBisiesto");
	}

	if (año == 0){
		return false;
	}

	if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))) {
		return true;
	}
	return false;
	}

	public static void main(String args[]) {
		Bisiestos test = new Bisiestos();
		System.out.println(test.esBisiesto(0));
		System.out.println(test.esBisiesto(-55));
		System.out.println(test.esBisiesto(2000));
		System.out.println(test.esBisiesto(2450));
		System.out.println(test.esBisiesto(1984));
	}
}
