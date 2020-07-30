package step3;
import java.util.Scanner;
//# ������
public class Ex09_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
			
			int[][] pay = {
				{1000, 2100, 1300},	
				{4100, 2000, 1000},	
				{3000, 1600,  800}
			};
			
			// ���� 1) ������ ������ �� ���
			// ���� 1) 4400, 7100, 5400
			int[] floorsum = new int[3];
			int f = 0;
			
			while(f<3) {
				for(int j = 0; j<3; j++) {
					floorsum[f] += pay[f][j];
				}System.out.print(floorsum[f] + " ");
				f++;
			}System.out.println();
			
			
			// ���� 2) ȣ�� �Է��ϸ� ������ ���
			// ��    2) �Է� : 202	������ ��� : 2000
			System.out.println("ȣ �Է� : ");
			int house = scan.nextInt();
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					if(house == apt[i][j]) {
						System.out.println("������ : " + pay[i][j]);
					}
				}
			}
			
			// ���� 3) ������ ���� ���� ���� ��, ���� ���� �� ���
			// ���� 3) ���� ���� ���� ��(201), ���� ���� ���� ��(303)
			int max = 0; int max_i = 0; int max_j = 0;
			int min = 0; int min_i = 0; int min_j = 0;
			
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					if(max < pay[i][j]) {
						max = pay[i][j];
						max_i = i;
						max_j = j;
					}
				}
			}
			
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					if(min > pay[i][j]) {
						min = pay[i][j];
						min_i = i;
						min_j = j;
					}
				}
			}
			
			System.out.println("������ ���� ���� ���� �� : " + apt[max_i][max_j]);
			System.out.println("������ ���� ���� ���� �� : " + apt[min_i][min_j]);
			
			// ���� 4) ȣ 2���� �Է��ϸ� ������ ��ü
			System.out.print("ȣ1 �Է� : ");
			int ho1 = scan.nextInt();
			System.out.print("ȣ2 �Է� : ");
			int ho2 = scan.nextInt();
			
			int ho1_i = 0; int ho1_j = 0;
			int ho2_i = 0; int ho2_j = 0;
			
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					if(ho1 == apt[i][j]) {
						ho1_i = i;
						ho1_j = j;
					}
				}
			}
			
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					if(ho2 == apt[i][j]) {
						ho2_i = i;
						ho2_j = j;
					}
				}
			}
			
			int temp = pay[ho1_i][ho1_j];
			pay[ho1_i][ho1_j] = pay[ho2_i][ho2_j];
			pay[ho2_i][ho2_j] = temp;
			
			for(int i = 0; i<pay.length; i++) {
				for(int j = 0; j<pay[i].length; j++) {
					System.out.print(pay[i][j] + " ");
				}System.out.println();
			}
	}

}
