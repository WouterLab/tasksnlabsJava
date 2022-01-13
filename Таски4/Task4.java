import java.util.*;
public class Task4{
	public static void main(String[] args){
		double[] arr={9, 17, 30, 1.5};
	System.out.println(overTime(arr));
	}
	public static String overTime(double[] arr) {
		double sum=0.0;
		for(double i=arr[0]; i<arr[1]; i+=0.25){
			if(i<17){
				sum += 0.25 * arr[2];
			}else if(i>=17){
				sum += 0.25 * arr[2] * arr[3];
			}
		}
		return String.format("$%.2f", sum);
	}
}