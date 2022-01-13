public class Task4{
	public static void main(String[] args){
	System.out.println(profitableGamble(0.9,1,2));
	}
	public static boolean profitableGamble(double prob,int prize,int pay){
		if (prob * prize > pay){
			return(true);
	}
		else {
			return(false);
		}
	}
}