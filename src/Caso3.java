
import java.util.Scanner;
public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el primer número: ");
		float n1 = sc.nextFloat();
		System.out.println("Ingrese el segundo número: ");
		float n2 = sc.nextFloat();
		
		String x;
		
		System.out.println("-----------------");
		
		if(n1>n2) {
			x="El primer número es el mayor";
		}
		else {
			if(n1<n2) {
				x="El segundo número es el mayor";
			}
			else {
				x="Los números son iguales";
			}
		}
		
		System.out.println("Estado: "+ x);
	}

}
