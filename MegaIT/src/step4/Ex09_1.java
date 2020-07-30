package step4;
import java.util.Scanner;
/*
 * # 단어 검색
 * 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다.
 * 2. 단어가 존재하면 true
 *    단어가 없으면 false를 출력한다.
 */

public class Ex09_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("검색할 단어를 입력하세요 : ");
		String word = scan.next();
		
		char[] arr = new char[text.length()]; // 원소 18인 배열
		// text 문자열에 문자들 하나씩 쪼개서  char[] arr 로 넣어줌
		for(int i = 0; i<text.length(); i++) {
			arr[i] = text.charAt(i); 
		}
		
		int size = word.length();
		int check = -1;
		
		// i = 0 일때부터 arr.length - size + 1 일때 까지
		// 입력 받은 word와 연속적으로 알파벳이 일치하는  i 가 있는지 확인하는것
		// 얼마나 연속되냐? -> count 값이 size(word.length()) 와 일치할때 까지 
		
		for(int i = 0; i<arr.length - size + 1; i++) {
			int count = 0; 
			
			for(int j = 0; j<size; j++) {
				if(arr[i+j] == word.charAt(j)) {
					count += 1;
				}
			}
			if(count == size) {
			check = 1;
			}
		}
		
		if(check == 1) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		
	}

}
