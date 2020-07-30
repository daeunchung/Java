package step3;

import java.util.Scanner;

/*
 * # 2차원배열[삭제]
 * . 이름과 번호를 입력받아 삭제하기
 * 예)
 * 입력 : 철수	1
 * 삭제 : 김밥
 * 
 * 입력 : 철수 2
 * 삭제 : 바나나
 */
public class Ex13_1M {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[][] jang = {
			{"철수", "소고기"},
			{"철수", "김밥"},
			{"영희", "김치"},
			{"철수", "바나나"},
			{"철수", "새우깡"},
			{"영희", "오징어"},
			{"영희", "맛밤"}};
		
		for(int i = 0; i<jang.length; i++) {
			System.out.println(jang[i][0] + " : " + jang[i][1]);
		}
		System.out.print("[삭제]이름 입력 : ");
		String name = scan.next();
		System.out.print("[삭제]번호 입력 : ");
		int idx = scan.nextInt();
		
		int delIdx = -1; int count = 0;
		for(int i = 0; i<jang.length; i++) {
			if(name.equals(jang[i][0])) {
				if(idx == count) {
					delIdx = i;
				}
				count++;
			}
		}
		
		String[][] temp = jang;
		jang = new String [temp.length-1][2];
		
		int j = 0;
		for(int i = 0; i<temp.length; i++) {
			if(delIdx != i) {
				jang[j] = temp[i];
				j++;
			}
		}
		
		for(int i = 0; i<jang.length; i++) {
			System.out.println(jang[i][0] + " : " + jang[i][1]);
		}
	}
}
