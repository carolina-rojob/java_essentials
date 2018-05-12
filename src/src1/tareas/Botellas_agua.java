package src1.tareas;
import libs.Input;
public class Botellas_agua {

	public static void main(String[] args) {
		System.out.print("Ingresa el tiempo que tardas en bañarte: ");
		int a = Input.get_int();
		int b = 12;
		
		System.out.print(a + " minutos equivalen a " + (a * b) + " botellas de agua" + "\n");
	    
	}
}
