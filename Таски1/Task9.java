public class Task9{
	public static void main(String[] args){
	int[] c={3,4,5};
	System.out.println(sumOfCubes(c));
	}
	public static int sumOfCubes(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			count += Math.pow(a[i], 3);
		}
		return count;
	}
}