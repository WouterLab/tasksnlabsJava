public class Task3{
	public static void main(String[] args){
		int[] a={1, 2, 3, 4};
	System.out.println(isAvgWhole(a));
	}
	public static boolean isAvgWhole(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum+=a[i];
		}
		if(sum%a.length==0){
			return (true);
		}
		return (false);
		}
}