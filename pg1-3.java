import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // pg1-3
        int MIN_NUM = 1; //�ŏ��l
        int MAX_NUM = 100; //�ő�l
        int HOGE_NUM = 3; // �w�萔�l
        
        // �ŏ��l�ƍő�l���������ݒ肳��Ă��Ȃ��ꍇ�l�����ւ���
        if (MIN_NUM>MAX_NUM) {
            int temp = MIN_NUM;
            MIN_NUM = MAX_NUM;
            MAX_NUM = temp;
        }
        
        for (int i=MIN_NUM; i<=MAX_NUM; i++) {
            // �w�肵�����l�̔{���܂��͂ǂ����̌��Ɏw�肵�����l�����鐔�̏ꍇ�͑���Ɂghoge�h���o��
            if ((HOGE_NUM!=0 && i!=0 && (i%HOGE_NUM)==0) || Integer.toString(i).contains(Integer.toString(HOGE_NUM))) {
                System.out.println("hoge");
            } else {
                System.out.println(i);
            }
        }
    }
}
