import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        //���̓`�F�b�N�����郉�C�u����
        
        String N = sc.nextLine();
        Integer X = Integer.parseInt(N);
        //�����񐔂̌���
        
        for(int i = 0; i < X; i++){ //X�񕪂̉񕶔���
            String sample = sc.nextLine();
            //�T���v���̕�����
            
            String sample2 = sample.replaceAll(" ", "");
            //���p�X�y�[�X������
            
            String resample = new StringBuilder(sample2).reverse().toString();
            //�t�ɂ���������
            
            
            //�T���v���̕������2�������o
            //�t�������2�������o
            
            //��r���Ĉ������߂��āA2������+1�������o���Ĕ���
            String result = (sample2.equals(resample)) ? "Yes" : "No";
            //�񕶂̔���
            System.out.println(result);
            //����������������ꕶ�����ǉ�
            //�������i�[���Ė߂�(1���)
            
            //2��ڈȍ~�͊i�[�����������Ɣ�r
            //�V�K�̕��̕��������傫����΂�����i�[
            //����ȊO�͊i�[�������̂܂ܖ߂�
            
            
        }
    
    
    }
}
