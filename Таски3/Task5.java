import java.util.*;
public class Task5{
	public static void main(String[] args){
	System.out.println(isValidHexCode("#CD5C5C"));
	}
	public static boolean isValidHexCode(String s) {
	String[] test = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "A", "B", "C", "D", "E", "F","a", "b", "c", "d", "e", "f"};
	List<String> list=Arrays.asList(test);
	Character ss=s.charAt(0);
	if((s.length()==7) && ss=='#'){	
		for (int i = 1; i < s.length(); i++) {
			if (list.contains(Character.toString(s.charAt(i)))){
				continue;
			}
			else{
				return (false);
			}
		}
		return (true);
	}
	return (false);
	}
}