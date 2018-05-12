package src1.tareas;
import libs.Input;
public class MarioF {

	public static void main(String[] args) {
		System.out.print("Ingresa la altura de la piramide: ");
		int altura = Input.get_int();

		for (int i = 1, j=altura-1; i<=altura; i++, j--) {
			caracter(' ',j);
			caracter('#',i);
			System.out.println();
		}
	}		
		private static void caracter(char c, int cont){
	        for(int i = 0; i<cont; i++){
	            System.out.print(c);
        }
	}
}
