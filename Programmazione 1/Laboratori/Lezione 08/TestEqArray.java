public class TestEqArray{
	public static void main (String [] args){
		int [] a1 = {0, 2, 3, 5, -4, 9, 10};
		int [] a2 = {6, 4, 4, 8, 12, 4, 22};
		int [] a3 = {10, 7, 5, 99, 31, 20};
		int [] a4 = {5, 7, 8, 9, 12};
		int [] a5 = MetodiSuArray.clonaArray(a2);
		int [] a6 = null;
		int ia1 =a1.length-1;
		int ia2 =a2.length-1;
		int ia3 =a3.length-1;
		int ia4 =a4.length-1;
		int ia5 =a5.length-1;
		boolean verifica = false;
		System.out.println("Esercizio eqArray");
		System.out.println("Il risultato e' :"+MetodiSuArray.eqArray(a1,a2));
		System.out.println("Il risultato e' :"+MetodiSuArray.eqArray(a4,a2));
		System.out.println("Il risultato e' :"+MetodiSuArray.eqArray(a5,a2));
		System.out.println("Il risultato e' :"+MetodiSuArray.eqArray(a3,a3));
		//System.out.println("Il risultato e' :"+MetodiSuArray.eqArray(a2,a6));//errore
		//System.out.println("Il risultato e' :"+MetodiSuArray.eqArray(a6,a6));//vuoto
		MetodiSuArray.separa();
		System.out.println("Esercizio eqArray con ricorsione");
		System.out.println("Il risultato e' :"+MetodiSuArray.eqArrayRic(a1,a2,ia1,ia2,verifica));
		System.out.println("Il risultato e' :"+MetodiSuArray.eqArrayRic(a4,a2,ia4,ia2,verifica));
		System.out.println("Il risultato e' :"+MetodiSuArray.eqArrayRic(a5,a2,ia5,ia2,verifica));
		System.out.println("Il risultato e' :"+MetodiSuArray.eqArrayRic(a3,a3,ia3,ia3,verifica));
		//System.out.println("Il risultato e' :"+MetodiSuArray.eqArray(a2,a6,ia2,ia6,verifica));//errore
		//System.out.println("Il risultato e' :"+MetodiSuArray.eqArray(a6,a6,ia6,ia6,verifica));vuoto
		MetodiSuArray.separa();
		System.out.println("Esercizio tuttiPariMaggioriDi");
		System.out.println("Il risultato e' :"+MetodiSuArray.tuttiPariMaggioriDi(a1,0));
		System.out.println("Il risultato e' :"+MetodiSuArray.tuttiPariMaggioriDi(a2,2));
		System.out.println("Il risultato e' :"+MetodiSuArray.tuttiPariMaggioriDi(a2,8));
		System.out.println("Il risultato e' :"+MetodiSuArray.tuttiPariMaggioriDi(a4,-5));
		//System.out.println("Il risultato e' :"+MetodiSuArray.tuttiPariMaggioriDi(a6,3));//errore
		MetodiSuArray.separa();
		System.out.println("Esercizio tuttiPariMaggioriDi con Ricorsione");
		System.out.println("Il risultato e' :"+MetodiSuArray.tuttiPariMaggioriDiRic(a1,0,ia1,verifica));
		System.out.println("Il risultato e' :"+MetodiSuArray.tuttiPariMaggioriDiRic(a2,2,ia2,verifica));
		System.out.println("Il risultato e' :"+MetodiSuArray.tuttiPariMaggioriDiRic(a2,8,ia2,verifica));
		System.out.println("Il risultato e' :"+MetodiSuArray.tuttiPariMaggioriDiRic(a4,-5,ia4,verifica));
		//System.out.println("Il risultato e' :"+MetodiSuArray.tuttiPariMaggioriDi(a6,3,ia6,verifica));//errore
	}
}