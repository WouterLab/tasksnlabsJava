public class Task10 {
    public static void main(String[] args){
        System.out.println(hexLattice(19));
    }
	 private static int sixSer(int b){ // функция,находящая длину серединной линии не учитывая пробелов
        if (b < 19 && b != 7) return -1;
        if (b == 7) return 3;
        int ser = 5;
        while (1 > 0){
            int v = ser + (ser-1)*2 + (ser-2)*2;
            if(v == b) return ser;
            if( v > b) return -1;
            ser+=2;
        }
    }
    private static String hexLattice(int a){
        if( a == 1) return " o ";
        String str = "";
        int ser = sixSer(a); // нахождение количества кружков в серединной линии
        if( ser == -1) return "Invalid!";
        str+="  ";
        for(int i=0;i<(ser-2)*2;i++){
            if(i % 2 == 0) str+= " ";
            else str+= "o";
        } str+="  \n ";
        for(int i=0;i<(ser-1)*2;i++){
            if( i % 2 == 0) str+= " ";
            else str+= "o";
        } str+= " \n";
        for(int i=0;i<ser*2;i++){
            if( i % 2 == 0) str+=" ";
            else str+= "o";
        } str+= "\n ";
        for(int i=0;i<(ser-1)*2;i++){
            if( i % 2 == 0) str+= " ";
            else str+= "o";
        } str+= " \n  ";
        for(int i=0;i<(ser-2)*2;i++){
            if(i % 2 == 0) str+= " ";
            else str+= "o";
        } str+="  \n ";
        return str;
    }
}