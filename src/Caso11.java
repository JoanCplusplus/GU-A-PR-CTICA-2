import java.util.Scanner;

public class Caso11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese número [1-7]: ");
		int n = sc.nextInt();
		String d = sc.nextLine();
		
		switch (n) {
		case 1:
			d="Domingo"; break;
		case 2:
			d="Lunes"; break;
		case 3:
			d="Martes"; break;
		case 4:
			d="Miercoles"; break;
		case 5:
			d="Jueves"; break;
		case 6:
			d="Viernes"; break;
		case 7:
			d="Sábado"; break;
		default:
			d="Desconocido";
		}
		
		System.out.println("Nombre del día: "+d);
	}
	
}
