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
public class Ex09_2M {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("�����ϰ� ���� �ܾ �Է��ϼ��� : ");
		String word = scan.nextLine();
		
		char[] arr = new char[text.length()];
		for(int i = 0; i<text.length(); i++) {
			arr[i] = text.charAt(i);
		}
		
		int size = word.length();
		int check = -1;
		int idx = 0;
		for(int i = 0; i<text.length()-size+1; i++) {
			int count = 0;
			for(int j = 0; j<size; j++) {
				if(arr[i+j] == word.charAt(j)) {
					count++;
				}
			}if(count == size) {
				idx = i;
				check = 1;
			}
		}
		if(check == 1) {
			System.out.print("�� �ܾ� �Է� : ");
			String nword = scan.nextLine();
			
			String front = "";
			for(int i = 0; i<idx; i++) {
				front += arr[i];
			}
			String back = "";
			for(int i = idx+size; i<text.length(); i++) {
				back += arr[i];
			}
			
			String ntext = front + nword + back;
			System.out.println(ntext);
			
		}else {
			System.out.println("�ش� �ܾ �������� �ʽ��ϴ�.");
		}

	}

}
