package step6;

import java.util.Scanner;

/*
 * # 학생성적 관리 프로그램[3단계] : 클래스 + 메서드
 * 1. 학번을 입력하면, 해당 학생의 성적이 출력된다.
 * 2. 단, 없는 학번 입력에 관한 예외상황을 반드시 처리해야 한다.
 * 3. 1등과 꼴등 학생의 정보를 확인할 수 있다.
 */

class Ex6{
	
	String name = "";
	
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore  = {  92,   38,   87,  100,   11};
	
	void choice1() {
		for(int i = 0; i<arHakbun.length; i++) {
			System.out.println(arHakbun[i] + "학생 : " + arScore[i] + "점");
		}
	}
	
	void choice2() {
		int maxScore = 0;
		int maxIdx = 0;
		for(int i = 0; i<arScore.length; i++) {
			if(maxScore < arScore[i]) {
				maxScore = arScore[i];
				maxIdx = i;
			}
		}
		System.out.println("1등 : " + arHakbun[maxIdx] + "학생(" + maxScore + "점)");
	}
	
	void choice3() {
		int minScore = arScore[0];
		int minIdx = 0;
		for(int i = 0; i<arScore.length; i++) {
			if(minScore > arScore[i]) {
				minScore = arScore[i];
				minIdx = i;
			}
		}
		System.out.println("꼴등 : " + arHakbun[minIdx] + "학생(" + minScore + "점)");
	}
	
	void choice4() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학번 입력 : ");
		int hakbun = scan.nextInt();
		
		int idx = -1;
		for(int i = 0; i<arHakbun.length; i++) {
			if(hakbun == arHakbun[i]) {
				idx = i;
			}
		}
		if(idx == -1) {
			System.out.println("해당 학번이 존재하지 않습니다.");
		}else {
			System.out.println(arHakbun[idx] + "학생(" + arScore[idx] + "점)");
		}
	}
}

public class Ex06 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		Ex6 mega = new Ex6();
		mega.name = "메가IT 고등학교";
		
		while(true) {
			// 메뉴 출력
			System.out.println("=== " + mega.name + "===");
			System.out.println("1.전교생 성적확인");
			System.out.println("2.1등학생 성적확인");
			System.out.println("3.꼴등학생 성적확인");
			System.out.println("4.(학번을 입력받아)성적확인하기");
			System.out.println("5.종료하기");
			
			// 메뉴 선택
			System.out.print("메뉴 선택 : ");
			int choice = scan.nextInt();
			
			if(choice == 1) { mega.choice1(); }
			else if(choice == 2) { mega.choice2(); }
			else if(choice == 3) { mega.choice3(); }
			else if(choice == 4) { mega.choice4(); }
			else if(choice == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}
