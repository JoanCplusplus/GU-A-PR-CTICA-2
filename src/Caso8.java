
import java.util.Scanner;
public class Caso8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
			System.out.println("Ingrese nota: ");
			int n = sc.nextInt();
			
			
			System.out.println("------------------");
			
			if(n>=00 && n<=07) {
				System.out.println("Sin palabras");
			}
				else if(n>07 && n<=10) {
				System.out.println("Malo");
				}
					else if(n>=11 && n<=14) {
						System.out.println("Regular");
					}
						else if(n>=15 && n<=17) {
							System.out.println("Notable");
						}
							else if(n>=18 && n<=20) {
								System.out.println("Excelente");
							}
			else {
				System.out.println("Nota no válida");
			}

	}

}