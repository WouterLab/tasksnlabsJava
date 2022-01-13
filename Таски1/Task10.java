public class Task10{
	public static void main(String[] args){
	System.out.println(abcmath(42,5,10));
	}
	public static boolean abcmath(int a,int b,int c) {
		for (int i = 0; i < b; i++) {
			a += a;
		}
		return (a % c == 0);
	}
}