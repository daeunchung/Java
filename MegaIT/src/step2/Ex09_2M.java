//2020-02-20 14:31-14:48
package step2;
/*
 * # 배열 컨트롤러[1단계] : 삭제
 */
import java.util.Scanner;

public class Ex09_2M {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int[] arr = {10, 20, 30, 40, 50};
		int cnt = 5;
		
		boolean run = true;
		while(run) {
			for(int i = 0; i < cnt; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			System.out.println("[2]삭제");
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			int delIdx = -1;
			
			if(sel == 2)
				
				System.out.print("삭제할 값 입력 : ");
				int data = scan.nextInt();
				
				// for(int i = 0; i < 5; i++) {// 잘못됐잖아 !! 배열크기는 갈수록 줄어드는데 i < 5로 고정되어있다니 !
				for(int i = 0; i < cnt; i++) {
					if(data == arr[i]) {
						delIdx = i;
					}
				}
				//for문을 다~~~ 돌았는데도 delIdx값이 여전히 안바뀌고 -1이네? -> for(int i=0; i<cnt; i++)동안
				//계~속 arr[i] != data 였다는 소리 !
				//그 for문 뒤에 delIdx값을 가지고 if-else 문 써서 조건을 따져!
				
				if(delIdx == -1) {
					System.out.println("입력한 값이 존재하지 않습니다.");
				}else {
					for(int i = delIdx; i < cnt-1; i++) {
						arr[i] = arr[i+1];
					}cnt--;
				}
				
				if(cnt == 0 ) {
					System.out.println("더이상 삭제할 값이 없습니다.");
					run = false;
				}
		}
	}

}
