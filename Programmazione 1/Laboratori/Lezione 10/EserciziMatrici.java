public class EserciziMatrici{
	public static void main(String [] args){
		System.out.println("Esercizio 1: ");
		int[] a1 = {3, 5, 7}, a2 = {2, 10, 8, 9}, a3 = {8};
		int[][] m1 = initAlt(a1, a2, 6), m2 = initAlt(a3, null, 5), m3 = initAlt(null, a2, 4);
		System.out.println(toString(m1));
		System.out.println(toString(m2));
		System.out.println(toString(m3));
		int[]l1=linearizzaRighe(m1);
		int[]l2=linearizzaRighe(m2);
		int[]l3=linearizzaRighe(m3);
		System.out.println(toStringArray(l1));
		System.out.println(toStringArray(l2));
		System.out.println(toStringArray(l3));
		System.out.println();
		System.out.println("Esercizio 2");
		int[][] m4 = { {2,5,6}, {3,7,8,9,1}, {0,2}, {0,3,9,1} };
		System.out.println(toStringArray(sommaRighe(m1)));
		//System.out.println(toStringArray(sommaRighe(m2)));
		//System.out.println(toStringArray(sommaRighe(m3)));
		System.out.println(toStringArray(sommaRighe(m4)));
		System.out.println();
		System.out.println("Esercizio 3");
		for(int i =0 ; i< m4.length; i++){
			azzeraColonnaMax(m4);
			System.out.println(toString(m4));
			System.out.println();
		}
		System.out.println();
		System.out.println("Esercizio 4");
		int[][] m5 = { {1, 5, 10, 7}, {3, 12, 21, 30}, {5, 10, 20, 30} }; // true
		int[][] m6 = { {4, 7, 2, 5}, {7, 9, 20, 12}, {5, 8, 11, 21} }; // false
	}
	public static int [][]  initAlt(int[] matp, int[] matd, int numr) {
		int [][] matClone;
		int elementi=0;
		matClone = new int[numr][];
		for(int i = 0; i<matClone.length; i++){
			if(i%2==0){
				matClone[i] = clonaArray(matp);
			}
			else{
				matClone[i] = clonaArray(matd);
			}
		}
		return matClone;
	}
	public static int[] clonaArray(int []a){
		if(a == null){
			return null;
		}
		int [] clone = new int[a.length];
		for(int i = 0; i<a.length;i++){
			clone[i]=a[i];
		}
		return clone;
	}
	public static int contaElementi(int[][] mat){
		if(mat==null){
			return 0;
		}
		int count = 0;
		for(int i = 0; i<mat.length;i++){
			if(mat[i]!=null){
				count += mat[i].length;
			}
		}
		return count;
	}
	public static int[] linearizzaRighe(int[][] mat){
		if(mat == null){
			return null;
		}
		int[] clone = new int[contaElementi(mat)];
		int k = 0;
		for(int i =0; i< mat.length; i++){
			if(mat[i]!=null){
				for(int j = 0; j<mat[i].length; j++){
					clone[k++]= mat[i][j];	
				}
			}
		}
		return clone;
	}
	public static String toString(int[][] mat){
		String stringa = "";
		if(mat != null){
			for(int i = 0; i<mat.length;i++){
				if(mat[i]!=null){
					stringa+= "{";
					for(int j = 0; j< mat[i].length;j++){
						if(j>0){
							stringa+=",";
						}
						stringa+=mat[i][j];
					}
					stringa+= "}\n";		
				}
				else{
					stringa+="null\n";
				}
			}
		}
		return stringa;
	}
	public static String toStringArray(int[]a){
		String stringa ="";
		if(a!=null){
			stringa+="{";
			for(int i =0; i<a.length; i++){
				stringa+=a[i];
				if(i==a.length-1){
					stringa+="";
				}
				else{
					stringa+=",";
				}
			}
			stringa+="}\n";
		}
		else{
			stringa+="null\n";
		}
		return stringa;
	}
	public static int maxRowLen(int[][] mat){
		int count = 0;
		int max = Integer.MIN_VALUE;
		if(mat == null){
			return 0;
		}
		else{
			for(int i = 0; i< mat.length; i++){
				count = 0;
				for(int j = 0; j<mat[i].length;j++){
					count++;
				}
				if(count>max){
					max=count;
				}
			}
		}
		return max;
	}
	public static int [] sommaRighe(int[][] mat){
		if (mat == null)
			return null;
		// Alloca un array che abbia un elemento per ogni
		// colonna della matrice mat.
		int[] out = new int[maxRowLen(mat)];
		// Accumula in out[] la somma delle colonne di mat
		for (int i=0; i<mat.length; i++) {
			if (mat[i] != null)
				for (int j=0; j<mat[i].length; j++)
					out[j] += mat[i][j];
		}

		return out;
	}
	public static void azzeraColonnaMax(int [][] mat){
		int[] azzera = sommaRighe(mat);
		int max = Integer.MIN_VALUE;
		int colonna = 0;
		for(int i = 0; i<azzera.length;i++){
			if(azzera[i]>max){
				max= azzera[i];
				colonna = i;
			}
		}
		for(int i = 0; i< mat.length;i++){
			for(int j=0 ; j< mat[i].length;j++){
				if(j== colonna){
					mat[i][j]=0;
				}
			}
		}
	}

}