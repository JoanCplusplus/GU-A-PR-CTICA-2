
import java.util.Scanner;
public class Caso13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese el primer n�mero: ");
		float n1 = sc.nextFloat();
		System.out.print("Ingrese el segundo n�mero: ");
		float n2 = sc.nextFloat();
		System.out.print("Ingrese la operaci�n [1-6]: ");
		int x = sc.nextInt();
		
		String op = sc.nextLine();
		float rpta = 0;
		
		switch(x) {
		case 1: 
			op="Suma";
			rpta=n1+n2;break;
		case 2:
			op="Resta";
			rpta=n1-n2;break;
		case 3:
			op="Multiplicaci�n";
			rpta=n1*n2;break;
		case 4:
			op="Divisi�n";
			if(n2<0 || n2>0) {
				rpta=n1/n2;
			}break;
		case 5:
			op="Resto entero";
			if(n2<0 || n2>0) {
				rpta=n1%n2;
			}break;
		case 6:
			op="Promedio";
			rpta=(n1+n2)/2;break;
		}
		
		System.out.println("--------------------------");
		System.out.println(">>>>>>>>>RESULTADOS<<<<<<<");
		System.out.println("--------------------------");
		
		System.out.println("N�mero 1: "+ n1);
		System.out.println("N�mero 2: "+ n2);
		System.out.println("Operaci�n: "+ op);
		System.out.println("Resultado: "+ rpta);
	}

}
