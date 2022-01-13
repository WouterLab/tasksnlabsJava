public class Task9 {
    public static void main(String[] args){
        System.out.println(correctTitle("sansa stark, lady of winterfell."));
    }
 	public static String correctTitle(String str) {
		String[] words = str.split(" ");
		String output = "";
		for (int i = 0; i < words.length; i++) {
			if (i>0) {
				output += " ";
			}
			String[] wordsNoHyphens = words[i].split("-");
			for (int j = 0; j < wordsNoHyphens.length; j++) {
				if(j>0) {
					output += "-";
				}
				if (wordsNoHyphens[j].equalsIgnoreCase("and")
					 || wordsNoHyphens[j].equalsIgnoreCase("the")
					 || wordsNoHyphens[j].equalsIgnoreCase("of")
					 || wordsNoHyphens[j].equalsIgnoreCase("in")) {
					output += wordsNoHyphens[j].toLowerCase();
				}
				else {
					output += wordsNoHyphens[j].substring(0,1).toUpperCase();
					output += wordsNoHyphens[j].substring(1).toLowerCase();
				}
			}
		}
		
		return output;
	}
}