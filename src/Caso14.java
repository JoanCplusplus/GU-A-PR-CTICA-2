import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese el nombre del alumno: ");
		String n = sc.nextLine();
		System.out.print("Ingrese la carrera (DS,RC,DG): ");
		String c = sc.nextLine();
		System.out.print("Ingrese el turno (M,T,N): ");
		String t = sc.nextLine();
		
		String nc="", nt="";
		float m=0,d=0;
		
		switch(c) {
		case "DS":
			c="Desarrollo de software";
			m=1500;break;
		case "RC":
			c="Redes y comectividad";
			m=1400;break;
		case "DG":
			c="Diseño gráfico";
			m=1300;break;
		default:
			m=0;
		}
		switch(t) {
		case "M":
			t="Mañana";
			d=m*0.1f;break;
		case "T":
			t="Tarde";
			d=m*0.2f;break;
		case "N":
			n="Noche";
			d=m*1.5f;break;
		default:
			d=0;
		}
		System.out.println("----------------");
		System.out.println("---RESULTADOS---");
		System.out.println("----------------");
		
		System.out.println("Alumno: "+ n);
		System.out.println("Carrera: "+c);
		System.out.println("Monto: "+m);
		System.out.println("Turno: "+t);
		System.out.println("Descuento: "+d);
		System.out.println("Total a pagar: "+ (m-d) +"/S");
		System.out.println("Cambio en dólares: "+ df.format((m-d)/3.33) + "$");
	}

}
