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
public class Ex07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Ǵ� ���ڷ� �̷���� ���ڿ��� �Է��Ͻÿ�");
		System.out.print("�Է� : ");
		String text = scan.next();
		
		int num = 0;
		int let = 0;
		int size = text.length();
		
		for(int i = 0; i<size; i++) {
			if(48 <= (int)text.charAt(i) && (int)text.charAt(i) <= 57) {
				//char�� ���� 0123456789 �� ���� �ƽ�Ű���� ���� 48~57 �� ���� Ȱ���Ͽ� 
				num ++;
			}else {
				let++;
			}
		}
		
		if(num == 0) {
			System.out.println("���ڸ� �ִ�");
		}else if(let == 0) {
			System.out.println("���ڸ� �ִ�");
		}else {
			System.out.println("���ڿ� ���ڰ� �����ִ�");
		}
		
	}

}
