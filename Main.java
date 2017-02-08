package trainee02;
import java.util.Scanner;
public class Main {
	private static Scanner nw;
	public static void main (String[] args){
		Lista list = new Lista();
		int i=0;
		do{
		System.out.println("Lista enlazada de objetos de cualquier tipo(Object)"
				+ "\n1.-agregar(elemento) <- agrega un nuevo elemento al final de la lista."
				+ "\n2.-obtener(posición) <- entrega el elemento que se encuentra en la posición especificada."
				+ "\n3.-eliminar(posición) <- elimina el elemento en la posición indicada."
				+ "\n4.-insertar(posición, elemento) <- inserta el elemento especificado en la posición especificada."
				+ "\n5.-cantidad() <- retorna la cantidad de elementos de la lista enlazada."
				+ "\n6.-Mostrar Lista"
				+ "\n\nIngrese una opcion:");
		nw = new Scanner(System.in);
		int op = nw.nextInt();
		switch(op){
		case 1: System.out.println("Dame un valor para agregar al final de la lista: ");
				int val = nw.nextInt();
				list.Addfinal(val);
			break;
		case 2:	System.out.println("Dame una posicion para buscar su valor: "); 
				int val2 = nw.nextInt();
				try{
				System.out.println("El valor es "+list.getVal(val2));
				} catch(Exception e){
					System.err.println(e.getMessage());					
				}
			break;
		case 3: System.out.println("Dame una posicion para eliminar : ");
				int val3 = nw.nextInt();
				list.remBypos(val3);
			break;
		case 4: System.out.println("Dame una posicion para insertar: ");
				int val4 = nw.nextInt();
				System.out.println("Dame un valor para agregar: ");
				int val5 = nw.nextInt();
				list.insertPos(val4, val5);
			break;
		case 5: int val6 = list.getSize();
				System.out.println(val6);
			break;
		case 6: list.list();
				System.out.println("\n");
				
			break;
		default: System.out.println("Opcon ingresada no valida");
		Main.main(null);
		break;
		}
		}while(i==0);
	}//main
}//class
