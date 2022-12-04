import java.util.Scanner;
public class LeggiArray{
	public static void main(String [] args){
		int [] array = leggiArrayInt();//dichiaro l'array con la funzione leggiArrayInt
		System.out.println("Risultato : ");
		stampaArrayInt(array);//stampa  l'array
	}
	public static int[] leggiArrayInt(){
		/*creo la funzione di tipo array senza parametri*/
		return leggiArrayIntRic(0);//ritorni la funzione ricorsiva con parametro 0
	}
	public static int [] leggiArrayIntRic(int i){
		/*creo la funzione con parametro l'elemento corrente dell'array(0)*/
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il valore dell'elemento : "+i);
		int elemento = input.nextInt();//inserisco gli elementi dell'array
		int[] array;//dichiaro un array di array
		if(elemento==0){
			/*condizione base :
				se l'elemento è 0 allora
			*/
			return new int[i];//ritorni gli elementi inseriti in precedenza e termino il metodo
		}
		else{
			array = leggiArrayIntRic(i+1);//ricorsione dell'elemento successivo
			array[i] = elemento;//ogni valore dell'elemento corrente corrisponde a quello inserito
			return array;//ritorno l'array con tutti i suoi elementi
		}
	}
	public static void stampaArrayInt(int [] array){
		/*dichiaro la funzione vuota stampaArrayInt con parametro l'array con tutti i suoi elementi*/
		if(array !=null){
			/*CASO BASE :
			se l'array è nullo allora :*/
			stampaArrayIntRic(array,0);//vai alla funzione stampaArrayIntRic con parametri sia l'array e il primo elemento
		}
	}
	public static void stampaArrayIntRic(int [] array,int i){
		/*crea la funzione void stampaArrayIntRic con i parametri dell'array e l'elemento 0*/
		if(i==array.length-1){
			System.out.println(array[i]);//se la i è uguale alla lunghezza massima del vettore allora stampa la i corrente
		}
		else{
			/*altrimenti :*/
			if(i<array.length-1){
				/*RICORSIONE CONTRO-VARIANTE*/
				System.out.println(array[i]);//con la stampa dell'elemento corrente
				stampaArrayIntRic(array,i+1);//e la ricorsione dell'elemento successivo
			}
		}
	}
}