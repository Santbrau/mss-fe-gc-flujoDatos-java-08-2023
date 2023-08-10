package ejercicio1;
import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {		
		
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.print("Ingresa el precio del producto: ");
	        double precio = scanner.nextDouble();
	        
	        double precioConIVA = precio * 1.21;
	        
	        System.out.println("El precio con IVA del 21% es: " + precioConIVA);
	        
	        scanner.close();

	}

}
