package step3;

import java.util.Scanner;

/*0209-0217
 * # EXIT ����
 * 1. game�迭���� exit������ ���� ���� ��ġ�� �Է��Ѵ�.
 * 2. ������ ���߸� exit������ 1�����Ѵ�.
 * 3. exit������ ���� 16�̵Ǹ� ������ ����ȴ�.
 */
public class Ex02_2M {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int exit = 10;
		
		int[] game = {11, 15, 10, 14, 12, 13};

		while(true) {
			
			System.out.println("EXIT = " + exit);
			for(int i = 0 ; i < 6; i++) {
				System.out.print(game[i] + " ");
			}System.out.println();
			
			int answer = 0;
			for(int i = 0; i<6; i++) {
				if(exit == game[i]) {
					answer = i;
				}
			}
			
			System.out.print("�Է� : ");
			int idx = scan.nextInt();
			if(answer == idx) {
				exit++;
			}
			if(exit == 16) {
				System.out.println("����");
				break;
			}
			
		}
	}

}
