package step4;
import java.util.Scanner;

/*
 * # ������ũ ����
 * 1. 10x10 �迭�� 0���� ä���.
 * 2. ������ũ�� 1234�� ǥ���Ѵ�.
 * 3. �����¿�� �̵��� �����ϸ�, ������ ����´�.
 * 4. �ڱ���ϰ� �ε�����, ����Ѵ�.
 * 5. �������� �������� ������
 *    �������� ������ ���� 1���� �ڶ���.
 * 6. ������ �ִ� 8������ ������ �� �ִ�.
 */
public class Ex17_1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		final int SIZE = 10;
		int[][] map = new int[SIZE][SIZE];
		
		int[] x = new int[4];
		int[] y = new int[4];
		int[] snake = new int[4];
		
		for(int i=0; i<4; i++) {
			x[i] = i;
			map[y[i]][x[i]] = i + 1;
			snake[i] = map[y[i]][x[i]];
		}
		
		while(true) {
			
			for(int i=0; i<SIZE; i++) {
				for(int j=0; j<SIZE; j++) {
					System.out.print(map[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
			
			System.out.print("1)left 2)right 3)up 4)down : ");
			int sel = scan.nextInt();
			
			// ������ũ�� �Ӹ��κ�(1) �� �̵��� ��ǥ ���� ��Ÿ���� ����
			int yy = 0; 
			int xx = 0;
			
			if(sel == 1) {yy = y[0]; xx = x[0]-1;}
			else if(sel == 2) {yy = y[0]; xx = x[0]+1;}
			else if(sel == 3) {yy = y[0]-1; xx = x[0];}
			else if(sel == 4) {yy = y[0]+1; xx = x[0];}
			if(yy<0 || xx<0) {continue;}
			if(yy>=SIZE || xx>=SIZE) {continue;} // map �������� ����� ����
			if(map[yy][xx] != 0) {continue;} // ��������� �������� ����
			
			// ȭ�� �ʱ�ȭ
			for(int i=0; i<SIZE; i++) {
				for(int j=0; j<SIZE; j++) {
					map[i][j] = 0;
				}
			}
			
			// �̵��ϱ�
			/*for(int i = 0; i<snake.length-1; i++) {
				y[i+1] = y[i];
				x[i+1] = x[i];
			} ���ƺ������� �߸��� �ڵ� �� Ʋ���� �����غ��� ! : �̹� �ٲ� ���� ���� �������� ���ϱ� ~ */
			
			for(int i=snake.length-1; i>0; i--) {
				y[i] = y[i - 1];
				x[i] = x[i - 1];
			}y[0] = yy; x[0] = xx;
		
			// �� ǥ��
			for(int i = 0; i<snake.length; i++) {
				map[y[i]][x[i]] = i+1;
			}
		}
	}

}
