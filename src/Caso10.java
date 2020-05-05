import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese el nombre del trabajador: ");
		String n = sc.nextLine();
		System.out.print("Ingrese las horas trabajadas: ");
		float h = sc.nextFloat();
		System.out.print("Ingrese la tarifa por horas: ");
		float t = sc.nextFloat();
		System.out.print("Ingrese los minutos de tardanza: ");
		float x = sc.nextFloat();
		
		System.out.println("--------------------------");
		System.out.println(">>>>>>>>RESULTADOS<<<<<<<<");
		System.out.println("--------------------------");
		
		float i=h*t;
		float b=0;
		float d=0;
		
		System.out.println("Trabajador: "+ n);
		System.out.println("Horas trbajadas: "+ h);
		System.out.println("Tarifa por horas: "+ t);
		System.out.println("Importe: "+ i);
		
		if(h<60) {
			b =i*(0.6f);
		}
		else {
			b=i*(0.13f);
		}
		if(x>15) {
			d=i*(.03f);
		}
		else {
			d=0;
		}
		System.out.println("Descuento: "+ d);
		
		float m = 0;
		
		m=(h*100)/70;
		
		System.out.println("Meta alcanzada: "+m+"%");
	}

}

