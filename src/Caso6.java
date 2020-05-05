
import java.util.Scanner;
public class Caso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese sueldo: s/");
		float s = sc.nextFloat();
		
		float i;
		
		if(s>2800) {
			i=(float)(s*0.05);
		}
		else {
			i=(float)(s*0.02);
		}
		
		System.out.println("------------------------");
		System.out.println("Impuesto calculado: "+i);
	}

}
