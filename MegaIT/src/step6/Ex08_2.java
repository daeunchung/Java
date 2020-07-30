package step6;

import java.util.Random;
import java.util.Scanner;

/*
 * # ���� ���� : Ŭ���� + �޼���
 * 1. front �迭 ī�� 10���� ���´�.
 * 2. front �迭���� ���� ī�带 ��� ī���� ��ġ�� �Է��Ѵ�.
 * 3. ������ 2���� ī�尡 ���� ī���̸�, back �迭�� ǥ���Ѵ�.
 * 4. ��� ī�尡 ��������(back�迭�� 0�� �������) ������ ����ȴ�. 
 */
class MemoryGame{
	
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	
	int cnt = 0;		// ������ ���� Ƚ��
	
	void shuffle() {
		for(int i = 0; i<1000; i++) {
			int r = ran.nextInt(front.length);
			int temp = front[0];
			front[0] = front[r];
			front[r] = temp;
		}	
	}

	void printCard() {
		// ī�� �ո� ���
		System.out.print("front = [");
		for(int i = 0; i<front.length; i++) {
			System.out.print(front[i] + " ");
		}System.out.println("] ");
		
		// ī�� �޸� ���
		System.out.print("back  = [");
		for(int i = 0; i<back.length; i++) {
			System.out.print(back[i] + " ");
		}System.out.println("] ");
	}
	
	void choiceCard() {
		System.out.print("ī��1 �Է�[1~10] : ");
		int card1 = scan.nextInt() - 1;
		System.out.print("īƮ2 �Է�[1~10] : ");
		int card2 = scan.nextInt() - 1;
		
		// ī�� ��¤��
		if(front[card1] == front[card2]) {
			back[card1] = front[card1];
			back[card2] = front[card2];
			cnt++;
		}
	}
	
	void run() {
		// ����(ī�� ����)
		shuffle();
		
		while(true) {
			// ī�� ���
			printCard();
			// �����ϱ�
			if(cnt == 5) {
				System.out.println("���� ����");
				break;}			
			// ī�� �����ϱ�
			choiceCard();
		}
	}
}
public class Ex08_2 {
	public static void main(String[] args) {
		
		MemoryGame mg = new MemoryGame();
		mg.run();
		
	}

}