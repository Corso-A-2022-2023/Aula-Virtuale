public class TestSubSeq{
	public static void main(String [] args){
		int[]a ={1, 2, 3, 1, 2, 3};
		int[]b ={1,2};
		int i = 0;
		int j = 0;
		int verifica = 0;
		int trova =MetodiSuArray.indiceSubSeqRic(a,b,i,j,verifica);
		int trova1 =MetodiSuArray.indiceSubSeq(a,b);
		System.out.println(trova);
		System.out.println(trova1);
	}
}