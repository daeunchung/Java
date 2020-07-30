package step1;

import java.util.Random;
import java.util.Scanner;

/*
 * # 카카오 택시
 * 1. 손님을 태워 목적지까지 이동하는 게임이다.
 * 2. -10~10 사이의 랜덤 숫자 2개를 저장해 목적지로 설정한다.
 * 3. 메뉴는 아래와 같다.
 * 		1) 속도설정 : 1~3까지만 가능
 * 		2) 방향설정 : 동(1)서(2)남(3)북(4)
 * 	// 함수 2차원 x y 좌표 판이라고 생각하면됌 // 동이랑 북이 + 서랑 남이 -
 * 
 * 		3) 이동하기 : 설정된 방향으로 설정된 속도만큼 이동
 * 4. 거리 2칸 당 50원씩 추가되어 요금도 출력한다.
 * 예) 1(50) 2(50) 3(100) 4(100) ...
 */
public class Ex20_2Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		// 목적지(destination)
		int desX = ran.nextInt(21) - 10;
		int desY = ran.nextInt(21) - 10;
		
		// 현재 위치
		int x = 0;
		int y = 0;
		
		// 방향(direction)
		int dir = 0;
		
		// 속도
		int speed = 0;
		int totSpeed = 0;
		// 요금
		int fee = 0;
		
		boolean run = true;
		while(run) {
			
			System.out.println("= 카카오 택시 =");
			System.out.println("목적지 : " + desX + "," + desY);
			System.out.println("현위치 : " + x + "," + y);
			System.out.println("방   향 : " + dir);
			System.out.println("속   도 : " + speed);
			System.out.println("============");
			
			System.out.println("1.방향설정");
			System.out.println("2.속도설정");
			System.out.println("3.이동하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.println("방향을 설정하시오");
				System.out.print("동(1)서(2)남(3)북(4) :  ");
				dir = scan.nextInt();
			}
			else if(sel == 2) {
				System.out.println("속도[1~3까지]를 설정하시오 :  ");
				speed = scan.nextInt();
			}
			else if(sel == 3) {
				
				if(dir == 1) {
					x += speed;
				}
				else if(dir == 2) {
					x -= speed;
				}
				else if(dir == 3) {
					y -= speed;
				}
				else if(dir == 4) {
					y += speed;
				}
				
				totSpeed += speed ;
				// 이동하는 모든 move들이 모두 누적되어야 하므로
				// if(sel == 3)문 안에 실행식이 들어있어야함
			}
			
			
			if(totSpeed % 2 == 1) {
				fee = (totSpeed + 1) * 25;
			}else
				fee = totSpeed * 25;
					
			
			if( x == desX && y == desY) {
				System.out.println("목적지에 도착하였습니다");
				run = false;
			}
			
		}
		System.out.println("요금은 " + fee + "원 입니다.");
	}
}
