package step3;
/*
 * # 2�����迭[����]
 * ���� : ��
 * ���� : ���
 * ���� : ���
 * ö�� : ���
 * ö�� : ���
 */
public class Ex13_2 {

	public static void main(String[] args) {
		int jangCount = 5;
		String[][] jang = {
			{"ö��", "���"},
			{"����", "��"},
			{"ö��", "���"},
			{"����", "���"},
			{"����", "���"}
		};
		
		for(int i = 0; i<jang.length; i++) {
			String maxStr = jang[i][0];
			int maxIdx = i;
			for(int j = i; j<jang.length; j++) {
				if(jang[i][0].compareTo(jang[j][0]) > 0) {
				// jang[i][0]���� jang[j][0]�� ���������� ������ ���̸�
					maxStr = jang[j][0];
					maxIdx = j;
				}
			}
			// jang[i] �� jang[j] �� ��ȯ ( jang[i][0]jang[i][1] ��°�� )
			String[] temp = jang[i];
			jang[i] = jang[maxIdx];
			jang[maxIdx] = temp;
		}
		
		for(int i = 0; i<jang.length; i++) {
			String maxStr = jang[i][0];
			int maxIdx = i;
			for(int j = i; j<jang.length; j++) {
				if(jang[i][0].equals(jang[j][0])) {
					if(jang[i][1].compareTo(jang[j][1]) > 0) {
						maxStr = jang[j][1];
						maxIdx = j;
					}
				}
			}
			
			String[] temp = jang[i];
			jang[i] = jang[maxIdx];
			jang[maxIdx] = temp;		
			
		}
		
		for(int i=0; i<jang.length; i++) {
			System.out.println(jang[i][0] + " : " + jang[i][1]);
		}
	}

}
