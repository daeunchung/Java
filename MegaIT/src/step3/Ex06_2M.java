package step3;
/*0757-0806
 * # ���� ���
 * . ���� ������ �̸� ���
 */
public class Ex06_2M {

	public static void main(String[] args) {
		String[] name = {"ȫ�浿", "�迵", "�ڹ�ŷ", "�κ�ö", "�ް���"};
		int[] score   = {    87,    42,    100,     11,     98};
		
		for(int i = 0; i<5; i++) {
			
			int maxScore = score[i];
			int maxIdx = i;
			
			for(int j = i; j<5; j++) {
				
				if(maxScore < score[j]) {
					maxScore = score[j];
					maxIdx = j;
				}
			}
			
			int scoreTemp = score[maxIdx];		
			score[maxIdx] = score[i];
			score[i] = scoreTemp;
			
			String nameTemp = name[maxIdx];		
			name[maxIdx] = name[i];
			name[i] = nameTemp;

		}
		
		for(int i = 0; i<5; i++) {
			System.out.print(name[i] + " ");
			System.out.print(score[i] + " ");
			System.out.println();
			
		}

	}

}
