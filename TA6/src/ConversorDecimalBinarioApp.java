import javax.swing.JOptionPane;

/**
 * 
 * @author Pau Robuste
 *
 */
import javax.swing.JOptionPane;
public class ConversorDecimalBinarioApp {
	
	public static void main(String[] args) {

		String numS = JOptionPane.showInputDialog("Introduce un numero:");
		int num = Integer.parseInt(numS);
		calcularBinario(num);
	}
	
	public static void calcularBinario(int numdec) {
		
		String resto = "0";
		String numbin = "";
		while(numdec > 0) {	
			if(numdec % 2 == 0) {
				resto = "0";
			}else{
				resto = "1";
			}
			numdec = numdec/2;
			numbin = resto+numbin;	
		}
		
		JOptionPane.showMessageDialog(null, numbin);
	}
}
