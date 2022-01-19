/**
 * 
 * @author Pau Robusté
 *
 */
import javax.swing.JOptionPane;

public class TamañoArrayApp {
	public static void main(String[] args) {

		String tamS = JOptionPane.showInputDialog("Indica la longitud de la array:");
		int tam = Integer.parseInt(tamS);
		String long;
		
		do {
			long = JOptionPane.showInputDialog("Indica el número final:");
		}while(Integer.parseInt(long)>9);
		
		int array[] = new int[tam];
		
		fillslots(array);
		showArrayScreen(array);
		showArrayScreen(arrayNumeroFinal(array, long));
		
	}
	
	public static void fillslots(int array[]) {
		for(int i=0; i<array.length; i++) {	
			array[i] = (int) (Math.random() * (300 - 1)+1);	
		}	
	}
	
	public static void showArrayScreen(int array[]) {
		System.out.println("\n Indice/Valor:");
		for(int i = 0; i<array.length; i++){
			if(array[i] != 0) {
				System.out.println(i+" / "+array[i]);
			}
		}
	}
	
	public static int[] arrayNumeroFinal(int arrayent[], String num) {	
		
		int arraysal[] = new int[arrayent.length];
		int cont = 0;
		
		for(int i=0; i<arrayent.length; i++) {	
			String str = Integer.toString(arrayent[i]);
			if(str.endsWith(num)) {	
				arraysal[cont] = Integer.parseInt(str);
				cont++;	
			}	
		}
		return arraysal;
	}
}
