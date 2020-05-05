
import java.util.Scanner;
public class Caso12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese el nombre del empleado: ");
		String m = sc.nextLine();
		System.out.print("Ingrese el nivel [1-4]: ");
		int n = sc.nextInt();
		System.out.print("Ingrese el sueldo: ");
		float s = sc.nextFloat();
		float i = 0;
		float x = 0;
		
		switch(n) {
		case 1:
			i=4.5f; break;
		case 2:
			i=6.0f; break;
		case 3:
			i=8.5f; break;
		case 4:
			i=11.0f; break;
		default:
			i=0;
		}
		
		x=(s*(i/100));
		
		System.out.println("--------------------------");
		System.out.println(">>>>>>>>>RESULTADOS<<<<<<<");
		System.out.println("--------------------------");
		
		System.out.println("Empleado: "+ m);
		System.out.println("Nivel: "+ n);
		System.out.println("Sueldo: "+ s);
		System.out.println("Incremento: "+ i +"%");
		System.out.println("Nuevo sueldo: "+(s+x));
		
	}

}
