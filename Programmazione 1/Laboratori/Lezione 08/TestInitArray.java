public class TestInitArray{
	public static void main (String [] args ){
		/*Esercizio 1*/
		System.out.println("Esercizio 1");
		int [] array = MetodiSuArray.initArrayInt();//Genero l'array
		MetodiSuArray.stampaArrayInt(array);//Stampo l'array
		MetodiSuArray.separa();//separatore degli esercizi
		/*Esercizio 2*/
		System.out.println("Esercizio 2");
		System.out.println();
		System.out.println("Copia elementi");
		int [] from = MetodiSuArray.initArrayInt();//dichiarazione dell'array from
		int [] to = new int [from.length];//dichiarazione dell'array to
		MetodiSuArray.copiaElementi(from,to);//fase della copia degli elementi
		MetodiSuArray.stampaArrayInt(to);//stampa array
		MetodiSuArray.separa();//separatore
		System.out.println("Clona array");
		int [] a = MetodiSuArray.initArrayInt();//dichiarazione dell'array a
		int [] clone = MetodiSuArray.clonaArray(a);//fase di clonazione dell'array
		MetodiSuArray.stampaArrayInt(clone);//stampa array a 
	}
}