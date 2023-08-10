package ejercicio1;
import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa el día: ");
		  String dia = scanner.nextLine();
		  dia = dia.toLowerCase();
		  
		  switch (dia) {
          case "lunes":
          case "martes":
          case "miércoles":
          case "miercoles":
          case "jueves":
          case "viernes":
              System.out.println("Es un día laboral.");
              break;
          case "sábado":
          case "sabado":
          case "domingo":
              System.out.println("No es un día laboral.");
              break;
          default:
              System.out.println("Día no válido.");
              break;
      }

      scanner.close();
	}

}
