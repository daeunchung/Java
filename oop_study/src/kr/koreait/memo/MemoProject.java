package kr.koreait.memo;

import java.util.Scanner;

public class MemoProject {

//	현재 클래스에서 2개 이상의 메소드에서 사용해야 하는 변수는 또는 객체는 반드시 멤버로 만들어 사용한다
	static MemoList memoList = new MemoList();
	
	public static void main(String[] args) {

//		MemoVO vo = new MemoVO("홍길동", "1111", "1등 입니다");
//		System.out.println(vo);
		
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		while(menu != 7) {
			do {
				System.out.println("==========================================================================");
				System.out.println(" 1.입력  2.목록보기  3.수정  4.삭제  5.파일로저장  6.파일에서읽기  7.종료 ");
				System.out.println("==========================================================================");
				System.out.print("원하는 메뉴를 선택하세요 : ");
				menu = sc.nextInt();
			}while(menu < 1 || menu > 7);
			
//			입력된 메뉴에 따라 실행할 작업을 선택한다.
			switch(menu) {
			case 1: 
			}
				
		}
	}

}
