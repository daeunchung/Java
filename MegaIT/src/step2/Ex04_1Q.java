// �ٽ��ѹ� Ǯ���
// �����ó�� ������ �ڵ�� !!
package step2;
import java.util.Scanner;
/*
 * # �Ｎ����
 * 1. ���� 7�� �������� 3�� �����ϸ�, ��÷�����̴�.
 * 2. �Ʒ� 3������ ������ ��÷���θ� ����Ѵ�.
 */
public class Ex04_1Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
                     // 0  1  2  3  4  5  6  7
		int[] lotto1 = {0, 0, 7, 7, 7, 0, 0, 0};
		int[] lotto2 = {7, 0, 7, 7, 0, 0, 0, 0};
		int[] lotto3 = {7, 0, 7, 7, 7, 0, 7, 0};

		boolean run = true;
		while(run) {
			
			int cnt = 0;
			System.out.println("[1]������ ���Ȯ��");
			System.out.println("[2]������ ���Ȯ��");
			System.out.println("[3]������ ���Ȯ��");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				
				for(int i = 0; i < 6; i++) {
					if( lotto1[i] == 7 && lotto1[i+1] == 7 && lotto1[i+2] == 7) {
						cnt++;
					}
				}
				if(cnt != 0 ) {
					System.out.println("[1]������ : ��÷�Դϴ� ! ");
				}else
					System.out.println("[1]������ : ��÷�� �ƴմϴ�.");
				
			}
			else if(sel == 2) {
				
				for(int i = 0; i < 6; i++) {
					if( lotto2[i] == 7 && lotto2[i+1] == 7 && lotto2[i+2] == 7) {
						cnt++;
					}
				}
				if(cnt != 0 ) {
					System.out.println("[2]������ : ��÷�Դϴ� ! ");
				}else
					System.out.println("[2]������ : ��÷�� �ƴմϴ�.");
				
			}
			else if(sel == 3) {
				
				for(int i = 0; i < 6; i++) {
					if( lotto3[i] == 7 && lotto3[i+1] == 7 && lotto3[i+2] == 7) {
						cnt++;
					}
				}
				if(cnt != 0 ) {
					System.out.println("[3]������ : ��÷�Դϴ� ! ");
				}else
					System.out.println("[3]������ : ��÷�� �ƴմϴ�.");
				
			}
			
		}
	}

}
/*
 				for(int i=0; i<8; i++) {
					if(lotto1[i] == 7) {
						cnt += 1;
						if(cnt == 3) {
							check = 1;
						}
					}else {
						cnt = 0;
					}
				}  cnt��  ���� ���޾� 3�� ������ check���� ����
*/


