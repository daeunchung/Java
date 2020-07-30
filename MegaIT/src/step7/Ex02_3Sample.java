/*package step7;

import java.util.Scanner;

class Ticket{
	boolean check;
	void showData() {
		if(check == true) {
			System.out.print("■ ");
		}
		else {
			System.out.print("□ ");
		}
	}
}
public class Ex02_3Sample {
	public static void main(String[] args) {
		boolean run = true;
		Ticket [] tickets = new Ticket[8];
		for(int i = 0; i < tickets.length; i++) {
			tickets[i] = new Ticket(); // 제일많이 실수.
		}
		Scanner scan = new Scanner(System.in);
		while(run) {
			for(int i = 0; i< tickets.length; i++) {
				tickets[i].showData();
			}
			System.out.println();
			System.out.println("번호를 입력하세요 >> ");
			int sel = scan.nextInt();
			if(tickets[sel].check == false) {
				tickets[sel].check = true;
			}
		}

	}
}

*/
