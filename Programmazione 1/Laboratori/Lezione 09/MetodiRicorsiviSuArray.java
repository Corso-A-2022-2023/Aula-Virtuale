import java.util.Scanner;
public class MetodiRicorsiviSuArray{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Esercizio 3");
		System.out.println("tuttiPari:");
		int [] ar = LeggiArray.leggiArrayInt();//dichiarazione dell'array con il metodo leggiArrayInt
		System.out.println(tuttiPari(ar));//stampa la funzione tuttiPari(array)
		System.out.println();
		System.out.println("esisteMultiplo:");
		System.out.println("Inserisci il multiplo :");
		int multiplo = input.nextInt();//variabile per vedere se gli elementi del vettore sono multipli
		int [] arr = LeggiArray.leggiArrayInt();
		System.out.println(esisteMultiplo(arr,multiplo));//stampa la funzione esisteMultiplo
		System.out.println();
		System.out.println("Esercizio 5");
		final int[] a0 = {0,1,2,3,4,5,6,7}; // 16
		final int[] a1 = {3,7,9,4,5,12,11}; // 35
		final int[] a2 = null; // 0
		final int[] a3 = {0,10,40,60,20}; // 0
		System.out.println(sommaDispari(a0));
		System.out.println(sommaDispari(a1));
		//System.out.println(sommaDispari(a2));
		System.out.println(sommaDispari(a3));
		System.out.println();
		System.out.println("Esercizio 6: ");
		final int[] altezze = {5895, 4810, 6194, 4897, 4884, 8848, 6962};
		final String[] nomi = {"Kilimangiaro", "Monte Bianco", "Monte Denali","Massiccio Vinson", "Puncak Jaya", "Everest", "Aconcagua"};
		int elemento = indiceMassimo(altezze);
		System.out.println(nomi[elemento]);
		System.out.println(altezze[elemento]+"m");
		System.out.println();
		System.out.println("Esercizio 7 :");
		System.out.println("a0");
		filtraMaggioriDi(a0,3);
		System.out.println();
		System.out.println("a1");
		filtraMaggioriDi(a1,3);
		System.out.println();
		System.out.println("a2");
		//filtraMaggioriDi(a2,3);
		System.out.println();
		System.out.println("a3");
		filtraMaggioriDi(a3,3);
		System.out.println();
		System.out.println("Esercizio 8: ");
		LeggiArray.stampaArrayInt(filtraPari(a0));
		System.out.println();
		System.out.println("Esercizio 9:");
		System.out.println(eDue(a0, a1)); // -30
		System.out.println(eDue(a1, a0)); // 30
		//System.out.println(eDue(a2, a3)); // 0
		System.out.println(eDue(a0, a3)); // -120
	}
	public static boolean tuttiPari(int[] a){
		int l = a.length-1;//lunghezza massima dell'array
		boolean verifica = false;//variabile boolean per la verifica inizialmente falsa
		return tuttiPariRic(a,l,verifica);//ritorna la funzione ricorsiva
	}
	public static boolean tuttiPariRic(int[] a,int l,boolean verifica){
		if(l==0){
			/*se la L è l'ultimo elemento allora :*/
			return verifica;//ritorna verifica
		}
		else{
			/*altrimenti*/
			if(l>0){
				/*se la l non raggiunge 0*/
				if(a[l] %2 ==0){
					/*se l'elemento è pari allora*/
					verifica = true;//verifica è true
					return tuttiPariRic(a,l-1,verifica);//decremento di l-1
				}
				else{
					/*altrimenti*/
					verifica=false;//verifica è falsa
					return tuttiPariRic(a,l-1,verifica);//decremento di l-1
				}
			}
		}
		return verifica;//ritorno verifica
	}
	public static boolean esisteMultiplo(int[]a,int m){
		int i = 0;//indice del vettore
		boolean verifica = false;//variabile dichiarata falsa
		return esisteMultiploRic(a,m,i,verifica);//chiama la funzione esisteMultiploRic
	}
	public static boolean esisteMultiploRic(int[]a,int m,int i,boolean verifica){
		if(i == a.length-1){
			/*se la i == alla lunghezza massima del vettore*/
			return verifica;
		}
		else{
			if(i<a.length-1){
				/*finchè la i non raggiunge la lunghezza massima del vettore*/
				if(a[i]%m==0){
					/*se la i è multiplo di m*/
					verifica = true;// verifica è vera
					return esisteMultiploRic(a,m,i+1,verifica);
				}
				else{
					verifica = false;// verifica è vera
					return esisteMultiploRic(a,m,i+1,verifica);
				}
			}
		}
		return verifica;//ritorna verifica
	}
	//METODO WRAPPER PER CREARE LA RICORSIONE DICOTOMICA
	public static int sommaDispari(int[]a){
		/*funzione sommaDispari*/
		int i = 0;//indice iniziale 
		int lunghezza = a.length-1;//lunghezza massima dell'array
		return sommaDispariRic(a,i,lunghezza);//ritorno la funzione ricorsiva con l'array e l'indice e la lunghezza
	}
	//RICORSIONE DICOTOMICA
	public static int sommaDispariRic(int [] a, int start, int end){
		/*funzione sommaDispariRic con parametri l'array lo start(i) end (lunghezza del vettore)*/
		if(start == end){
			/*CONDIZIONE BASE SE LO START E' UGUALE A L'END ALLORA:*/
			if(a[start]%2 == 1){
				/*per trovare i numeri dispari della ricorsiva dicotomica */
				return a[start];//retorna l'elemento corrente dell'array
			}
			else{
				/*altrimenti :*/
				return 0;//ritorna 0
			}
		}
		else{
			
			int divisore = (start + end)/2;//LA RICORSIONE DICOTOMICA SERVE SEMPRE UN DIVISIORE PER ANDARE ALLA META' DELL'ARRAY
			int sx = sommaDispariRic(a,start,divisore);//DICHIARO LA PARTE DI SINISTRA DOVE PARTE DA 0 ALLA META'
			int dx = sommaDispariRic(a,divisore+1,end);//DICHIARO LA PARTE DI DESTRA DOVE PARTO DALLA META' ALLA FINE
			return sx+dx;//RITORNO LA SOMMA DI TUTTE E DUE LE META'
		}
	}
	public static int indiceMassimo(int[]a){
		int i = 0;// riga iniziale 
		int l = a.length-1;//lunghezza massima del vettore
		return indiceMassimoRic(a,i,l);//ritorno la funzione dicotomica
	}
	public static int indiceMassimoRic(int [] a,int start , int end){
		int divisore = (start+end)/2;// serve per andare alla metà dell'array
		if(start == end){
			/*condizione base dove se la l'inizio è uguale alla fine allora:*/
			return start;//ritorni l'elemento maggiore
		}
		else{
			if(a[start]<a[divisore]){
				/*se l'inizio è minore di divisore allora*/
				return indiceMassimoRic(a,start,divisore);//confronta chi è il più grande della prima metà
			}
			else{
				/*altrimenti :*/
				return indiceMassimoRic(a,divisore+1,end);//confronta la seconda metà
			}
		}
	}
	public static int[] filtraMaggioriDi(int []a,int limiteInferiore){
		int count=0;//creo una variabile count
		int j = a.length-1;//lunghezza massima dell'array a
		return filtraMaggioriDiRic(a,a.length-1,limiteInferiore,count,j);//ritorno il metodo ricorsivo
	}
	public static int[] filtraMaggioriDiRic(int [] a,int l,int limiteInferiore,int count,int j){
		if(l==0){
			//Ricorsione con metodo co-variante
			/*CONDIZIONE BASE: se la lunghezza dell'array corrisponde a 0 allora:*/
			return new int[count];//ritorno un elemento corrispondente a count
		}
		else{
			/*altrimenti:*/
			if(a[l]>limiteInferiore){
				/*se l'elemento di a*/
				int[] clone = filtraMaggioriDiRic(a,l-1,limiteInferiore,count+1,j-1);
				//creo un array clone con la funzione ricorsiva (che ogni volta somma il valore di count e decrementa l'elemento)
				clone[count]= a[l];//clone count corrisponde all'elemento correnete di a
				System.out.print(clone[count]);//stampa gli elementi di clone
				return clone;//ritorno clone
			}
			else{
				/*altrimenti*/
				int [] clone = filtraMaggioriDiRic(a,l-1,limiteInferiore,count,j-1);
				//solo passo all'elemento successivo
				return clone;//ritorno clone
			}
		}
	}
	public static int[] filtraPari(int [] a){
		int i = 0;//indice dello start
		int l = a.length-1;//indice dell'end
		return filtraPariRic(a,i,l);//ritorno il metodo ricorsivo
	}
	public static int [] filtraPariRic(int [] a , int start , int end){
		if(start == end){
			/*Dato che l'esercizio chiede di usare un metodo dicotomico allora la 
			CONDIZIONE BASE : se l'inizio è uguale alla fine allora
			*/
			if(a[start] %2 == 0){
				/*se l'elemento di a è pari allora*/
				int [] clone = new int[1];//crei un clone di un elemento
				clone[0] = a[start];//elemento iniziale di clone è uguale a quello pari
				return clone;//ritorno clone
			}
			else{
				/*altrimenti*/
				int[] clone = new int[0];//clone sarà vuoto con 0 elementi
				return clone;//ritorno clone
			}
		}
		else{
			/*altrimenti*/
			int divisore = (start+end)/2;//creo la metà
			int[] pari= filtraPariRic(a,start , divisore);//creo un'array con la prima metà
			int []pari1= filtraPariRic(a,divisore+1, end);//creo il secondo array con la seconda metà
			int []clone = concatena(pari,pari1);//dichiaro un array clone dove concateno i valori della prima metà e della seconda
			return clone;//ritorno clone
		}
	}
	public static int[] concatena (int [] a , int [] b){
		int[] clone = new int[a.length+b.length];
		//la lunghezza di clone è la somma della prima metà e della seconda metà
		for(int i = 0; i<a.length; i++){
			/*lettura di tutti gli elementi della prima mettà*/
			clone[i] = a[i];//l'elemento di clone è quello di a
		}
		for(int j = 0; j<b.length;j++){
			/*lettura di tutti gli elementi della seconda metà*/
			clone[j+a.length]= b[j];//gli elementi di clone corrisponde alla seconda metà(clone[j+a.length]) fino alla fine 
		}
		return clone;//ritorno clone
	}
	public static int eDue(int [] a , int [] b){
		int i = 0;//variabile iniziale per partire dall'elemento 0
		int differenza = 0;//differenza sarà la differenza tra i due elementi
		return eDueRic(a,b,i,differenza);//ritorno il metodo ricorsivo
	}
	public static int eDueRic(int[]a,int[]b,int i,int differenza){
		//final int[] a0 = {0,1,2,3,4,5,6,7}; 
//					-3-6-7-1-1-7-5
		//final int[] a1 = {3,7,9,4,5,12,11}; 
		if(i==a.length ||  i==b.length){
			/*Dato che il metodo da eseguire è un contro variante allora la
			CONDIZIONE BASE : se la riga dell'array corrisponde alla sua lunghezza massima allora */
			return differenza;//ritorni differenza
		}
		else{
			/*altrimenti:*/
			if(i<a.length || i<b.length){
				/*se la riga dell'array non raggiunge la sua lunghezza massima allora*/
				differenza += a[i]-b[i];
				//fai una somma con il valore di prima di differenza e la sottrazione tra l'elemento corrente tra a e b
				return eDueRic(a,b,i+1,differenza);//vai all'elemento successivo
			}
		}
		return differenza;//ritorni differenza
	}
}