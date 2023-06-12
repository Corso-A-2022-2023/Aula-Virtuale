class Node<T> {
	public T elem;
	public Node<T> next;
	public Node(T elem, Node<T> next) {
		this.elem = elem;
		this.next = next;
	}
	public static <T> boolean controlla(Node<T> p, Node<T> q) {
		if(p==null || q==null)
			return false;
		/*if(p.elem == q.elem){
			return true;
		}*/
		return(p.elem == q.elem)? true:controlla(p.next,q.next);
	}
	//Esercizio 3
	/*
	*1) Secondo m4 controlla che la matrice se l'elemento riga-colonna con
	* quello colonna-riga sono diversi ritorni false altrimenti true
	*2) per controllare i casi in cui il metodo dia errore aggiungo un assert con l'aggiunta del metodo
	* ok(T[][] a) faccio i seguenti  controlli:
	* a) se la matrice è nulla allora return false
	* b)se la matrice è maggiore o uguale alla lunghezza massima allora è false
	* c)true se supera tutti i controlli
	* */
	public static <T> boolean m4(T[][] a) {
		//Aggiunta assert
		assert ok(a) :"errore nella matrice";
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a.length; j++)
				if (!a[i][j].equals(a[j][i])) return false;
		return true;
	}
	public static <T>boolean ok(T[][]a){
		int i = 0;
		while(i<a.length){
			if((a==null || a[i].length< a.length))
				return false;
			i++;
		}
		return true;
	}
	public static void main(String [] args){

		Node<Integer> p1 =new Node<Integer>(5,new Node(7,null));
		Node<Integer> q1 =new Node<Integer>(8,new Node(7,new Node<Integer>(1,null)));
		boolean check1 = controlla(p1,q1);
		System.out.println(check1);
		Node<Boolean> p2 = new Node<Boolean>(true,new Node<Boolean>(false,new Node<Boolean>(false,null)));
		Node<Boolean> q2 = new Node<Boolean>(false,new Node<Boolean>(true,new Node<Boolean>(false,null)));
		boolean check2 = controlla(p2,q2);
		System.out.println(check2);
		Node<Integer> p3 =new Node<Integer>(3,new Node<Integer>(null,new Node<Integer>(4,null)));
		Node<Integer> q3 =new Node<Integer>(1,new Node<Integer>(null,null));
		boolean check3 = controlla(p3,q3);
		System.out.println(check3);
		Node<Integer> p4 =new Node<Integer>(1,new Node<Integer>(2,null));
		Node<Integer> q4 =new Node<Integer>(2,new Node<Integer>(1,null));
		boolean check4 = controlla(p4,q4);
		System.out.println(check4);
		Node<String> p5 =null;
		Node<String> q5 =new Node<String>("ciao",null);
		boolean check5 = controlla(p5,q5);
		System.out.println(check5);

		//Esercizio 2
		//Guarda al fondo del file
		/*A obj = new B();
		obj.m2(obj);*/
		A obj = new C();
		obj.m1();
		/*A obj = new C();
		obj.m2(obj);*/
		//Esercizio 3
		//Guarda il metodo m4 della classe Node
	}

}
abstract class A {
	public abstract void m1();
}
//
abstract class B extends A {
	public void m1()
	{ System.out.println("B.m1"); }
	public abstract void m2(A obj);//1) se lo commenti funziona
}
class C extends B {
	public void m1()
	{
		System.out.println("C.m1");
		super.m1();
	}
	public void m2(A obj)
	{
		System.out.println("B.m2");
		obj.m1();
	}
}
/*
 * 1) Se si eliminasse il metodo m2 dalla classe B funzionerebbe comunque dato che il metodo m2 era di tipo
 * abstract e il metodo m2 sarebbe appartenete alla classe C
 *2)Non avrebbe funzionato dato che non può essere istanziata e inoltre Non esiste un metodo m2 in A
 *
 * 3)Il programma funziona e stampa C.m1 e B.m1 perchè stiamo passando il metodo nella classe C dove stampa il risultato
 *
 * 4) Il programma non funziona e da un errore dato che in A non esiste il metodo m2
 * */




