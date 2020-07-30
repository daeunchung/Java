package step6;

import java.util.Scanner;

/*
 * # �л����� ���� ���α׷�[3�ܰ�] : Ŭ���� + �޼���
 * 1. �й��� �Է��ϸ�, �ش� �л��� ������ ��µȴ�.
 * 2. ��, ���� �й� �Է¿� ���� ���ܻ�Ȳ�� �ݵ�� ó���ؾ� �Ѵ�.
 * 3. 1��� �õ� �л��� ������ Ȯ���� �� �ִ�.
 */

class Ex6{
	
	String name = "";
	
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore  = {  92,   38,   87,  100,   11};
	
	void choice1() {
		for(int i = 0; i<arHakbun.length; i++) {
			System.out.println(arHakbun[i] + "�л� : " + arScore[i] + "��");
		}
	}
	
	void choice2() {
		int maxScore = 0;
		int maxIdx = 0;
		for(int i = 0; i<arScore.length; i++) {
			if(maxScore < arScore[i]) {
				maxScore = arScore[i];
				maxIdx = i;
			}
		}
		System.out.println("1�� : " + arHakbun[maxIdx] + "�л�(" + maxScore + "��)");
	}
	
	void choice3() {
		int minScore = arScore[0];
		int minIdx = 0;
		for(int i = 0; i<arScore.length; i++) {
			if(minScore > arScore[i]) {
				minScore = arScore[i];
				minIdx = i;
			}
		}
		System.out.println("�õ� : " + arHakbun[minIdx] + "�л�(" + minScore + "��)");
	}
	
	void choice4() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�й� �Է� : ");
		int hakbun = scan.nextInt();
		
		int idx = -1;
		for(int i = 0; i<arHakbun.length; i++) {
			if(hakbun == arHakbun[i]) {
				idx = i;
			}
		}
		if(idx == -1) {
			System.out.println("�ش� �й��� �������� �ʽ��ϴ�.");
		}else {
			System.out.println(arHakbun[idx] + "�л�(" + arScore[idx] + "��)");
		}
	}
}

public class Ex06 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		Ex6 mega = new Ex6();
		mega.name = "�ް�IT �����б�";
		
		while(true) {
			// �޴� ���
			System.out.println("=== " + mega.name + "===");
			System.out.println("1.������ ����Ȯ��");
			System.out.println("2.1���л� ����Ȯ��");
			System.out.println("3.�õ��л� ����Ȯ��");
			System.out.println("4.(�й��� �Է¹޾�)����Ȯ���ϱ�");
			System.out.println("5.�����ϱ�");
			
			// �޴� ����
			System.out.print("�޴� ���� : ");
			int choice = scan.nextInt();
			
			if(choice == 1) { mega.choice1(); }
			else if(choice == 2) { mega.choice2(); }
			else if(choice == 3) { mega.choice3(); }
			else if(choice == 4) { mega.choice4(); }
			else if(choice == 5) {
				System.out.println("���α׷� ����");
				break;
			}
		}
	}
}