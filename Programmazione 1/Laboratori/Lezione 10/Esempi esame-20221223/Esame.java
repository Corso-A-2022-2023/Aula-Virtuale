
public class Esame {

	/* ESERCIZIO 1
	 * Scrivere un metodo iterativo e1 con le seguenti caratteristiche: 
	 * a) e1 ha due parametri formali con nome a e b, rispettivamente,
	 *    entrambi di tipo (reference ad) array di interi;
	 * b) e1 restituisce true se e solo se, per ogni i,
	 *    a[i] e' multiplo di almeno due elementi di b le cui posizioni 
	 *    siano nell'intervallo di indici da i incluso sino al termine di b.
	 *    Quindi, e1 restituisce false nel caso la condizione descritta non
	 *    valga anche solo per un elemento di a.
	 * Si osservi che i parametri attuali possono avere lunghezze differenti,
	 * o possono non esistere. In qualsiasi caso, e1 non deve generare alcun 
	 * tipo d'errore.
	 * 
	 * Il metodo e1 va scritto immediatamente al di fuori di questo commento. 
	 * L'aggiunta del metodo e1 deve mantenere compilabile la classe.
	 */
    public static boolean e1(int[] a , int [] b){
		boolean flag = false;
		int count = 0;
		if(a == null|| b == null){
			return false;
		}
		for(int i = 0; i< a.length; i++){
			count = 0;
			for(int j = i; j<b.length; j++){
				if(a[i]%b[j] == 0){
					count++;
					if(count >=2){
						flag =true;
					}
					else{
						flag = false;
					}
				}
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		int[] a = {-1,5,3};
		int[] b= {2};
		System.out.println(e1(a, b));
		System.out.println(e2(a));
	}
	/*************************************************************************************************/
	/* Metodi privati che DEVONO ESSERE USATI dalla soluzione all'ESERCIZIO 2. */
	private static boolean t1(int x) {
		return x >= -1;
	}
	private static boolean t2(int x) {
		return x <= 1;
	}
	/* ESERCIZIO 2
	 * Scrivere un metodo e2 che, richiamando un metodo ricorsivo e2R, 
	 * rispetti i requisiti riportati.
	 * a) e2 DEVE avere un singolo parametro formale di nome a e di tipo 
	 *    reference ad un array di interi; 
	 * b) e2 restituisce il valore intero ottenuto dal metodo ricorsivo 
	 *    e2R applicato ad a, se a esiste. Se a non esiste, allora e2 
	 *    restituisce 0.
	 * c) e2R e' un metodo ricorsivo che visita a dicotomicamente e 
	 *   restituisce la somma dei valori di tutti gli elementi di a 
	 *   per i quali esattamente uno tra t1 e t2 sia vero.
	 *
	 * La chiamata a e2 non deve generare alcun tipo d'errore.
	 *
	 * Il metodo e2 va scritto immediatamente al di fuori di questo commento. 
	 * L'aggiunta del metodo e2 deve mantenere compilabile la classe.
	 */
	public static int e2 (int[] a){
		if(a == null){
			return 0;
		}
		int start =0;
		int end = a.length-1;
		return e2R(start,end ,a);
	}
	public static int e2R(int start, int end ,int[] a){
		int count = 0;
		if(start == end){
			if(t1(a[start])^t2(a[start])){
				return count+=a[start];
			}
		}
		else{
			int divisore = (start + end)/2;
			count+= e2R(start,divisore,a);
			count+= e2R(divisore+1,end ,a);
		}
		return count;
	}
	
}
