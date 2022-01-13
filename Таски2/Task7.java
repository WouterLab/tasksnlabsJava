public class Task7{
	public static void main(String[] args){
	System.out.println(isValid("853a7"));
	}
	public static boolean isValid(String ind) {
	if (ind.length()!=5){
			return false;
		}
	 try {
			int number = Integer.parseInt(ind);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
}