package step1;

public class Ex15_1 {

	public static void main(String[] args) {
		/*
		 * # �ݺ��� while
		 * 1. �ݺ����� ���� 3����
		 * 1) �ʱ��
		 * 2) ���ǽ�
		 * 3) ������
		 * 
		 * 2. ����
		 * �ʱ��;
		 * while(���ǽ�){
		 * 		���ǽ��� ���� ���� ������ ����;
		 * 		������;
		 * }
		 */
		
		// ��) 1~5���� ���
		
		int i = 1;						// �ʱ��
		while(i <= 5) {					// ���ǽ�
			System.out.println(i);
			i = i + 1;					// ������		i += 1;
		}
	}
}
