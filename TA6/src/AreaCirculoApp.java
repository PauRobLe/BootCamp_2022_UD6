/**
 * 
 * 	Author: Pau Robusté
 * 
 */
import java.util.Scanner;

public class AreaCirculoApp {
	
	public static void main(String[] args) {
		
		//Introducir tipo de figura
		System.out.println("Escribe: circulo / triangulo / cuadrado");
		String figura="";
		
		System.out.println("Vamos a calcular su area");
		
		switch(figura) {
			case "circulo":
				double area=0;
				double radio=0;
				float pi=3,14;
				area = (radio*2)*pi;
				System.out.println("Area del circulo es" +area);
				break;
			case "triangulo":
				double area=0;
				double base=0;
				double altura=0;
				area = (base * altura)/2;
				System.out.println("Area del triangulo es" +area);
				break;
			case "cuadrado":
				double area=0;
				double lado=0;
				area = lado * lado;
				System.out.println("Area del cuadrado es" +area);
				break;
			default:
				System.out.println("Opcion no aceptada");
		}
		
	}	
}
