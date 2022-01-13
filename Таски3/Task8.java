public class Task8{
	public static void main(String[] args){
	System.out.println(longestZero("00010100000011"));
	}
	public static String longestZero(String s) {
		int count = 0;
		int a = 0;
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			if (Character.toString(s.charAt(i)).equals("0")) {
				a++;
			}
			else {
				a = 0;
			}
			if (a > count) {
				count=a;
			}
		}
		for (int i = 0; i < count; i++) {
			result += "0";
		}
		return result;
	}
}