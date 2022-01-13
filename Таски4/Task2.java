import java.util.*;

public class Task2{
	public static void main(String[] args){
	System.out.println(Arrays.toString(split("((())())(()(()()))")));
	}
	public static String[] split(String str) {
		List<String> list = new ArrayList<>();
		int count = 0;
		int lastIndex = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				count++;
			}
			else {
				count--;
			}
			if (count == 0) {
				list.add(str.substring(lastIndex, i + 1));
				lastIndex = i + 1;
			}
		}
		String[] strs = new String[list.size()];
		return strs = list.toArray(strs);
	}
}