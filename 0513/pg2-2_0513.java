import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        //“ü—Íƒ`ƒFƒbƒN‚ğ‚·‚éƒ‰ƒCƒuƒ‰ƒŠ
        
        String N = sc.nextLine();
        Integer X = Integer.parseInt(N);
        //•¶š—ñ”‚ÌŒˆ’è
        
        for(int i = 0; i < X; i++){ //X‰ñ•ª‚Ì‰ñ•¶”»’è
            String sample = sc.nextLine();
            //ƒTƒ“ƒvƒ‹‚Ì•¶š—ñ
            
            String sample2 = sample.replaceAll(" ", "");
            //”¼ŠpƒXƒy[ƒX‚ğÁ‚·
            
            String resample = new StringBuilder(sample2).reverse().toString();
            //‹t‚É‚µ‚½•¶š—ñ
            
            
            //ƒTƒ“ƒvƒ‹‚Ì•¶š—ñ‚ğ2•¶š’Šo
            //‹t•¶š—ñ‚ğ2•¶š’Šo
            
            //”äŠr‚µ‚Äˆá‚Á‚½‚ç–ß‚Á‚ÄA2•¶š–Ú+1•¶š’Šo‚µ‚Ä”»’è
            String result = (sample2.equals(resample)) ? "Yes" : "No";
            //‰ñ•¶‚Ì”»’è
            System.out.println(result);
            //“¯‚¶‚¾‚Á‚½‚ç‚à‚¤ˆê•¶š‚¸‚Â’Ç‰Á
            //ˆá‚Á‚½‚çŠi”[‚µ‚Ä–ß‚é(1‰ñ–Ú)
            
            //2‰ñ–ÚˆÈ~‚ÍŠi”[‚µ‚½•¶š”‚Æ”äŠr
            //V‹K‚Ì•û‚Ì•¶š”‚ª‘å‚«‚¯‚ê‚Î‚»‚ê‚ğŠi”[
            //‚»‚êˆÈŠO‚ÍŠi”[‚¹‚¸‚»‚Ì‚Ü‚Ü–ß‚é
            
            
        }
    
    
    }
}
