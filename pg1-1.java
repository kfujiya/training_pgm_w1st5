import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // pg1-1
        int MIN_NUM = 1; // �ŏ��l
        int MAX_NUM = 9; // �ő�l
        
        // �ŏ��l�ƍő�l���������ݒ肳��Ă��Ȃ��ꍇ�l�����ւ���
        if (MIN_NUM>MAX_NUM) {
            int temp = MIN_NUM;
            MIN_NUM = MAX_NUM;
            MAX_NUM = temp;
        }
        
        // �ŏ��l����ő�l�܂ł����s���Ȃ��珇�Ԃɏo��
        for (int i=MIN_NUM; i<=MAX_NUM; i++) {
            System.out.println(i);
        }
    }
}
