package step1;

import java.util.Scanner;

/*
 * # 입력받기
 * 1. impor java.util.Scanner;
 * java.util패키지 안의 Scanner 클래스 파일을 현재 페이지로 불러온다
 * 2. scan 변수 설정
 * Scanner scan = new Scanner(System.in);
 * 3. 안내문 작성
 * System.out.print("나이를 입력하세요 : ");
 * 4. 입력받기
 * int age = scan.nextInt();
 * 
 */

public class Ex05_1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//아래에서 Scan까지 치고 Ctrl+space 누르면 자동으로 위에서 util.Scanner import 됌
		
		System.out.println("숫자를 입력하세요");
		int num = scan.nextInt();
		System.out.println("입력하신 숫자는 " + num + "입니다");
		
		System.out.println("나이를 입력하세요 : ");
		int age = scan.nextInt();
		System.out.println("당신의 나이는 " + age + "세 이군요!");
		
// 1) int를 입력 받을 때는 nextInt 메서드를 이용한다. 
// 2) char를 입력 받을 때는 (char)System.in.read 메서드를 이용한다.
// 3) char를 여러개 입력 받을 때는 nextLine 메서드를 이용한다.
	}

}
