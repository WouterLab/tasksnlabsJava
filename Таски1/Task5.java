import java.lang.Math;
public class Task5{
	public static void main(String[] args){
	System.out.println(operation(24, 15, 9));
	}
	public static String operation(int n,int a,int b){
		if ((a*b==n)||(b*a==n)){
			return("multiplication");
		}
		if ((a/b==n)||(b/a==n)){
			return("divide");
		}
		if ((a+b)==n){
			return("added");
		}
		if ((a-b)==n||(b-a)==n){
			return("subtracted");
		}
		return ("none");
	}
}