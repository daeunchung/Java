package step3;
//# 2�����迭 �⺻����[3�ܰ�]
public class Ex08_3 {

	public static void main(String[] args) {
		int[][] arr = {
				{101, 102, 103, 104},
				{201, 202, 203, 204},
				{301, 302, 303, 304}
			}; 
			
			int[] garo = new int[3];
			int[] sero = new int[4];
			
			// ���� 1) ���� �� ���
			// ���� 1) 410, 810, 1210
			int sum = 0;
			int i = 0;
			
			while(i<3) {
				for(int j = 0; j<4; j++) {
					sum += arr[i][j];
				}System.out.print(sum + " ");
				sum = 0;
				i++;
			}
			System.out.println();
			
			// ���� 2) ���� �� ���
			// ���� 2) 603, 606, 609, 612
			sum = 0;
			i = 0;
			while(i<4) {
				for(int j = 0; j<3; j++) {
					sum += arr[j][i];
				}System.out.print(sum + " ");
				sum = 0;
				i++;
			}

	}

}
