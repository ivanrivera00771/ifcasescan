import java.util.Scanner;

public class ifcasescan{

public static void main (String[] args){

int dato;

System.out.println("Introduce un numero del 1 al 5");
Scanner entrada = new Scanner(System.in);
dato = entrada.nextInt();

switch(dato){
	case 1: System.out.println("EL NUMERO ES 1");
		break;
        	
	case 2: System.out.println("EL NUMERO ES 2");
		break;

	case 3: System.out.println("EL NUMERO ES 3");

		break;

	case 4: System.out.println("EL NUMERO ES 4");

		break;

	case 5: System.out.println("EL NUMERO ES 5");

		break;

	default: System.out.println("EL NUMERO NO ESTA EN EL RANGO ESTABLECIDO"); 
}

}

}
