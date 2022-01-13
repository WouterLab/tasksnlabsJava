public class Task2{
	public static void main(String[] args){
		int[] a={10, 4, 1, 4, -10, -50, 32, 21};
	System.out.println(differenceMaxMin(a));
	}
	public static int differenceMaxMin(int[] a) {
		int max=a[1];
		int min=a[1];
		for (int i=0;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
			}
			if(a[i]<min){
				min=a[i];
			}
		}
		return(max-min);
		}
}