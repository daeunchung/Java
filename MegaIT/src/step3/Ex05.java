package step3;
import java.util.Scanner;
/*
 * # ATM[4단계] : 전체 기능구현
 * 1. 회원가입
 * . id와 pw를 입력받아 가입
 * . 가입 시 돈 1000원 부여
 * . id 중복체크
 * 2. 회원탈퇴
 * . 로그인시에만 이용가능
 * 3. 로그인
 * . id와 pw를 입력받아 로그인
 * . 로그아웃 상태에서만 이용가능
 * 4. 로그아웃
 * . 로그인시에만 이용가능
 * 5. 입금
 * . 로그인시에만 이용가능
 * 6. 이체
 * . 로그인시에만 이용가능
 * 7. 잔액조회
 * . 로그인시에만 이용가능
 */

/*public class Ex05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int MAX = 5;
		
		int[] arAcc = new int[MAX];
		int[] arPw = new int[MAX];
		int[] arMoney = new int[MAX]; // 5개의 계좌, 비번, 잔액을 받기 위한 배열
		
		int count = 0; // 회원 수 세는 변수
		int log = -1; // 로그인 상태 나타내는 변수
		
		String menu = "=== 메가IT ATM ===\n" ;
				//String 변수에 변수명은 menu로 지정하고 내용을 넣어준것임
		menu += "1.회원가입\n2.회원탈퇴\n3.로그인\n4.로그아웃\n";
		menu += "5.입금\n6.이체\n7.잔액조회\n0.종료";
		
		while(true) {
			
			System.out.println("[회원 수 : " + count + "명]");
			for(int i = 0; i<count; i++) {
				System.out.println(arAcc[i] + ":" + arPw[i] + "(" + arMoney[i] + "원");
			}
			System.out.println("-----------------");
			System.out.print("[접속자] : ");
			if(log == -1) {
				System.out.println("없음");
			}else {
				System.out.println(arAcc[log]);
			}
			
			System.out.println("-----------------");
			
			System.out.println(menu);
			
			int sel = scan.nextInt();
			
			// 회원수 보여주고 현재 접속자 보여주고 메뉴 출력하고 메뉴 입력받기
			
			if(sel == 1) {
				if(count == 5) {
					System.out.println("회원가입은 5명 까지만 가능합니다. ");
					continue;
				}
			}
			
			System.out.println("[가입]Acc 입력 : ");
			int myAcc = scan.nextInt();
			
			int check = 1;
			for(int i = 0; i<count; i++) {
				if(arAcc[i] == myAcc) {
					check = -1;
				}
			}
			if(check == -1) {
				System.out.println("Acc가 중복됩니다.");
			}else {
				
				System.out.println("[가입]Pw 입력 : ");
				int myPw = scan.nextInt();
				
				arAcc[count] = myAcc;
				arPw[count] = myPw;
				arMoney[count] = 1000;
				count += 1;
				System.out.println("[메세지]가입을 축하합니다.");
			}
		}
		
		else if(sel == 2) {
			if(log == -1) { //로그아웃 상태이면
				System.out.println("[메세지]로그인 후 이용가능합니다.");
			}else {
				for(int i = 0;)
			}
			
			
			
		}
		
			
		
	}

}*/
