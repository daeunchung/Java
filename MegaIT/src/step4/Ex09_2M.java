package step4;
import java.util.Scanner;
/*
 * # 단어 교체하기(replace)
 * 1. text변수 문장 속에서 변경하고 싶은 단어를 입력받아,
 * 2. 교체해주는 기능을 구현한다.
 * 예)
 * 		Life is too short.
 * 		변경하고 싶은 단어입력 : Life
 * 		바꿀 단어입력 : Time
 * 
 * 		Time is too short.
 */
public class Ex09_2M {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("변경하고 싶은 단어를 입력하세요 : ");
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
			System.out.print("새 단어 입력 : ");
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
			System.out.println("해당 단어가 존재하지 않습니다.");
		}

	}

}
