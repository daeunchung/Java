package step3;
import java.util.Scanner;
/*1213-1233
 * # ��ٸ� ����
 * 1. 0�� ������ �Ʒ��� ��������.
 * 2. 1�� ������ �¿츦 �˻��� 1�� ������ �̵� �� �Ʒ��� ��������.
 * 3. x�� ��ġ�� �Է¹ް� ��ٸ��� ǥ���Ѵ�.
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
					System.out.print(" �� ");
					// Ư������ : �� + ����
				}else if(ladder[i][j] == 1) {
					if(j != 0 && ladder[i][j-1] == 1) {
						System.out.print("���� ");
					}else if(j != 4 && ladder[i][j+1] == 1){
						System.out.print(" ����");
					}
				}
			}System.out.println();
			
		}
		
		System.out.print("0~4 �Է� : ");
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
