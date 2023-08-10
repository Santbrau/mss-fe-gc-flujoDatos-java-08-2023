package ejercicio1;
import javax.swing.JOptionPane;

public class ejercicio13 {

	public static void main(String[] args) {

		int operando1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer operando:"));
        int operando2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo operando:"));
        String signo = JOptionPane.showInputDialog("Ingresa el signo aritmético (+, -, *, /, ^, %):");
        
        int resultado = 0;

        switch (signo) {
            case "+":
                resultado = operando1 + operando2;
                break;
            case "-":
                resultado = operando1 - operando2;
                break;
            case "*":
                resultado = operando1 * operando2;
                break;
            case "/":
                resultado = operando1 / operando2;
                break;
            case "^":
                resultado = (int) Math.pow(operando1, operando2);
                break;
            case "%":
                resultado = operando1 % operando2;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Signo aritmético no válido.");
                return;
        }
        
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);

	}

}
