public class Task9{
	public static void main(String[] args){
	System.out.println(isSuffix("arachnophobia", "-phobia"));
	System.out.println(isPrefix("automation", "auto-"));
	}
	
	public static boolean isSuffix(String word, String suf) {
		suf = suf.replace("-", "");//убираем -
		int raz = word.length() - suf.length();
		for (int i = raz; i < suf.length(); i++) {
			if (suf.charAt(i - raz) == word.charAt(i)) {
				continue;
			}
			else {
				return false;
			}
		}
		return true;
	}
	public static boolean isPrefix(String word, String pref) {
		pref = pref.replace("-", "");
		for (int i = 0; i < pref.length(); i++) {;
			if (pref.charAt(i) == word.charAt(i)) {
				continue;
			}
			else {
				return false;
			}
		}
		return true;
	}

}