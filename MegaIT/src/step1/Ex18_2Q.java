package step1;
/*
 * # 369����[2�ܰ�]
 * 1. 1~50���� �ݺ��� �Ѵ�.
 * 2. �� �ȿ��� �ش� ������ 369������ ����� ����Ѵ�.
 * ��) 1 2 ¦ 4 5 ¦ 7 8 ¦ 10 11 12 ¦ ...
 */
public class Ex18_2Q {

	public static void main(String[] args) {
		int i = 1;

		while(i <= 50) {
			
			int cnt = 0;
			int ten = i/10;
			int one = i%10;
			//���� �ڸ�, ���� �ڸ� ������ while�� �ȿ��� ������ �־�� �ϴ±���..
			//main���� while�� �ۿ� ���� �����ߴ��� ���� X
			
			if(( ten != 0 ) && ( ten%3 == 0 )) {
				cnt ++;
			}
			if(( one != 0 ) && ( one%3 == 0 )) {
				cnt ++;
			}
			// if �ȿ� ���ǹ� ã�� ���� ������� 
			// �ٽ� �ѹ� ����
	
			if(cnt == 2) {
				System.out.print("¦¦ ");
			}
			else if(cnt == 1) {
				System.out.print("¦ ");
			}
			else if(cnt == 0) {
				System.out.print(i + " ");
			}
			
			i++; // �������� while�� ���� �ִ°͵� �����ϼ��� ����
		}
		
	}
		
}

