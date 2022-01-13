public class Task8{
	public static void main(String[] args){
	System.out.println(isStrangePair("mice","eicl"));
	}
	public static boolean isStrangePair(String a,String b) {
	if((a.charAt(0)==b.charAt(b.length()-1))&&(a.charAt(a.length()-1)==b.charAt(0))){
		return (true);
	}
	return (false);
	}
}