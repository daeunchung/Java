package step4;

import java.util.Random;
import java.util.Scanner;

/*
 * # ũ������ �����̵�
 * 1. ���� ũ��� 7 x 7 �̴�. 
 * 2. ��(1)��(2)��(3)��(4)�� �̵��� �����ϸ�,
 *    ��ź��ġ(5), ����(6)�� �����Ѵ�. 
 * 3. ��(3), �÷��̾�(2), ��ź(9), ������(4)�� �����Ѵ�.
 * 4. ��, ��ź�� ��ġ�� ������� ������ �ϸ�,
 *    ���� �� ���ڰ� ���·� ������.
 * 5. �� �ı��� �������� �����ϰ� �����Ǿ�,
 *    �������� ������ ��ġ�� �� �ִ� ��ź�� ������ �����ȴ�.
 */
public class Ex21 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		final int SIZE = 7;
		final int WALL = 3;
		final int PLAYER = 2;
		final int BOMB = 9;
		final int ITEM = 4;

		boolean playerDead = false;
		int bombMaxCount = 3;
		int bombCount = bombMaxCount;
		int wallCount = 20;
		int itemCount = 0;
		int pX = 0;
		int pY = 0;
		
		int[] bombX = new int[bombMaxCount];
		int[] bombY = new int[bombMaxCount];
		int[][] map = new int[SIZE][SIZE];


	}

}
