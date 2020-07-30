package step6;

import java.util.Scanner;

/*
 * [1]클래스의 구성요소
 * 1. 변수
 * 2. 메서드
 * 
 * [2]메서드의 필요성
 * 반복되는 코드를 메서드를 통해 재활용 하기 위함
 * 
 * [3]메서드의 구조[1단계]
 * void print(){
 * 		실행할 내용;
 * } 
 * 1) void			: 키워드
 * 2) print()		: 메서드명
 * 3) {}			: 메서드 영역
 * 4) 숨겨진 변수가 있다.(자기 주소를 저장하고 있는 변수 : this)
 * 
 * [4]메서드의 사용(호출)
 * print();			: 메서드명();
 */

class Ex1{
	int num; // 클래스 안에서 변수를 초기화를 왜 안해줘도 되는걸까?
	
	void setNum() {
		System.out.println(this);
		this.num = 10;
	}
	
	void test1() {
		int total = 0;
		for(int i = 1; i <= 5; i++) {
			total += i;
		}System.out.println("total = " + total);
	}
	
	void test2() {
		Scanner scan = new Scanner(System.in);
		// 매서드 안에서 스캐너를 써버리는구나
		
		int max = 0; int cnt = 0;
		while(true) {
			System.out.print("정수 입력 : ");
			int num = scan.nextInt();
			
			if(max < num) {max = num;}
			cnt++;
			if(cnt == 3) {break;}
		}
		System.out.println("최대값 = " + max);	
	}
	
	// 선생님 ver
	/*void test2() {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[3];
		
		for(int i=0; i<3; i++) {
			System.out.print((i+1) + ".정수 입력 : ");
			arr[i] = scan.nextInt();
		}
		
		int maxNum = 0;
		for(int i=0; i<arr.length; i++) {
			if(maxNum < arr[i]) {
				maxNum = arr[i];
			}
		}
		
		System.out.println("최대값 = " + maxNum);
		
		scan.close();
	}*/
	
}

public class Ex01 {
	public static void main(String[] args) {

		Ex1 e = new Ex1();
		System.out.println(e);
		
		
		e.num = 20;
		
		System.out.println(e.num);
		
		e.setNum();
		System.out.println(e.num);
		
		//--------------------------------------------
		
		// 문제 1) 1부터 5까지의 합을 출력하는 메서드
		e.test1();
		
		// 문제 2) 정수 3개를 입력받아 최대값을 출력하는 메서드
		e.test2();
		
	}
}
