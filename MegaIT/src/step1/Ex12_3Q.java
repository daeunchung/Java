package step1;
/*
 * # 가위바위보 게임[2단계]를
 *   if - else if 구문으로 변경해보자.
 */
import java.util.Random;
import java.util.Scanner;

public class Ex12_3Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int com = ran.nextInt(3);
		System.out.println("가위(0),바위(1),보(2) 입력 : ");
		int me = scan.nextInt();
		
	
		if(me==com)
			System.out.println("비겼다");
		
		if(com == 0 && me == 1) {
			System.out.println("이겼다.");
		}
		else if(com == 1 && me == 2) {
			System.out.println("이겼다.");
		}
		else if(com == 2 && me == 0) {
			System.out.println("이겼다.");
		}else 
			System.out.println("졌다.");
	}

}
