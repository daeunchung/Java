package step3;
//# 2�����迭 �⺻����[3�ܰ�] 0628-0633
public class Ex08_3M {

	public static void main(String[] args) {
		int[][] arr = {
				{101, 102, 103, 104},
				{201, 202, 203, 204},
				{301, 302, 303, 304}
			}; 
			
			int[] garo = new int[3];
			int[] sero = new int[4];
			
			for(int i = 0; i<arr.length; i++) {
				for(int j = 0; j<arr[i].length; j++) {
					garo[i] += arr[i][j];
					sero[j] += arr[i][j];
				}
			}
			// ���� 1) ���� �� ���
			// ���� 1) 410, 810, 1210
			for(int i = 0; i<3; i++) {
				System.out.print(garo[i] + " ");
			}System.out.println();
			
			// ���� 2) ���� �� ���
			// ���� 2) 603, 606, 609, 612
			for(int j = 0; j<4; j++) {
				System.out.print(sero[j] + " ");
			}System.out.println();
	}

}
