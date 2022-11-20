import java.util.Scanner;
public class TestPermutazioni{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		System.out.println("Inserisci la stringa : ");
		String stringa = input.nextLine();
		System.out.println("Inserisci la posizione : ");
		int posizione = input.nextInt();
		System.out.println(MetodiRicorsivi.eliminaCarattere(stringa,posizione));
		MetodiRicorsivi.separa();
		System.out.println();
		System.out.println("Inserisci la stringa da permutare :");
		String stringa1 = input1.nextLine();
		MetodiRicorsivi.permutazioniStringa(stringa1);
	}
}