package step4;
import java.util.Scanner;
/*
 *  # nextLine()�� next()�� ����
 *  1. nextLine() : ���� �Ѷ��� ��ü�� �Է¹޴´�.
 *  2. next() : ������ �������� �Ѵܾ �Է¹޴´�.
 */
public class Ex08 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*
		 *  # hello java �Է½�,
		 *  nextLine() �޼���� Hello Java ��� ��µ�����
		 *  next() �޼���� Hello �� ��µȴ�.
		 */
		System.out.print("�̸� �Է� : ");
		String name = scan.nextLine();	
		System.out.println(name);
		
		System.out.print("�̸� �Է� : ");
		name = scan.next();	
		System.out.println(name);
	}

}
