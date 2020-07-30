package step1;
/*
 * # 로그인[3단계]
 * 1. Id를 입력받아 dbId와 일치할 경우에만 Pw를 입력할 수 있다.
 * 2. Id가 틀린 경우, "Id를 확인해주세요"라는 메세지를 출력한다.
 * 3. Pw가 틀린 경우, "Pw를 확인해주세요"라는 메세지를 출력한다.
 * 4. Id와 Pw와 모두 일치하는 경우, "로그인 성공"라는 메세지를 출력한다.
 */

import java.util.Scanner;

public class Ex08_3Q {

	/*public static void main(String[] args) {
		int dbId = 1234;
		int dbPw = 1111;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Id를 입력하시오");
		
		int myId = scan.nextInt();
		if(myId == dbId) {System.out.println("Pw를 입력하시오");}
		if(myId != dbId) {System.out.println("Id를 확인해주세요");}
		
		int myPw = scan.nextInt();
		if(myPw == dbPw) {System.out.println("로그인 성공");}
		if(myPw != dbPw) {System.out.println("Pw를 확인해주세요");}

	}
}*/
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbId = 1234;
		int dbPw = 1111;
		
		System.out.print("ID 입력 : ");
		int myId = scan.nextInt();
		
		if(dbId == myId) {
			System.out.print("Pw 입력 : ");
			int myPw = scan.nextInt();
			
			if(dbPw == myPw) {
				System.out.println("로그인 성공!");
			}
			if(dbPw != myPw) {
				System.out.println("Pw를 확인해주세요.");
			}
		}
		if(dbId != myId) {
			System.out.println("Id를 확인해주세요.");
		}
	}
}// if 문이 이중구조로 되어있는게 더 좋은 코드인가

