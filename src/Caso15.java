
import java.util.Scanner;
public class Caso15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre del cliente: ");
		String n = sc.nextLine();
		System.out.println("Ingrese el nombre del producto [TB/LT/MN/IM]: ");
		String p = sc.nextLine();
		System.out.println("Ingrese la cantidad: ");
		int c = sc.nextInt();
		System.out.println("Ingrese la forma de pago [C1,C2]: ");
		String f = sc.nextLine();
		int v = 0;
		
		switch(p) {
		case "TB":
			p="Tablet";	
			v=350; break;
		case "LT":
			p="Laptop";
			v=2300; break;
		case "MN":
			p="Monitor";
			v=850; break;
		case "IM":
			p="Impresora";
			v=680; break;
		default:
			v=0;
		}
		
		float i = 0;
		i=v*c;
		float d = 0;
		float t = 0;
		String z = sc.nextLine();
		
		System.out.println(">>>>>>>>>>>><<<<<<<<<<<<<");
		
		System.out.println("Cliente: "+ n);
		System.out.println("Producto: "+ p);
		System.out.println("Precio: "+"s/"+ v);
		System.out.println("Cantidad: "+ c);
		System.out.println("Importe: "+"s/"+ i);
		switch(f) {
		case "C1":
			z="Descuento";
			d=(i*(0.05f));
			t=(i-d);break;
		case "C2":
			z="Incremento";
			d=(i*(0.12f));
			t=(i+d); break;
		}
		
		System.out.println(z + ":"+"s/" + d);
		System.out.println("Total a pagar: "+"s/"+ t);
	}

}
