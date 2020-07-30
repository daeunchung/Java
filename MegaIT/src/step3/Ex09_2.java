package step3;
import java.util.Scanner;
/*1213-1233
 * # 사다리 게임
 * 1. 0을 만나면 아래로 내려간다.
 * 2. 1일 때에는 좌우를 검사해 1인 쪽으로 이동 후 아래로 내려간다.
 * 3. x의 위치를 입력받고 사다리를 표현한다.
 * 		x = 0	x = 4
 * 		x = 1	x = 2
 * 		x = 2	x = 1
 * 		x = 3	x = 3
 * 		x = 4	x = 0
 */
public class Ex09_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ladder[][]= {
				{0,0,0,0,0},
				{1,1,0,1,1},
				{0,1,1,0,0},
				{0,0,1,1,0},
				{1,1,0,0,0},
				{0,1,1,0,0},
				{1,1,0,0,0},
				{0,0,0,1,1},
				{0,0,0,0,0}};
		
		int x = 0; int y = 0;
		
		for(int i = 0; i<ladder.length; i++) {
			for(int j = 0; j<ladder[i].length; j++) {
				if(ladder[i][j] == 0) {
					System.out.print(" │ ");
					// 특수문자 : ㅂ + 한자
				}else if(ladder[i][j] == 1) {
					if(j != 0 && ladder[i][j-1] == 1) {
						System.out.print("─┤ ");
					}else if(j != 4 && ladder[i][j+1] == 1){
						System.out.print(" ├─");
					}
				}
			}System.out.println();
			
		}
		
		System.out.print("0~4 입력 : ");
		y = scan.nextInt();
		for(int i = 0; i<ladder.length; i++) {
			
			if(ladder[x][y] == 0) {
				x++;
			}else if(ladder[x][y] == 1) {
				if(y != 0 && ladder[x][y-1] == 1) {
					y--;
				}else if(y != 4 && ladder[x][y+1] == 1) {
					y++;
				}x++;
			}
		}
		
		System.out.println("x = " + y);
		System.out.println("y = " + x);
	}

}
