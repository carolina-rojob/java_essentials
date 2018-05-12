package src1.tareas;
import libs.Input;
public class MarioD {

	public static void main(String[] args) {
		System.out.print("Ingresa la altura de la piramide: ");
		int filas = Input.get_int();

		System.out.println();
		for (int altura = 1; altura <= filas; altura++) {
			for (int bl=1; bl<=filas-altura; bl++) {
				System.out.print(" ");

		}
		
			for(int car = 1; car<=(altura*2)-1; car++) {
				System.out.print("#");
		}
		
		System.out.println();
		}
	}
}