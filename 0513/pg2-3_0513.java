import java.util.*;

public class Main {
    public static void main(String[] args) {
    
        //��������͉�
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        
        //Set�f�[�^���g�p���āA���ɓo�ꂵ���������ێ�
        Set<String> seenStrings = new HashSet<>();
        
        //Set�Ɋ��Ɋ܂܂�Ă��邩�ǂ����m�F
        for (int i = 0; i < input; i++) {
        
            //���������
            String wordEnt = sc.nextLine();
            
            //�܂܂�Ă���ꍇ
            if (seenStrings.contains(wordEnt)) {
            
                //�o��
                System.out.println("��������");
            
            //�܂܂�Ă��Ȃ��ꍇ
            } else {
            
                //�o�ꂵ�ĂȂ��������Set�f�[�^�ɑ}��
                seenStrings.add(wordEnt);
                
                //�o��
                System.out.println("���킢���`");
                
            }
        }
    }
}