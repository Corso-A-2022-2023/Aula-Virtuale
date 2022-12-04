public class MatriciBase{
	public static void main(String[] args){
		final int[][] mat1 = { {1,0,0}, {0,1,0}, {0,0,1} };
		int[][] mat2 =new int[10][10];//dichiaro una matrice da 10x10
		for(int i = 1; i< mat2.length; i++){
			/*for per leggere le righe della matrice*/
			for(int j = 1; j<mat2[i].length;j++){
				/*for per leggere le colonne della matrice*/
				mat2[i][j]=i*j;//operazione di moltiplicazione tra le righe e colonne;
			}
		}
		ArrayDiArrays.stampaMatrice(mat2);
		System.out.println();
		System.out.println();
		int[][] mat3= new int[8][];
		int[] riga0 ={8,3,2,4,1,6,9,1};
		mat3[0]= riga0;
		for(int i = 1; i < mat3.length; i++){
			/*lettura delle riga di mat3*/
			int[] r = new int[mat3[i-1].length-1];//array per dire che corrisponde all'antecedente riga
			for(int j = 0; j < r.length; j++){
				/*for per leggere le colonne di r*/
				r[j] = mat3[i-1][j] + mat3[i-1][j+1];//operazione da fare per richiesta del problema
			}
			mat3[i] = r;//elemento della riga corrente è uguale a r
		}
		ArrayDiArrays.stampaMatrice(mat3);//stampa mat3
	}
}