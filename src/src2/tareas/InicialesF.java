package src2.tareas;
import libs.Input;
public class InicialesF {

	public static void main(String[] args) {
		System.out.print("Ingresa el nombre: \n");
		String x = Input.get_string();
		System.out.print("Ingresa el primer apellido: \n");
		String y = Input.get_string();
		System.out.print("Ingresa el segundo apellido: \n");
		String z = Input.get_string();
		
		Input.print("Las primeras letras del nombre son: " + x.charAt(0) + y.charAt(0) + z.charAt(0) + "\n");
		
	}
}
