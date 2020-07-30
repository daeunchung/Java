package step1;

import java.util.Scanner;

/*
 * # 로그인[1단계]
 * 1. Id와 Pw를 입력받는다.
 * 2. 입력받은 데이터와 db데이터를 비교해 로그인 처리를 진행한다.
 * 예) 로그인 성공 or 로그인 실패
 */

public class Ex07_1Q {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ID(4자리수)를 입력하시오");
		int meId = scan.nextInt();
		System.out.println("PW(4자리수)를 입력하시오");
		int mePW = scan.nextInt();
		
		int dbId = 1234;
		int dbPw = 1111;

		if(meId == dbId && mePW == dbPw) {
			System.out.println("로그인 성공");
			}
			else
			System.out.println("로그인 실패");
		}
		
	}
