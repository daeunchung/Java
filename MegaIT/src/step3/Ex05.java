package step3;
import java.util.Scanner;
/*
 * # ATM[4�ܰ�] : ��ü ��ɱ���
 * 1. ȸ������
 * . id�� pw�� �Է¹޾� ����
 * . ���� �� �� 1000�� �ο�
 * . id �ߺ�üũ
 * 2. ȸ��Ż��
 * . �α��νÿ��� �̿밡��
 * 3. �α���
 * . id�� pw�� �Է¹޾� �α���
 * . �α׾ƿ� ���¿����� �̿밡��
 * 4. �α׾ƿ�
 * . �α��νÿ��� �̿밡��
 * 5. �Ա�
 * . �α��νÿ��� �̿밡��
 * 6. ��ü
 * . �α��νÿ��� �̿밡��
 * 7. �ܾ���ȸ
 * . �α��νÿ��� �̿밡��
 */

/*public class Ex05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int MAX = 5;
		
		int[] arAcc = new int[MAX];
		int[] arPw = new int[MAX];
		int[] arMoney = new int[MAX]; // 5���� ����, ���, �ܾ��� �ޱ� ���� �迭
		
		int count = 0; // ȸ�� �� ���� ����
		int log = -1; // �α��� ���� ��Ÿ���� ����
		
		String menu = "=== �ް�IT ATM ===\n" ;
				//String ������ �������� menu�� �����ϰ� ������ �־��ذ���
		menu += "1.ȸ������\n2.ȸ��Ż��\n3.�α���\n4.�α׾ƿ�\n";
		menu += "5.�Ա�\n6.��ü\n7.�ܾ���ȸ\n0.����";
		
		while(true) {
			
			System.out.println("[ȸ�� �� : " + count + "��]");
			for(int i = 0; i<count; i++) {
				System.out.println(arAcc[i] + ":" + arPw[i] + "(" + arMoney[i] + "��");
			}
			System.out.println("-----------------");
			System.out.print("[������] : ");
			if(log == -1) {
				System.out.println("����");
			}else {
				System.out.println(arAcc[log]);
			}
			
			System.out.println("-----------------");
			
			System.out.println(menu);
			
			int sel = scan.nextInt();
			
			// ȸ���� �����ְ� ���� ������ �����ְ� �޴� ����ϰ� �޴� �Է¹ޱ�
			
			if(sel == 1) {
				if(count == 5) {
					System.out.println("ȸ�������� 5�� ������ �����մϴ�. ");
					continue;
				}
			}
			
			System.out.println("[����]Acc �Է� : ");
			int myAcc = scan.nextInt();
			
			int check = 1;
			for(int i = 0; i<count; i++) {
				if(arAcc[i] == myAcc) {
					check = -1;
				}
			}
			if(check == -1) {
				System.out.println("Acc�� �ߺ��˴ϴ�.");
			}else {
				
				System.out.println("[����]Pw �Է� : ");
				int myPw = scan.nextInt();
				
				arAcc[count] = myAcc;
				arPw[count] = myPw;
				arMoney[count] = 1000;
				count += 1;
				System.out.println("[�޼���]������ �����մϴ�.");
			}
		}
		
		else if(sel == 2) {
			if(log == -1) { //�α׾ƿ� �����̸�
				System.out.println("[�޼���]�α��� �� �̿밡���մϴ�.");
			}else {
				for(int i = 0;)
			}
			
			
			
		}
		
			
		
	}

}*/
