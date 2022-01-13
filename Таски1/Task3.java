public class Task3{
	public static void main(String[] args){
	System.out.println(animals(2,3,5));
	}
	public static int animals(int chickens, int cows, int pigs){
		chickens=chickens*2;
		cows=cows*4;
		pigs=pigs*4;
		return(chickens+cows+pigs);
	}
}