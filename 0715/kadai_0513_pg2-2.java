import java.util.*;

public class Main {
    
    //�񕶂��ǂ������肷�郁�\�b�h
    private static boolean isPal(String s) {
        int head = 0;
        int tail = s.length() - 1;
        
        //������̍ŏ��̕����ƉE����̍ŏ��̕�������v���Ă��邩���[�v�ŕ����`�F�b�N
        while (head < tail) {
            if (s.charAt(head) != s.charAt(tail)) {
                return false;
            }
            head++;
            tail--;
        }

        return true;
    }
    
    public static void main(String[] args) throws Exception {
        
        //����
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        int maxLength = 0;
        String longestPal = "";
        
        //���͕��̒��ɉ񕶂̍Œ��������������ׁA���[�v�ŕ�����`�F�b�N
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 2; j <= input.length(); j++) {
                
                //���͕����當����������o��
                String substring = input.substring(i, j);
                
                //������͉񕶂��ǂ������\�b�h�Ŕ���A��������͉񕶂̍Œ������񔻒�
                if (isPal(substring) && substring.length() > maxLength) {
                    maxLength = substring.length();
                    longestPal = substring;
                }
            }
        }
        
        //�o��
        System.out.println(longestPal);
    }
}