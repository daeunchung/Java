package step7;

import java.util.Scanner;

class Ticket{
	boolean check;
	// check�� true�� �̹� ���ſϷ��¼� (�����׸�) false�� ���� ���¼�(��׸�)
	void showData() {
		if(check == true) {
			System.out.print("�� ");
		}
		else {
			System.out.print("�� ");
		}
	}
}
public class Ex02_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;	
		Ticket [] tickets = new Ticket[8]; // �� 8�� ���ְ�
		for(int i = 0; i < tickets.length; i++) {
			tickets[i] = new Ticket(); // ���ϸ��� �Ǽ�.
		} // 8���� ��� Ticket Ŭ���� �ο�
		
		while(true) {
			
			for(int i = 0; i<tickets.length; i++) {
				tickets[i].showData();
			}
			System.out.println();
			
			int cnt = 0;
			for(int i=0; i<tickets.length; i++) {
				if(tickets[i].check) {
					cnt++;
				}
			}
			if(cnt == 8) {
				System.out.println("�˼��մϴ�. �����Դϴ�.");
				break;
			}
			
			System.out.println("��ȣ �Է� : ");
			int sel = scan.nextInt();
			if(tickets[sel].check == false) {
				tickets[sel].check = true;				
			}else if(tickets[sel].check == true) {
				System.out.println("�̹� ���ŵ� �¼��Դϴ�. ");
			}
		}
	}
}
