import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // pg2-3
        // �W�����͂��擾
        Scanner sc = new Scanner(System.in);
        // ������̌�
        int X = Integer.parseInt(sc.nextLine());
        // ���o�����񃊃X�g
        List<String> alreadyStrList = new ArrayList<String>();
        
        for (int k=0; k<X; k++) {
            // ��������擾
            String S = sc.nextLine();
            
            // ���o�����񃊃X�g�ɕ����񂪊܂܂�Ă��邩�`�F�b�N
            if (!alreadyStrList.contains(S)) {
                // ���߂ēo�ꂵ��������̏ꍇ
                System.out.println("���킢���`");
                // ���o�����񃊃X�g�ɒǉ�
                alreadyStrList.add(S);
            } else {
                // �ߋ��n���ꂽ���Ɠ���������̏ꍇ
                System.out.println("��������");
            }
        }
    }
}
