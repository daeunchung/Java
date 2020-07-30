package step1;
/*
 * # 로그인[2단계]
 * 1. Id와 Pw를 입력받아 회원가입을 진행한다.
 * 2. 이후 로그인을 위해 다시 Id와 Pw를 입력받는다.
 * 3. 가입 후 저장된 데이터와 로그인 시 입력받은 데이터를 비교한다.
 * 예) 로그인 성공 or 로그인 실패
 */

import java.util.Scanner;

public class Ex07_2Q {
	//코드에 dbId dbPw 초기값을 0으로 설정했던데 왜 설정하는지?

	public static void main(String[] args) {
		
		int num = 0;
		System.out.println(num);
		//java는 main안에서 지역변수만 사용가능해서 
		//변수를 아예 선언을 하지말고 아래처럼 사용하든지
		//아니면 선언할꺼면 위처럼 초기값 주고 사용하든지 !!
		
		Scanner scan = new Scanner(System.in);
		System.out.println("회원가입을 진행합니다");
		
		System.out.println("아이디(4자리 수)를 입력하시오");
		int dbId = scan.nextInt();
		System.out.println("비밀번호(4자리 수)를 입력하시오");
		int dbPw = scan.nextInt();
		
		System.out.println("로그인을 진행합니다");
		
		System.out.println("아이디(4자리 수)를 입력하시오");
		int liId = scan.nextInt();
		System.out.println("비밀번호(4자리 수)를 입력하시오");
		int liPw = scan.nextInt();
		
		if(dbId == liId && dbPw == liPw) {
			System.out.println("로그인 성공");
		}
		else
			System.out.println("로그인 실패");
	}

}
