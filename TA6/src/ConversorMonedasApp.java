import javax.swing.JOptionPane;

/**
 * 
 * @author Pau Robuste
 *
 */

public class ConversorMonedasApp {

	public static void main(String[] args) {

		String eurosS = JOptionPane.showInputDialog("Introduce una cantidad en euros");
		double euros = Double.parseDouble(eurosS);
		
		String opcion = JOptionPane.showInputDialog("Introduce a que monedas quieres convertir: libras, dolares, yenes");
		
		switch(opcion) {
			case "libras":
				JOptionPane.showMessageDialog(null, euros+"€ son "+eurosLibras(euros)+" libras");
				break;
			case "dolares":
				JOptionPane.showMessageDialog(null, euros+"€ son "+eurosDolares(euros)+" dolares");
				break;
			case "yenes":
				JOptionPane.showMessageDialog(null, euros+"€ son "+eurosYenes(euros)+" yenes");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Has introducido la moneda incorrectamente");
		}
	}

	
	public static double eurosLibras(double euros) {
		
		double libras = euros * 0.86;
		libras = Math.round(libras*100.0)/100.0;
		return libras;
	}
	
	public static double eurosDolares(double euros) {
		double dolares = euros * 1.28611;
		dolares = Math.round(dolares*100.0)/100.0;
		return dolares;	
	}
	
	public static double eurosYenes(double euros) {
		double yenes = euros * 129.852;
		yenes = Math.round(yenes*100.0)/100.0;
		return yenes;
	
	}
}
