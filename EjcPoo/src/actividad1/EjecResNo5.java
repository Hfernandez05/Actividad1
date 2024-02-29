package actividad1;

import java.math.*;

public class EjecResNo5 {

	public static void main(String[] args) {
		
		double SUMA = 0;
		
		double X = 20;
		
		SUMA = SUMA + X; /*El valor de SUMA paso de 0 a 20 */
		
		double Y = 40;
		
		X = X + Math.pow(Y, 2); /* el valor de X paso de 20 a 1620*/
		
		SUMA = SUMA + X/Y; /*El valor de SUMA paso de 20 a 60.5*/
		
		System.out.println("EL VALOR DE LA SUMA ES: "+SUMA);
		
		
	}

}
