package actividad1;

public class EjecProNo12 {

	public static void main(String[] args) {
		
		double salBruto = 48*5000;   /*Realizamos el calculo del salario bruto con la cantidad de horas trabajadas multiplicadas por el valor de cada hora*/
		
		double retFuente = 0.125 * salBruto; /*calculamos la retencion del 12,5%*/
		
		double salNeto = salBruto - retFuente; /*se calcula el salario neto restando del salario bruto la renencion*/
		
		System.out.println("El salario bruto del trabajador es: "+salBruto+"\nLa retencion en la fuente es: "+retFuente+"\nEl salario neto del trabajador es: "+salNeto);
	}

}
