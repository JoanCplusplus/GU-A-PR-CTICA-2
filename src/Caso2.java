
import java.util.Scanner;
public class Caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese número: ");
		int x = sc.nextInt();
		String n = "El número es impar";
		
		if(x % 2==0) {
			n ="El número es par";
		}
		
		System.out.println("Estado: "+n);
	}

}
