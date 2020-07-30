package step4;

import java.util.Random;
import java.util.Scanner;

/*
 * # 크레이지 아케이드
 * 1. 맵의 크기는 7 x 7 이다. 
 * 2. 상(1)하(2)좌(3)우(4)로 이동이 가능하며,
 *    폭탄설치(5), 폭파(6)로 설정한다. 
 * 3. 벽(3), 플레이어(2), 폭탄(9), 아이템(4)로 설정한다.
 * 4. 단, 폭탄이 설치된 순서대로 터져야 하며,
 *    폭파 시 십자가 형태로 터진다.
 * 5. 벽 파괴시 아이템이 랜덤하게 생성되어,
 *    아이템을 먹으면 설치할 수 있는 폭탄의 개수가 증가된다.
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
