package step2;
// 7�� 24�� -
public class Ex11_2M {

	public static void main(String[] args) {
		/*
		 * ��)
		 * ###
		 * ###
		 * ###
		 * (2���� �ڵ��)
		 */
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("#");
			}System.out.println();
		}System.out.println();
		
		for(int i = 0; i < 9; i++) {
			System.out.print("#");
			if(i % 3 == 2) {
				System.out.println();
			}
		}System.out.println();
		
		/*
		 * ���� 1)
		 * #
		 * ##
		 * ###
		 */
		
		for(int i = 1; i <= 3; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("#");
			}System.out.println();
		}System.out.println();

		/*
		 * ���� 2)
		 * ###
		 * ##
		 * #
		 */

		for(int i = 0; i < 3 ; i++) {
			for(int j = 0 ; j < 3-i; j++) {
				System.out.print("#");
			}System.out.println();
		}System.out.println();
		
		/*
		 * ���� 3)
		 * @##
		 * @@#
		 * @@@
		 */

		for(int i = 0; i < 3; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("@");
			}
			for(int j = 2; j > i; j--) {
				System.out.print("#");
			}System.out.println();
		}System.out.println();
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i >= j) {
					System.out.print("@");
				}else if(i < j)
					System.out.print("#");
			}System.out.println();
		}System.out.println();
		
		/*
		 * ���� 4)
		 *   #
		 *  ###
		 * #####
		 */
		
		int k = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 2; j > i; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j <= k; j++) {
				System.out.print("#");
			}System.out.println();
			 k+=2;
		}

	}

}
