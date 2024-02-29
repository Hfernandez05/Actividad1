package actividad1;

import java.util.*;
import java.math.*;

public class EjecPropNo17 {

	public static void main(String[] args) {
		System.out.println("Ingrese el radio del circulo");
		Scanner entrada = new Scanner(System.in); /*Con esto vamos a leer el dato de entrada*/
		
		
		double radio = entrada.nextDouble();
		
		System.out.print("el area del circulo es: ");
		
		System.out.printf("%1.2f", (Math.PI)*(Math.pow(radio, 2))); /*calculo del area del circulo*/
		System.out.println("");
		System.out.print("La longitud de la circunferencia es: ");
		System.out.printf("%1.2f", (2)*(Math.PI)*(radio));           /*calculo de la longitud de circunferencia*/
	}

}
