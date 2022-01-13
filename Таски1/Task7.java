import java.util.ArrayList;
public class Task7{
	public static void main(String[] args){
	System.out.println(addUpTo(7));
	}
	public static int addUpTo(int a){
	ArrayList <Integer> chisla = new ArrayList<>();
	int count=0;
	for(int i=1;i<=a;i++){
		chisla.add(i);
		count=count+i;
	}
	//System.out.println(chisla);
	return count;
	}
}