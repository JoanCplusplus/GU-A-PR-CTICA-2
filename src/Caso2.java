
import java.util.Scanner;
public class Caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese n�mero: ");
		int x = sc.nextInt();
		String n = "El n�mero es impar";
		
		if(x % 2==0) {
			n ="El n�mero es par";
		}
		
		System.out.println("Estado: "+n);
	}

}
