import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // pg2-2
        // �W�����͂��擾
        Scanner sc = new Scanner(System.in);
        // ������̌�
        String str = sc.nextLine();
        
        // �ő啶����
        int maxLength = 0;
        // �ő啶�����̉�
        String maxStr = "";
        
        for (int i=0; i<str.length(); i++) {
            for (int j=i+2; j<str.length(); j++) {
                // �������؂�o��
                String str2 = str.substring(i, j);
                
                // �؂�o���������񂪉񕶂��`�F�b�N
                if (kaibunCheck(str2)) {
                    // �����_�̍ő啶������葽�����`�F�b�N
                    if (maxLength < str2.length()) {
                        // �ő啶�����y�эő啶�����̉񕶂��X�V
                        maxLength = str2.length();
                        maxStr = str2;
                    }
                }
            }
        }
        // �ő啶�����̉񕶂��o��
        System.out.println(maxStr);
    }
    
    /**
    * ���͂��ꂽ�����񂪉񕶂��`�F�b�N����
    * @param str ������
    * @return �񕶂ł��邩�̌���
    */
    public static boolean kaibunCheck(String str) {
        // ���]������������쐬
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        
        // ���]����������ƈ�v���邩�`�F�b�N
        if (str.equals(sb.toString())) {
            return true;
        } else {
            return false;
        }
    }
}
