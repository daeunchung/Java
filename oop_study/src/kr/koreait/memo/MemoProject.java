package kr.koreait.memo;

import java.util.Scanner;

public class MemoProject {

//	���� Ŭ�������� 2�� �̻��� �޼ҵ忡�� ����ؾ� �ϴ� ������ �Ǵ� ��ü�� �ݵ�� ����� ����� ����Ѵ�
	static MemoList memoList = new MemoList();
	
	public static void main(String[] args) {

//		MemoVO vo = new MemoVO("ȫ�浿", "1111", "1�� �Դϴ�");
//		System.out.println(vo);
		
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		while(menu != 7) {
			do {
				System.out.println("==========================================================================");
				System.out.println(" 1.�Է�  2.��Ϻ���  3.����  4.����  5.���Ϸ�����  6.���Ͽ����б�  7.���� ");
				System.out.println("==========================================================================");
				System.out.print("���ϴ� �޴��� �����ϼ��� : ");
				menu = sc.nextInt();
			}while(menu < 1 || menu > 7);
			
//			�Էµ� �޴��� ���� ������ �۾��� �����Ѵ�.
			switch(menu) {
			case 1: 
			}
				
		}
	}

}
