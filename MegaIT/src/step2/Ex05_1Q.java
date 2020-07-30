package step2;

import java.util.Scanner;

/*
 * # 값 교체하기[2단계] 
 */
public class Ex05_1Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int t = 0;
		int[] arr = {10, 20, 30, 40, 50};
		
		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예    1) 인덱스1 입력 : 1
		//		   인덱스2 입력 : 3
		//		  {10, 40, 30, 20, 50}
		System.out.println("문제 1) 인덱스 2개를 입력받아 값 교체하기");
		System.out.print("index1를 입력하시오 : ");
		int idx1 = scan.nextInt();
		System.out.print("index2를 입력하시오 : ");
		int idx2 = scan.nextInt();
		
		t = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = t;
		
		System.out.print("{ ");
		for(int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");		
		}
		System.out.println("} ");
		
		

		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예    2) 값1 입력 : 40
		//        값2 입력 : 20
		//		  {10, 20, 30, 40, 50}
		System.out.println("문제 2) 값 2개를 입력받아 값 교체하기");
		System.out.print("값1를 입력하시오 : ");
		int num1 = scan.nextInt();
		System.out.print("값2를 입력하시오 : ");
		int num2 = scan.nextInt();
		
		for(int i = 0; i < 5; i++) {
			if(num1 == arr[i]) {
				idx1 = i;
			}
			if(num2 == arr[i]) {
				idx2 = i;
			}
		}
			t = arr[idx1];  // 강사님은 위에 따로 int t = 0; 초기화선언안하시고 여기서 바로 int t = arr[idx1]함
			arr[idx1] = arr[idx2];
			arr[idx2] = t;
		
		System.out.print("{ ");
		for(int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");		
		}
		System.out.println("} ");
		
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};

		// 문제 3) 학번 2개를 입력받아 성적 교체하기
		// 예    3) 학번1 입력 : 1002
		//        학번2 입력 : 1003
		//		 {87, 45, 11, 98, 23}
		System.out.println("문제 3) 학번 2개를 입력받아 성적 교체하기");
		System.out.print("학번1을 입력하시오 : ");
		int hakbun1 = scan.nextInt();
		System.out.print("학번2를 입력하시오 : ");
		int hakbun2 = scan.nextInt();
		
		for(int i = 0; i < 5; i++) {
			
			if(hakbun1 == hakbuns[i]) {
				idx1 = i;
			}
			if(hakbun2 == hakbuns[i]) {
				idx2 = i;
			}
		}
		
		t = scores[idx1] ;
		scores[idx1] = scores[idx2];
		scores[idx2] = t;
		
		System.out.print("{ ");
		for(int i = 0; i < 5; i++) {
			System.out.print(scores[i] + " ");		
		}
		System.out.println("} ");

	}

}
