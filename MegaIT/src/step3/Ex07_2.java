package step3;
import java.util.Scanner;
/*
 * # 배열 컨트롤러[2단계] : 벡터(Vector)
 * 1. 추가
 * . 값을 입력받아 순차적으로 추가
 * 2. 삭제(인덱스)
 * . 인덱스를 입력받아 해당 위치의 값 삭제
 * 3. 삭제(값)
 * . 값을 입력받아 삭제
 * . 없는 값 입력 시 예외처리
 * 4. 삽입
 * . 인덱스와 값을 입력받아 삽입
 */
public class Ex07_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] score = null;
		int count = 0; // score의 인덱스 수를 나타내는 변수
		
		while(true) {
			
			for(int i = 0; i<count; i++) {
				System.out.print(score[i] + " ");
			}System.out.println();
			
			System.out.println("[벡터 컨트롤러]");
			System.out.println("[1]추가");
			System.out.println("[2]삭제(인덱스)");
			System.out.println("[3]삭제(값)");
			System.out.println("[4]삽입");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(count == 0) {
					score = new int[count + 1];
				}else if(count > 0) {
					int[] temp = score; // score배열의 주소를 temp 에 복사
					score = new int[count + 1]; //score 배열 끝에 새로운 배열 한칸 추가
					
					for(int i = 0; i<count; i++) {
						score[i] = temp[i];
					}
					temp = null;
					
				}
				System.out.println("[추가]성적 입력 : ");
				int data = scan.nextInt();
				
				score[count] = data;
				count += 1;
				
				
			}
			else if(sel == 2) {
				System.out.println("[삭제]인덱스 입력 : ");
				int delIdx = scan.nextInt();
				
				if(count-1 < delIdx || delIdx < 0) {
					System.out.println("[메세지]해당 위치는 삭제할 수 없습니다.");
					continue;
				}
				
				if(count == 1) {
					score = null;
				}else if(count > 1) {
					int[] temp = score;
					score = new int[count - 1];
					
				for(int i = 0; i<delIdx; i++) {
					score[i] = temp[i];
				} // 삭제할 인덱스 앞의 놈들은 그대로 
				for(int i = delIdx; i<count-1; i++) {
					score[i] = temp[i+1];
				} // 삭제할 인덱스 뒤의 놈들은 한칸씩 땡겨줘
				
				temp = null;
				}
				
				count -= 1;
					
			}
			else if(sel == 3) {
				System.out.println("[삭제]값 입력 : ");
				int delData = scan.nextInt();
				
				int delIdx = -1;
				for(int i = 0; i<count; i++) {
					if(score[i] == delData) {
						delIdx = i;
					}
				}
				
				if(delIdx == -1) { // 입력 받은 값에 일치 하는 값이 하나도 없을 경우
					System.out.println("[메세지]입력하신 값은 존재하지 않습니다");
					continue;
				}
				
				if(count == 1) { // 삭제 전에 값이 하나였을 때
					score = null;	
				}else if(count > 1) {
					int[] temp = score; // 변질 되기 전에 score 배열 주소를 temp에 넣어놓고
					score = new int[count - 1]; // score배열에 새배열 선언
					
					int j = 0;
					for(int i = 0; i<count; i++) {
						if(i != delIdx) { // 입력받은 인덱스 아닌 놈들은 
							score[j] = temp[i]; // 잠깐 옮겨놨던 배열 끄집어와서 원위치 !!
							j += 1;
						}
					}
					
					temp = null;  // 이 과정에서  JAVA의 Garbage Collector에 의해 Heap에 있던 배열 삭제
				}
				count -= 1;
			}
			else if(sel == 4) {
				System.out.print("[삽입]인덱스 입력 : ");
				int insertIdx = scan.nextInt();

				if(count < insertIdx || insertIdx < 0) {
					System.out.println("[메세지]해당 위치는 삽입할 수 없습니다.");
					continue; // 반복문의 조건문으로 이동
				}
				
				System.out.println("[삽입]값 입력 : ");
				int insertData = scan.nextInt();
				
				if(count == 0) {
					score = new int[count + 1];
				}else if(count > 0) {
					int[] temp = score;
					score = new int[count + 1];
					
					int j = 0;
					for(int i = 0; i<count + 1; i++) {
						if(i != insertIdx) {
							score[i] = temp[j];
							j += 1;
						}
					}
					temp = null;

				}
			
				score[insertIdx] = insertData;
				count += 1;
				
			}
			else if(sel == 0) {
					break;
			}
		}

	}

}
