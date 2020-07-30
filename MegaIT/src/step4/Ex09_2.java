package step4;
import java.util.Scanner;
/*
 * # �ܾ� ��ü�ϱ�(replace)
 * 1. text���� ���� �ӿ��� �����ϰ� ���� �ܾ �Է¹޾�,
 * 2. ��ü���ִ� ����� �����Ѵ�.
 * ��)
 * 		Life is too short.
 * 		�����ϰ� ���� �ܾ��Է� : Life
 * 		�ٲ� �ܾ��Է� : Time
 * 
 * 		Time is too short.
 */

public class Ex09_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("�����ϰ� ���� �ܾ �Է��ϼ��� : ");
		String word = scan.nextLine();
		
		// String text �� char[] arr �� �� ���ھ� ������ ��� ����    �� �� �� �� ��  �� �� !!!!!!!!!!  //
		char[] arr = new char[text.length()];
		for(int i = 0; i<text.length(); i++) {
			arr[i] = text.charAt(i);
		}
		
		int size = word.length();
		int check = -1; // �����ϰ� �ʹٰ� �Է� ���� �ܾ String text�� ������ ����ִ��� üũ �ϴ� ����
		// -1 (����) <-> 1 (�ִ�)
		int idx = 0;
		
		// 
		for(int i = 0; i<arr.length - size + 1; i++) {
			int count = 0;
			for(int j = 0; j<size; j++) {
				if(arr[i+j] == word.charAt(j)) {
					count ++;
				}
			}
			if(count == size) {
				idx = i; // j = size - 1 �϶� 
				check = 1;
			}
		}
		
		// �Է� ���� word �� String text �ȿ� ������ �� ������
		if(check == 1) {
			int firstIdx = idx;
			int lastIdx = idx + size;
			
			int leng = lastIdx - firstIdx + 1;
			System.out.print("�������� �ٲٽðڽ��ϱ�? ");
			
			String change = scan.nextLine();
			int length = change.length();
			
			char[] temp = arr; // arr�迭�� temp�迭�� �Űܳ���
			
			String front = ""; // �� ���ڿ� front �� �����
			for(int i = 0; i<firstIdx; i++) {
				front += temp[i];
			}System.out.println(front);
			
			String back = ""; // �� ���ڿ� back �� �����
			for(int i = lastIdx; i<temp.length; i++) {
				back += temp[i];
			}System.out.println(back);
			
			String result = front + change + back;
			System.out.println(result);
			
			
		}else {
			System.out.println("�ش� �ܾ�� �������� �ʽ��ϴ�.");
		}
		
	}

}
