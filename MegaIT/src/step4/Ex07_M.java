package step4;

import java.util.Scanner;

/*
 * # ���ڿ� �� ���ڰ˻�
 * ��) adklajsiod
 * 	     ���ڸ� �ִ�.
 * ��) 123123
 *    ���ڸ� �ִ�.
 * ��) dasd12312asd
 *    ���ڿ� ���ڰ� �����ִ�.
 */
public class Ex07_M {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("�Է� : ");
		String text = scan.next();
		
		// �� ���� �Ѱ��� ���ڷ� ������ �ִ� ���ڹ迭�� ����������
		char[] charNum = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		
		// �� �ڸ����� 0 ~ 9 �� �ִ��� �˻��ϴ� �ڵ�		
		int cnt = 0; // ���ڿ� �� ���� �����ִ� ����
		for(int i = 0; i<charNum.length; i++) {
			for(int j = 0; j<text.length(); j++) {
				if(charNum[i] == text.charAt(j)) {
					cnt += 1;
				}
			}
		}
		
		if(cnt == text.length()) { // text���ڿ��� ���� ��ŭ ���ڰ� �ִٴ� �Ŵϱ� all ���� ��� ��
			System.out.println("���ڸ� �ִ�");
		}else if(cnt == 0) {
			System.out.println("���ڸ� �ִ�");
		}else {
			System.out.println("���ڿ� ���ڰ� �����ִ�");
		}
	}

}


// Ctrl + a : ��ü ��ũ�� �̾��ٴ� !!!!!!!!!!!!!!!!!!!!!!!! �Ǽ��� ã�Ҵ� ���