package step4;
import java.util.Scanner;
/*0253-0256
 * # ���ڿ� ��
 * . equals() �޼��� ������ ������ ��ġ���� ��
 * ��)
 * �ڳ���
 * �Է� = Ƽ�����罺
 * ��� = false
 */
public class Ex06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String name = "�ڳ���";
		System.out.println(name);
		
		System.out.print("���� �̸��� �Է��ϼ��� : ");			// ex) Ƽ�����罺
		String myName = scan.next();
		
		int check = -1;
		if(name.length() == myName.length()) {
			check = 1;
			for(int i = 0; i<name.length(); i++) {
				if(name.charAt(i) != myName.charAt(i)) {
					check = -1;
				}
			}
		}
		
		if(check == 1) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

}
