package step2;
//# �ﰢ�� �׸���
public class Ex11_2 {

	public static void main(String[] args) {
		/*
		 * ��)
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
		 * ���� 1)
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
		 * ���� 2)
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
		 * ���� 3)
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
		 * ���� 4)
		 *   #
		 *  ###
		 * #####
		 */ 
		// �ᱹ ��Ǯ�� ��.�� ���� �þ� �ФФФ� �̳� �ӻ���
		
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
