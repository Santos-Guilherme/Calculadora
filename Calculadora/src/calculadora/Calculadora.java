package calculadora;
import javax.swing.JOptionPane;

public class Calculadora {
	public static void main (String[] args) {
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		
		int total = numero1 + numero2;
		System.out.println(numero1 + " + " + numero2 + " = " + total);
	}
}
