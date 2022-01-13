public class Task6{
    public static void main(String[] args){
    System.out.println(bugger(999));
    }
public static int bugger(int num) {
        int count = 0;

        while(Integer.valueOf(num).toString().toCharArray().length > 1){
            int newNum = 1;
            for(char c : Integer.valueOf(num).toString().toCharArray()){
                newNum *= Integer.valueOf(String.valueOf(c));
            }
            num = newNum;
            count += 1;
        }
        return count;
    }
}