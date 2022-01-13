public class Task4{
	public static void main(String[] args){
	System.out.println(flipEndChars("Cat, dog, and mouse."));
	}
public static String flipEndChars(String s) {
		if(s.length()<2){//когда длина строки меньше двух
			return "Incompatible.";
		}
		if(s.charAt(0)==s.charAt(s.length()-1)){
			return "Two's a pair.";
		}
		char[] chars = s.toCharArray();//превращаем строку в массив чаров 
		char a=chars[0];
		chars[0]=chars[s.length()-1];
		chars[s.length()-1]=a;
		return String.valueOf(chars);
	}
}