import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // pg2-1
        // �W�����͂��擾
        Scanner sc = new Scanner(System.in);
        // ������̌�
        int X = Integer.parseInt(sc.nextLine());
        
        for (int k=0; k<X; k++) {
            // ��������擾���A���p�X�y�[�X���폜
            String str = sc.nextLine().replaceAll(" ", "");
            
            // ���]������������쐬
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.reverse();
            
            // ���̕�����Ɣ��]���������񂪈�v���邩�`�F�b�N
            if (str.equals(sb.toString())) {
                // ������ς���v�����ꍇ
                System.out.println("Yes");
            } else {
                // ������ς���v���Ȃ������ꍇ
                System.out.println("No");
            }
        }
    }
}
