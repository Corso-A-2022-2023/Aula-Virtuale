public class TestFiltriArray{
	public static void main(String [] args){
		System.out.println("Esercizio filtroMinoriDi: ");
		int [] a = MetodiSuArray.initArrayInt();
		int limiteSuperiore = 10;
		int [] ArrMinoreDi=MetodiSuArray.filtroMinoriDi(a,limiteSuperiore);
		MetodiSuArray.stampaArrayInt(ArrMinoreDi);
		MetodiSuArray.separa();
		System.out.println("Esercizio filtroIntervalloDisp: ");
		int[] b = MetodiSuArray.initArrayInt();
		int min = 1;
		int max = 10;
		int[]ArrIntervalloDisp=MetodiSuArray.filtroIntervalloDisp(b,min,max);
		MetodiSuArray.stampaArrayInt(ArrIntervalloDisp);
		MetodiSuArray.separa();
		System.out.println("Esercizio trasduttore");
		int[] c  =MetodiSuArray.initArrayInt();
		boolean[] ArrTrasduttore = MetodiSuArray.trasduttore(c,limiteSuperiore);
		MetodiSuArray.stampaArrayBoolean(ArrTrasduttore);
	}
}