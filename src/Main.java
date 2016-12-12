/**
 * Created by a165756 on 2016/12/12.
 */

public class Main {
    public static void main(String[] args){
        String str = "3．14";
        try {
            System.out.printf("%s", str.length());
        }catch(NullPointerException s){
            System.out.println("NullPointerExceptionが発生した。");
            s.printStackTrace();
        }
        double value = Double.parseDouble(str);
    }
}