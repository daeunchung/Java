package step2;
import java.util.Scanner;
/*
 * # 배열 컨트롤러[1단계] : 삭제
 */

public class Ex09_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10, 20, 30, 40, 50};
		int cnt = 5;
				
		boolean run = true;
		while(run) {
			int wrong = 0;
			
			for(int i = 0; i < 5; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			System.out.println("[2]삭제");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 2) {
				if(cnt == 0) {
					System.out.println("삭제할 값이 존재하지 않습니다.");
					continue;
				}
				
				System.out.print("삭제할 값 입력 : ");
				int data = scan.nextInt();
				
				for(int i = 0; i < 5; i++) {					
					if(data == arr[i]) {
						arr[i] = 0;
						cnt--;
					}
					else if(data != arr[i]) {
						wrong++;
					}
				}
				
				if(wrong == 5) {
					System.out.println("입력한 값이 존재하지 않습니다.");
				}
					/*if(data != arr[i]) {
						System.out.println("입력한 값이 존재하지 않습니다.");
						break;
					}*/
				
				
				
				
				}
				
			}
		}
	}


