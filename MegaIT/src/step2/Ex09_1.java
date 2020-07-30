package step2;
import java.util.Scanner;
/*
 * # 배열 컨트롤러[1단계] : 추가
 */
public class Ex09_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10, 20, 0, 0, 0};
		int cnt = 2;
		
		boolean run = true;
		while(run) {

			for(int i=0; i<cnt; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();			
			
			System.out.println("[1]추가");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				
				if(cnt == 5) {
					System.out.println("더이상 추가할 수 없습니다. ");
					break; 
					
					//정답코드는 break; 말고  continue; 씀
					//반복문의 조건식으로 바로 이동
					//아래식을 실행시키고 싶지 않을 때 사용
				}
				
				System.out.print("추가할 값 입력 : ");
				int data = scan.nextInt();
				arr[cnt] = data;
				cnt++;
				
			}
			
		}
	}

}
