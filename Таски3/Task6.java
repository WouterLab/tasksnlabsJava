import java.util.*;
public class Task6{
	public static void main(String[] args){
	int[] arr1={1, 3, 4, 4, 4};
	int[] arr2={2, 5, 7};
	System.out.println(same(arr1,arr2));
	}
	public static boolean same(int[] arr1,int[] arr2) {
	ArrayList<Integer> list1 = new ArrayList<>();
	ArrayList<Integer> list2 = new ArrayList<>();
	for(int i=0;i<arr1.length;i++){
	list1.add(arr1[i]);
	}
	for(int i=0;i<arr2.length;i++){
	list2.add(arr2[i]);
	}
	for(int i=0;i<list1.size();i++){
			for(int j=1;j<arr1.length;j++){
				if (arr1[i]==arr1[j]&&(i!=j)) {
					list1.remove(i);
				}
			}	
		}	
	for(int i=0;i<list2.size()-1;i++){
			for(int j=1;j<arr2.length;j++){
				if (arr2[i]==arr2[j]&&(i!=j)) {
					list2.remove(i);
				}
			}	
		}
	if(list1.size()==list2.size()){
		return true;
		}
	return false;
	}
}
