
import java.util.Scanner;
public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese el precio: s/");
		float p = sc.nextFloat();
		System.out.print("Ingrese la cantdad: ");
		float c = sc.nextFloat();
		
		float t=p*c;
		float d;
		
		if(c>8) {
			d=(float)(t*0.1);
		}
		else {
			d=0;
		}
		System.out.println("---------------------");
		System.out.println("El total es: s/"+ t);
		System.out.println("El descuento es: s/"+d);
		System.out.println("El neto es: s/"+ (t-d));
	}

}
