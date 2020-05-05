
import java.util.Scanner;
public class Caso7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese sueldo: s/");
		float s = sc.nextFloat();
		
		float i;
		
		if(s<=1500) {
			i=(float)(s*0.03);
		}
		else if(s>1500 && s<=3000) {
			
				i=(float)(s*0.08);
			}
		else {
			i=(float)(s*0.12);
			}
		System.out.println("Impuesto calculado: s/"+ i);
	}

}


