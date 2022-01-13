import java.util.*;
public class Task10{
	public static void main(String[] args){
	System.out.println(rightTriangle(3,4,5));
	}
	public static boolean rightTriangle(int a, int b, int c) {
	int[] arr = {a, b, c};
		Arrays.sort(arr);
		return (Math.sqrt(Math.pow(arr[0], 2) + Math.pow(arr[1], 2)) == arr[2]);
	}
}