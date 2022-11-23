public class MetodiSuArray{
	public static int[] initArrayInt(){
		/*funzione di tipo array dove ritorna un array di interi*/
		System.out.println("Insersci la dimensione dell'array");
		int dimensione = SIn.readInt();//Inserisco la dimensione dell'array
		int[] array ;
		//dichiaro che creo un array con dimensione inserita
		if(dimensione <0){
			/*se la dimensione dell'array non esiste allora:*/
			array = new int [0];
			return array;//ritorni null
		}
		else{
			array= new int [dimensione];
			for(int i = 0; i< array.length;i++){
				/*col ciclo for generi l'array*/
				System.out.println("Inserisci il valore dell' elemento "+i);
				array[i] = SIn.readInt();//inserisco i valori per ogni elemento
			}
		}
		return array;//ritorni l'array generato
	}
	public static void stampaArrayInt(int[] array){
		/*funzione vuota per stampare l'array con parametro l'array generato*/
		System.out.println("Risultato:");
		for(int i = 0; i< array.length;i++){
			/*for che parte dal primo elemento e arriva al massimo elemento*/
			System.out.println(array[i]);//Stampi tutto l'array
		}
	}
	public static void copiaElementi(int [] from , int [] to){
		if(from.length != to.length)
			System.out.println("Errore");//Stampa errore
		else{
			for(int i = 0; i<from.length;i++){
				/*ciclo for per copiare gli elementi*/
				to[i] = from[i];//dico che gli elementi dell'array to sono uguali a quelli di from
			}
			//System.out.println("Copia elementi completata");//verifica se l'array passa nella funzione
		}
	}
	public static int[] clonaArray(int[] a){
		/*funzione di tipo array con parametro un array*/
		int[] clone = new int[a.length];//dichiaro che l'array clone è uguale a la lunghezza dell'array a
		if(a == null){
			/*se l'array a è null allora:*/
			return null;//ritorna null
		}
		else{
			copiaElementi(a,clone);//wrap su copiaElementi con l'array e il clone
			//System.out.println("Clonazione completata");
		}
		return clone;//ritorni il clone
	}
	public static void separa() {
		final int NUM_TRATTINI = 40;
		for (int i = 0; i < NUM_TRATTINI; i++)
            System.out.print('-');
        System.out.println();
    }
	public static int[] filtroMinoriDi(int[] a, int limiteSuperiore){
		int lunghezza = 0;//la variabile lunghezza per creare l'array clone di n dimensione
		for(int i = 0; i<a.length; i++){
			/*for per leggere tutto l'array */
			if(a[i]<limiteSuperiore){
				/*se l'elemento corrente dell'array è minore di limiteSuperioreallora*/
				lunghezza++;//somma di uno la lunghezza 
			}
		}
		int j =0;//j per l'indice dell' array clone
		int []clone = new int [lunghezza];//array clone di dimensione lunghezza;
		for(int i = 0; i<a.length;i++){
			/*for per leggere l'array a */
			if(a[i]<limiteSuperiore){
				/*se l'elemento corrente dell'array è minore limiteSuperiore allora*/
				clone[j] = a[i];//l'elemento di clone è uguale all'elemento corrente di a[i]
				j++;//somma di 1 l'elemento corrente
			}
		}
		return clone;//ritorna clone con i suoi elementi
	}
	public static int[] filtroIntervalloDisp(int[] a, int min, int max){
		int lunghezza =0;//la variabile lunghezza per creare l'array clone di n dimensione
		for(int i =0;i<a.length;i++){
			/*for per leggere tutto l'array a */
			if(a[i]%2==1&& a[i]>=min && a[i]<=max){
				/*se l'elemento di a non è pari e comprende tra max e min allora:*/
				lunghezza++;//incrementa la lunghezza
			}
		}
		int j = 0;//indice per la posizione dell'array clone 
		int [] clone = new int[lunghezza];
		/*clone con dimensione lunghezza*/
		for(int i =0;i<a.length;i++){
			/*ciclo for per leggere tutta a*/
			if(a[i]%2==1&& a[i]>=min && a[i]<=max){
				/**se l'elemento di a non è pari e comprende tra max e min allora:*/
				clone[j] = a[i];//l'elemento di clone è uguale all'elemento di a;
				j++;//vai alla colonna successiva
			}
		}
		return clone;//ritorna clone
	}
	public static boolean[] trasduttore(int[] a, int limiteSuperiore){
		int lunghezza=0;//lunghezza dell'array clone
		for(int i = 0; i< a.length;i++){
			/*ciclo for per la lettura dell'array a*/
			if(a[i]<limiteSuperiore){
				/*se l'elemento è minore del limiteSuperiore allora:*/
				lunghezza++;//sommi di 1 la lunghezza
			}
		}
		int j = 0;//variabile contatrice per il nuovo array clone;
		boolean[] clone = new boolean[lunghezza];//array di tipo boolean clone
		for(int i = 0; i< a.length;i++){
			/*lettura dell'array a*/
			if(a[i]<limiteSuperiore){
				/*se l'elemento è minore del limiteSuperiore allora:*/
				System.out.print(a[i]);//stampa il numero
				clone[j] = true;//e l'elemento di clone è true
				j++;//vai all'elemento successivo di clone
			}
		}
		return clone;//ritorna clone
	}
	public static void stampaArrayBoolean(boolean[] a){
		for(int i = 0; i<a.length;i++){
			/*ciclo for per la lettura di clone*/
			System.out.print(" " +a[i]);//stampa i valori di clone
		}
	}
	public static boolean eqArray(int[] a, int[] b){
		boolean verifica = false;//verifica se l'array a e uguale o no all'array b
		if(a == null && b==null){
			/*se a e b sono nulli allora :*/
			//verifica è uguale a true
			return verifica;//ritorni verifica
		}
		else{
			for(int i = 0; i<a.length; i++){
				/*ciclo for per tutti gli elementi di a*/
				for(int j = 0; j<b.length;j++){
					/*ciclo for per tutti gli elementi di b*/
					if(a[i]==b[j]){
						/*se l'elemento corrente di a e b sono uguali allora :*/
						verifica = true;//verifica è uguale a true
						return verifica;//ritorni verifica
					}
					else{
						/*altrimenti :*/
						return verifica;//ritorni verifica che è false
					}
				}
			}
		}
		return verifica;//ritorni verifica
	}
	public static boolean tuttiPariMaggioriDi(int[]a,int num){
		boolean verifica = false;//verifica se sono pari e maggiore di num
		if(a== null){
			/*se a è null*/
			return verifica;//ritorni verifica
		}
		else{
			/*altrimenti*/
			for(int i = 0; i< a.length;i++){
				/*ciclo for per la lettura degli elementi di a*/
				if(a[i]%2==0 && a[i]>num){
					/*se a è pari e maggiore di num allora :*/
					verifica =true;//verifica è true 
					return verifica;//ritorni verifica
				}
				else{
					/*altrimenti:*/
					return verifica;//ritorni verifica false
				}
			}
		}
		return verifica;//ritorni verifica
	}
	public static boolean eqArrayRic(int[] a, int[] b,int i,int j,boolean verifica){
		if(a == null && b == null){
			/*se la a e b sono nulli*/
			return verifica;//ritorna verifica false
		}
		else{
			/*altrimenti :*/
			if(i>=0 && j >= 0){
				/*se la i non arriva a 0 allora:*/
				if(a[i]==b[j]){
					/*se l'elemento di a è uguale a quello di b allora*/
					verifica = true;//verifica è true
					return eqArrayRic(a,b,i-1,j-1,verifica);//decrementi ì all'elemento antecedente
				}
				else{
					/*altrimenti:*/
					return eqArrayRic(a,b,i-1,j-1,verifica);//solo decrementi all'elemento antecedente;
				}
			}
			return verifica;
		}
	}
	public static boolean tuttiPariMaggioriDiRic(int[] a,int num,int i,boolean verifica){
		if(a== null){
			/*se a è null*/
			return verifica;//ritorni verifica
		}
		else{
			if(i>=0){
				/*finchè non arriva a 0*/
				if(a[i]%2==0 && a[i]>num){
					/*se l'elemento è pari e maggiore di num allora*/
					verifica = true;//verifica è true
					return tuttiPariMaggioriDiRic(a,num,i-1,verifica);//passa all'elemento antecedente
				}
				else{
					verifica = false;//verifica è false
					return tuttiPariMaggioriDiRic(a,num,i-1,verifica);//passa all'elemento antecedente
				}
			}
		}
		return verifica;//ritorna verifica
	}
	public static int indiceSubSeqRic(int[] a, int[] b,int i,int j,int verifica){
		/*metodo ricorsivo*/
		if(a==null || b == null){
			/*se l'array a e b sono vuoti*/
			return -1;//return -1
		}
		else{
			/*altrimenti*/
			if(i<a.length && j<b.length){
				/*se la i e j non raggiungono la lunghezza massima dell'array allora*/
				if(a[i] == b[j]){
					/*se l'elemento a è uguale a quello di b allora:*/
					verifica = i-j;//differenza tra le due colonne
					return indiceSubSeqRic(a,b,i+1,j+1,verifica);//incrementi di 1 all'elemento successivo
				}
				else{
					/*altrimenti*/
					verifica= -1;//verifica è -1
					return indiceSubSeqRic(a,b,i+1,0,verifica);//torna dall'inizio sull'array b e vai all'elemento successivo dell'array a
				}
			}
		}
		return verifica;//ritorna verifica
	}
	public static int indiceSubSeq(int [] a, int [] b){
		/*Metodo iterativo*/
		int j =0;//indice l'array b
		for(int i = 0; i < a.length;i++){
			if(j==b.length){
				/*se trovo una sequenza allora :*/
				return i-j;//ritoni la differenza tra l'indice di a - b
			}
			if(a[i]==b[j]){
				j++;//se trova un elemento uguale allora conta di 1
			}
			else{
				j=0;//torno all'elemento iniziale di b
			}
		}
		return -1;//ritorna -1
	}
}