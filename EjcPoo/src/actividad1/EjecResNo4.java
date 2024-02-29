package actividad1;
import java.util.*;

public class EjecResNo4 {

	public static void main(String[] args) {
		System.out.println("Ingrese la edad de Juan");
		
		Scanner entrada = new Scanner(System.in); /*Con esto vamos a leer el dato de entrada que es la edad de Juan*/
		int EDJUAN = entrada.nextInt(); 
		
		int EDALBER = 2*EDJUAN/3;           /*Declaramos el resto de variables y hacemos los calculos*/
		int EDANA = 4*EDJUAN/3;
		int EDMAMA = EDJUAN + EDALBER + EDANA;
		
		System.out.println("LAS EDADES SON: ALBERTO ="+EDALBER+"\nJUAN = "+EDJUAN+"\nANA = "+EDANA+"\nMAMA = "+EDMAMA);
		/*Imprimimos resultados*/
	}

}

