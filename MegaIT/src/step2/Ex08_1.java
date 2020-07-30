package step2;
import java.util.Scanner;
/*
 * # 미니마블
 * 1. 플레이어는 p1과 p2 2명이다.
 * 2. 번갈아가며 1~3 사이의 숫자를 입력해 이동한다.
 * 3. 이동하다가 다음 플레이어와 같은 위치에 놓이게 되면,
 *    상대 플레이어는 잡히게 되어 원점으로 되돌아간다.
 * 4. 먼저 3바퀴를 돌면 이긴다.
 *    
 *  [p2]1~3 입력 : 1
 *  1 2 3 4 5 6 7 8 
 *  0 1 0 0 0 0 0 0 
 *  0 0 0 2 0 0 0 0 
 *  
 *  [p1]1~3 입력 : 3
 *  [p1]이 p2를 잡았다!
 *  1 2 3 4 5 6 7 8 
 *  0 0 0 0 1 0 0 0 
 *  2 0 0 0 0 0 0 0 
 */

public class Ex08_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] game = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] p1   = {0, 0, 0, 0, 0, 0, 0, 0};
		int[] p2   = {0, 0, 0, 0, 0, 0, 0, 0};
		
		int turn = 0;
		
		int idx1 = 0;	int idx2 = 0;
		p1[idx1] = 1;	p2[idx2] = 2;
		int round1 = 0; int round2 = 0;
		
		boolean run = true;
		while(run) {
		
		if(turn % 2 == 0) {
			System.out.print("[p2]1~3 입력 : ");
			int n2 = scan.nextInt(); 
			p2[idx2] = 0;
			idx2 += n2;
			if(idx2 >= 8) {
				idx2 = idx2 % 8; 
				round2++;
				p2[idx2] = 2;
			}else 
				p2[idx2] = 2;
			
			if(round2 >= 3) {
				System.out.println("p2가 먼저 3바퀴 돌았다. 승리!");
				break;
			}
		
		if(idx1 == idx2) {
			System.out.println("[p2]이 p1을 잡았다!");
			p1[idx1] = 0;
			idx1 = 0;
			p1[idx1] = 1;
		}
			
		}else if(turn % 2 == 1) {
			System.out.print("[p1]1~3 입력 : ");
			int n1 = scan.nextInt();
			p1[idx1] = 0;
			idx1 += n1;
			if(idx1 >= 8) {
				idx1 = idx1 % 8; 
				round1++;
				p1[idx1] = 1;
			}else 
				p1[idx1] = 1;
			
			if(round1 >= 3) {
				System.out.println("p1이 먼저 3바퀴 돌았다. 승리!");
				break;
			}
			
			if(idx1 == idx2) {
			System.out.println("[p1]이 p2를 잡았다!");
			p2[idx2] = 0;
			idx2 = 0;
			p2[idx2] = 2;
			}
		}
		turn++;
	
		for(int i = 0; i < 8; i++) {
			System.out.print(game[i] + " ");
		}System.out.println();
		for(int i = 0; i < 8; i++) {
			System.out.print(p1[i] + " ");
		}System.out.println();
		for(int i = 0; i < 8; i++) {
			System.out.print(p2[i] + " ");
		}System.out.println();
	}
	}

}
