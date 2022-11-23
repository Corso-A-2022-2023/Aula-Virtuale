public class TestSubSeq{
	public static void main(String [] args){
		int[]a ={1, 2, 3, 1, 2, 3};
		int[]b ={2,3};
		boolean verifica = false;
		int trova =MetodiSuArray.indiceSubSeq(a,b,verifica);
		System.out.println(trova);
	}
}