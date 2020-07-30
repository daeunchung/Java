package step4;

import java.util.Scanner;

/*
 * # 끝말잇기 게임
 * 제시어 : 자전거
 * 입력 : 거미
 * 제시어 : 거미
 * 입력 : 미술
 * ...
 */
public class Ex04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String start = "자전거";
		
		while(true) {
			int size = start.length(); // start문자열의 끝음절과 입력받은 단어의 첫음절이 일치하는지 확인하기 위해  문자열길이 저장
			System.out.println("제시어 : " + start);
			
			System.out.print("입력 : ");
			String myWord = scan.next();
			
			if(start.charAt(size - 1) == myWord.charAt(0)) {
				start = myWord;
			}
			
		}
	}
}
