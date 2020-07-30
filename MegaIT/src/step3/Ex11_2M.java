package step3;
import java.util.Scanner;

/*
 * # ���θ� [��ٱ���]
 * 1. �α��� �� ���� �޴��� �����ϸ�, ������ ���� ��ǰ����� �����ش�.
 * 	1) ���
 *  2) �ٳ���
 *  3) ����
 * 2. ��ȣ�� ������ ��ǰ�� ��ٱ��Ͽ� ���� �� �ִ�.
 * 3. �α��� ȸ���� �ε��� ��ȣ�� �� ���� ù��° ���� �����Ѵ�.
 * 4. �ش� ȸ���� ������ ��ǰ�� �ε��� ��ȣ�� �� ���� �ι�° ���� �����Ѵ�.
 * ��)
 * {
 * 		{0, 1},				qwerȸ�� 			> �������
 * 		{1, 2},				javakingȸ�� 		> �ٳ�������
 * 		{2, 1},				abcdȸ��			> �������
 * 		{0, 3},				qwerȸ��			> ���ⱸ��
 * 		...
 * }
 */
public class Ex11_2M {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111",     "2222", "3333"};
		
		int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];
		
		int count = 0;
		
		String[] items = {"���", "�ٳ���", "����"};
		
		int log = -1;
		
		while(true) {
			System.out.println("---------------");
			System.out.print("���� : ");
			if(log == -1) {
				System.out.println("�α׾ƿ�");
			}else {
				System.out.println(ids[log] + "�� �α���");
			}
			System.out.println("---------------");
			System.out.println("[MEGA MART]");
			System.out.println("[1]�� �� ��");
			System.out.println("[2]�α׾ƿ�");
			System.out.println("[3]��     ��");
			System.out.println("[4]��ٱ���");
			System.out.println("[0]��     ��");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.print("ID : ");
				String id = scan.next();
				System.out.print("PW : ");
				String pw = scan.next();
				
				for(int i = 0; i<ids.length; i++) {
					if(id.equals(ids[i]) && pw.equals(pws[i])) {
						log = i;
					}
				}
				
				if(log == -1) {
					System.out.println("ID�� PW�� Ȯ�����ּ���");
				}else {
					System.out.println(ids[log] + "�� ȯ���մϴ�.");
				}
				
			}
			else if(sel == 2) {
				log = -1;
				System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
			}
			else if(sel == 3) {
				
				while(true) {
					System.out.println("[��ǰ���]");
					for(int i = 0; i<items.length; i++) {
						System.out.println((i+1) + ") " + items[i]);
					}
					System.out.println("4) �ڷΰ���");
					
					System.out.println("��ǰ��ȣ�� �����Ͻÿ�");
					int choice = scan.nextInt();
					
					if(choice == 4) {
						break;
					}
					
					jang[count][0] = log;
					jang[count][1] = choice;
					count++;
				}
			}
			
			else if(sel == 4) {
				int apple = 0;
				int banana = 0;
				int berry = 0;
				
				for(int i = 0; i<count; i++) {
					if(jang[i][0] == log) {
						if(jang[i][1] == 1) { apple++; }
						if(jang[i][1] == 2) { banana++; }
						if(jang[i][1] == 3) { berry++; }
					}
				}
					System.out.println(items[0] + " : " + apple + "��");
					System.out.println(items[1] + " : " + banana + "��");
					System.out.println(items[2] + " : " + berry + "��");
			}
			
			else if(sel == 0) {
				System.out.println("���α׷� ����");
				break;
			}
			
		}

	}

}
