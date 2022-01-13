import java.util.*;
public class Task4{
	public static void main(String[] args){
		int[] a={3, 3, -2, 408, 3, 3};
	System.out.println(Arrays.toString(cumulativeSum(a)));
	}
	public static int[] cumulativeSum(int[] a) {
		int[] new_mass=new int[a.length];
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum+=a[i];
			new_mass[i]=sum;
		}
		return (new_mass); 
	}
}