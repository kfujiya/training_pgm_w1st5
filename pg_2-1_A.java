import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        String intimes = sc.nextLine();
        Integer enter = Integer.parseInt(intimes);
        
        int i, j;
        
        for (i = 1; i <= enter; i++){
            String wordin = sc.nextLine();
            String rmvspace = wordin.replaceAll(" ", "");
            
            if(rmvspace.length() > 30){
                break;
            }
            
            String revword = "";
            
            for (j = (rmvspace.length() - 1); j >= 0; --j) {
                
                revword = revword + rmvspace.charAt(j);
                
             }
            
            if (rmvspace.toLowerCase().equals(revword.toLowerCase())) {
                 System.out.println("Yes");
            }
            
            else {
                System.out.println("No");
            }
        }
    }
}