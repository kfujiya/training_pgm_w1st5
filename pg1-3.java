import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0 || i % 10 == 3 || (i / 10) % 10 == 3){
                System.out.println("hoge");
            }else{
                System.out.println(i);
            }
        }
    }
}
