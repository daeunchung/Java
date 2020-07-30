package step2;
//# 삼각형 그리기
public class Ex11_2 {

	public static void main(String[] args) {
		/*
		 * 예)
		 * ###
		 * ###
		 * ###
		 */
		for(int i=0; i<9; i++) {
			System.out.print("#");
			if(i % 3 == 2) {
				System.out.println();
			}
		}
		System.out.println();
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		/*
		 * 문제 1)
		 * #
		 * ##
		 * ###
		 */
		
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= i; j ++) {
				System.out.print("#");
			}System.out.println();
		}
		System.out.println();
		
		/*
		 * 문제 2)
		 * ###
		 * ##
		 * #
		 */

		for(int i = 3; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print('#');
			}System.out.println();
		}
		System.out.println();
		
		/*
		 * 문제 3)
		 * @##
		 * @@#
		 * @@@
		 */

		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 3; j++) {
				if(i >= j)
					System.out.print("@");
				else if(i < j)
					System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		
		/*
		 * 문제 4)
		 *   #
		 *  ###
		 * #####
		 */ 
		// 결국 못풀고 ㅠ.ㅠ 정답 봤어 ㅠㅠㅠㅠ 겁나 속상함
		
		int k = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 2; j > i; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j <= k; j++) {
				System.out.print("#");
			}
			k+=2;
			System.out.println();
		}
		
		
		
		
		
		/*for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 5; j++) {
				if(4-i <= j || i+2 <= j) {
					System.out.print("#");
				}
				System.out.print(" ");
			}System.out.println();
		}*/
		
		
		
	}

}
