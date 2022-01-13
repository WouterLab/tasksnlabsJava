public class Task10{
	public static void main(String[] args){
	System.out.println(boxSeq(1));
	}
	public static int boxSeq(int step) {
	if (step % 2 != 0) {
			return step+2;
		}
		return step;
	}
}