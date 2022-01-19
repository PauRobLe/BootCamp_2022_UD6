/**
 * 
 * @author Pau Robuste
 *
 */
import javax.swing.JOptionPane;

public class ContadorCifrasApp {
	
	public static void main(String[] args) {
		int num;
		do {
			String numS = JOptionPane.showInputDialog("Introduce un numero, que no sea negativo:");
			num = Integer.parseInt(numS);
		}while(num <= 0);
		JOptionPane.showMessageDialog(null, "Tu número tiene "+calcularCifras(num)+" cifras.");
	}
	
	public static int calcularCifras(int num) {
		String numS = Integer.toString(num);
		int cifras = numS.length();
		return cifras;
	}
}
