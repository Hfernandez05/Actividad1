package actividad1;

import java.util.*;
import java.math.*;

public class EjecProNo14 {

	public static void main(String[] args) {
		
		System.out.println("Ingrese un numero");
		Scanner entrada = new Scanner(System.in); /*con esto leemos el dato de entrada que es el numero*/
		
		double numero = entrada.nextDouble();
		
		double cuadrado = Math.pow(numero, 2); /*calculamos cuadrado*/
		
		double cubo = Math.pow(numero, 3); /*calculamos cubo*/
		
		System.out.println("El numero ingresado es: "+numero+"\nEl cuadrado de este numero es: "+cuadrado+"\nEl cubo de este numero es: "+cubo);
		
	}

}
