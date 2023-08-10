package ejercicio1;
import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {

		 String contraseñaAlmacenada = "contraseña123";
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 int intentos = 3;
	        boolean contraseñaCorrecta = false;
	        
	        while (intentos > 0 && !contraseñaCorrecta) {
	            System.out.print("Introduce la contraseña (" + intentos + " intentos restantes): ");
	            String contraseñaIngresada = scanner.nextLine();

	            if (contraseñaIngresada.equals(contraseñaAlmacenada)) {
	                contraseñaCorrecta = true;
	                System.out.println("¡Enhorabuena!");
	            } else {
	                intentos--;
	                System.out.println("Contraseña incorrecta. Inténtalo de nuevo.");
	            }
	        }
	        
	        scanner.close();
	        
	        if (!contraseñaCorrecta) {
	            System.out.println("Acceso denegado.");
	        }

	}

}
