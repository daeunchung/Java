package step6;

import java.util.Scanner;

/*
 * [1]Ŭ������ �������
 * 1. ����
 * 2. �޼���
 * 
 * [2]�޼����� �ʿ伺
 * �ݺ��Ǵ� �ڵ带 �޼��带 ���� ��Ȱ�� �ϱ� ����
 * 
 * [3]�޼����� ����[1�ܰ�]
 * void print(){
 * 		������ ����;
 * } 
 * 1) void			: Ű����
 * 2) print()		: �޼����
 * 3) {}			: �޼��� ����
 * 4) ������ ������ �ִ�.(�ڱ� �ּҸ� �����ϰ� �ִ� ���� : this)
 * 
 * [4]�޼����� ���(ȣ��)
 * print();			: �޼����();
 */

class Ex1{
	int num; // Ŭ���� �ȿ��� ������ �ʱ�ȭ�� �� �����൵ �Ǵ°ɱ�?
	
	void setNum() {
		System.out.println(this);
		this.num = 10;
	}
	
	void test1() {
		int total = 0;
		for(int i = 1; i <= 5; i++) {
			total += i;
		}System.out.println("total = " + total);
	}
	
	void test2() {
		Scanner scan = new Scanner(System.in);
		// �ż��� �ȿ��� ��ĳ�ʸ� ������±���
		
		int max = 0; int cnt = 0;
		while(true) {
			System.out.print("���� �Է� : ");
			int num = scan.nextInt();
			
			if(max < num) {max = num;}
			cnt++;
			if(cnt == 3) {break;}
		}
		System.out.println("�ִ밪 = " + max);	
	}
	
	// ������ ver
	/*void test2() {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[3];
		
		for(int i=0; i<3; i++) {
			System.out.print((i+1) + ".���� �Է� : ");
			arr[i] = scan.nextInt();
		}
		
		int maxNum = 0;
		for(int i=0; i<arr.length; i++) {
			if(maxNum < arr[i]) {
				maxNum = arr[i];
			}
		}
		
		System.out.println("�ִ밪 = " + maxNum);
		
		scan.close();
	}*/
	
}

public class Ex01 {
	public static void main(String[] args) {

		Ex1 e = new Ex1();
		System.out.println(e);
		
		
		e.num = 20;
		
		System.out.println(e.num);
		
		e.setNum();
		System.out.println(e.num);
		
		//--------------------------------------------
		
		// ���� 1) 1���� 5������ ���� ����ϴ� �޼���
		e.test1();
		
		// ���� 2) ���� 3���� �Է¹޾� �ִ밪�� ����ϴ� �޼���
		e.test2();
		
	}
}
