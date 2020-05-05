
import java.util.Scanner;
public class Caso1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese la edad: ");
		int e = sc.nextInt();
		
		if(e>=18 && e<100) {
			System.out.println("Es mayor de edad");
		}
		else {
			if(e<18) {
				System.out.println("Es menor de edad");
			}
			else {
				System.out.println("Edad no válida");
			}
		}

	}

}
