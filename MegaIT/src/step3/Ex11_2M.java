package step3;
import java.util.Scanner;

/*
 * # 쇼핑몰 [장바구니]
 * 1. 로그인 후 쇼핑 메뉴를 선택하면, 다음과 같이 상품목록을 보여준다.
 * 	1) 사과
 *  2) 바나나
 *  3) 딸기
 * 2. 번호를 선택해 상품을 장바구니에 담을 수 있다.
 * 3. 로그인 회원의 인덱스 번호는 각 행의 첫번째 열에 저장한다.
 * 4. 해당 회원이 구매한 상품의 인덱스 번호는 각 행의 두번째 열에 저장한다.
 * 예)
 * {
 * 		{0, 1},				qwer회원 			> 사과구매
 * 		{1, 2},				javaking회원 		> 바나나구매
 * 		{2, 1},				abcd회원			> 사과구매
 * 		{0, 3},				qwer회원			> 딸기구매
 * 		...
 * }
 */
public class Ex11_2M {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111",     "2222", "3333"};
		
		int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];
		
		int count = 0;
		
		String[] items = {"사과", "바나나", "딸기"};
		
		int log = -1;
		
		while(true) {
			System.out.println("---------------");
			System.out.print("상태 : ");
			if(log == -1) {
				System.out.println("로그아웃");
			}else {
				System.out.println(ids[log] + "님 로그인");
			}
			System.out.println("---------------");
			System.out.println("[MEGA MART]");
			System.out.println("[1]로 그 인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼     핑");
			System.out.println("[4]장바구니");
			System.out.println("[0]종     료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.print("ID : ");
				String id = scan.next();
				System.out.print("PW : ");
				String pw = scan.next();
				
				for(int i = 0; i<ids.length; i++) {
					if(id.equals(ids[i]) && pw.equals(pws[i])) {
						log = i;
					}
				}
				
				if(log == -1) {
					System.out.println("ID와 PW를 확인해주세요");
				}else {
					System.out.println(ids[log] + "님 환영합니다.");
				}
				
			}
			else if(sel == 2) {
				log = -1;
				System.out.println("로그아웃 되었습니다.");
			}
			else if(sel == 3) {
				
				while(true) {
					System.out.println("[상품목록]");
					for(int i = 0; i<items.length; i++) {
						System.out.println((i+1) + ") " + items[i]);
					}
					System.out.println("4) 뒤로가기");
					
					System.out.println("상품번호를 선택하시오");
					int choice = scan.nextInt();
					
					if(choice == 4) {
						break;
					}
					
					jang[count][0] = log;
					jang[count][1] = choice;
					count++;
				}
			}
			
			else if(sel == 4) {
				int apple = 0;
				int banana = 0;
				int berry = 0;
				
				for(int i = 0; i<count; i++) {
					if(jang[i][0] == log) {
						if(jang[i][1] == 1) { apple++; }
						if(jang[i][1] == 2) { banana++; }
						if(jang[i][1] == 3) { berry++; }
					}
				}
					System.out.println(items[0] + " : " + apple + "개");
					System.out.println(items[1] + " : " + banana + "개");
					System.out.println(items[2] + " : " + berry + "개");
			}
			
			else if(sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}

	}

}
