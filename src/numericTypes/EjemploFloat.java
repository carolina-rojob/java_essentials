package numericTypes;

import libs.Input;

public class EjemploFloat {

	public static void main(String[] args) {
		Input.print("ingresa valor 1: ");
		float f = Input.get_float();
		
		Input.print("ingresa valor 2: ");
		float f2 = Input.get_float();
		
		Input.print("f/f2 = " + (f/f2));

	}

}
