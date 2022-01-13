import java.util.*;
public class Task5 {
    public static void main(String[] args) {
    	String[] s={"toe", "ocelot", "maniac"};
        System.out.println(Arrays.toString(sameVowelGroup(s)));
    }
    public static String[] sameVowelGroup(String[] words) {
			boolean first = true;
			String wordVowels="";
			String vowels = "aeiou";

			ArrayList<String> results = new ArrayList<>();

			for (String word : words) {
					if (first) {
							first=false;
							wordVowels = getUniqueVowels(word);
							if (wordVowels.length()==0)
									break;
							continue;
					}

					StringBuilder vb = new StringBuilder(vowels);

					boolean valid = true;
					for (int i=0;i<word.length();i++) {
							char c = word.charAt(i);
							if (vowels.contains(Character.toString(c))) {
									if (!wordVowels.toString().contains(Character.toString(c))) {
											valid = false;
											break;
									}   
							} 
					}

					if (valid) {
							if (results.isEmpty())
									results.add(words[0]);
							results.add(word);
					}
			}

			if (results.isEmpty())
					results.add(words[0]);

			return results.toArray(new String[results.size()]);
	}

	public static String getUniqueVowels(String str) {
			StringBuilder sb = new StringBuilder();
			HashSet<Character> set = new HashSet<>();
			String vowels = "aeiou";

			for (int i=0;i<str.length();i++) {
					char c = str.charAt(i);
					if (vowels.contains(Character.toString(c))) {
							if (set.add(c))
									sb.append(c);
					}   
					if (sb.length()==5)
							break;
			}
			return sb.toString();		
	} 				
}