package step3;

import java.util.Scanner;

public class Ex10_00 {
	/*
	 * # ���ڿ� [��]
	 * . ���ڿ� �񱳴� equals() �޼��带 ���� Ȯ���� �� �ִ�.
	 */
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	String name = "ȫ�浿";
	
	System.out.print("�̸��� �Է��ϼ��� : ");
	String myName = scan.next();
	
	if(name == myName) {
		System.out.println("== ������ : ��ġ");
	}else {
		System.out.println("== ������ : ����ġ");
	}
	
	if(name.equals(myName)) {
		System.out.println("equals() �޼��� : ��ġ");
	}else {
		System.out.println("equals() �޼��� : ����ġ");
	}
	}
}
