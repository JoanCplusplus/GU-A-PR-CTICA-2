
import java.text.DecimalFormat;
import java.util.Scanner;
public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		
		System.out.println("Ingrese nombre del alumno: ");
		String a = sc.nextLine();
		System.out.println("Ingrese nota 1: ");
		float n1 = sc.nextFloat();
		while (n1>20) {
			System.out.println("--------------------------------");
			System.out.println("Nota errónea");
			System.out.println("--------------------------------");
			System.out.println("Ingrese nota 1: ");
			n1= sc.nextFloat();	
		}
		System.out.println("---------------");
		System.out.println("Ingrese nota 2: ");
		float n2 = sc.nextFloat();
		while (n2>20) {
			System.out.println("--------------------------------");
			System.out.println("Nota errónea");
			System.out.println("--------------------------------");
			System.out.println("Ingrese nota 2: ");
			n2=sc.nextFloat();
		}
		
		System.out.println("--------------------------------");
		System.out.println("Ingrese número de asistencias: ");
		int as = sc.nextInt();
		while(as>12) {
			System.out.println("-------------------------------");
			System.out.println("Hay un máximo de 12 asistencias");
			System.out.println("-------------------------------");
			System.out.println("Asistencias: ");
			as=sc.nextInt();
		}
		
		float p = (float)((n1*0.3)+(n2*0.7));
		String x = sc.nextLine();
		
		x="Desaprobado";
		if(p>=13 && as>=(12*0.7)) {
			x="Aprobado";
		}
		
		
		System.out.println("<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>");
		System.out.println(">>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<");
		
		System.out.println("Alumno: "+a);
		System.out.println("Promedio: "+ df.format(p));
		System.out.println("Asistencia: "+ df.format((as*100)/12)+ "%");
		System.out.println("Estado: "+x);
		
	}

}
