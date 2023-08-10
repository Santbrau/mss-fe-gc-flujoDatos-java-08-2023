package ejercicio1;
import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		   System.out.print("Ingresa el número de ventas: ");
	        int numeroDeVentas = scanner.nextInt();
		
		double sumaTotal = 0.0;
		
		 for (int i = 1; i <= numeroDeVentas; i++) {
	            System.out.print("Ingresa la venta " + i + ": ");
	            double venta = scanner.nextDouble();
	            sumaTotal += venta;
	        }
		 
		 System.out.println("La suma total de las ventas es: " + sumaTotal);
		 
		 scanner.close();

	}

}
