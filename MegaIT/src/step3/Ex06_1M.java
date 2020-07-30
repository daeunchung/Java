package step3;
/*0808-0813
 * # �����ϱ�
 * 1. �ε��� 0���� �������� �˻��Ѵ�.
 * 2. ���� ū ���� ã�� ��ȯ�Ѵ�.
 * 3. �ε��� 1�����Ѵ�.
 * 4. [1~3]�� ������ �ݺ��Ѵ�.
 * ��)
 * 10, 50, 30, 40, 80, 7
 * 80, 50, 30, 40, 10, 7
 * 80, 50, 30, 40, 10, 7
 * 80, 50, 40, 30, 10, 7
*/
public class Ex06_1M {

	public static void main(String[] args) {
		int[] score = {10, 50, 30, 40, 80, 7};
		
		for(int i = 0; i<6; i++) {
			int maxScore = score[i];
			int maxIdx = i;
			
			for(int j = i; j<6; j++) {
				
				if(maxScore < score[j]) {
					maxScore = score[j];
					maxIdx = j;
				}
			}
			
			int scoreTemp = score[i];
			score[i] = score[maxIdx];
			score[maxIdx] = scoreTemp;
		}
		
		for(int i = 0; i<6; i++) {
			System.out.print(score[i] + " ");
		}
	}

}
