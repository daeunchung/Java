package step2;
/*
 * # 배열(array)
 * 1. "같은 종류"의 데이터를 "여러개" 저장하기 위한 기술
 * 2. 사용법
 * 		int num = 10;
 * 		int[] arr = new int[방의 개수];
 * 		int arr[] = new int[방의 개수];
 * 3. 인덱스(index)
 * 		0부터 시작하는 방번호(index)가 부여된다.
 * 4. 주소 변수
 * 
 * 
 * 
 * 
 * new : 힙메모리에 정수형 값 1개를 생성해줘 !
 * 변수는 모두 stack메모리에 저장
 * 
 */

public class Ex01_1 {

	public static void main(String[] args) {
		// 1. 일반변수(값 저장)
		int num = 0;
		num = 10;
		System.out.println("num = " + num);
		
		// 2. 주소변수(주소 저장)
		int[] arr = null;              		// null(주소가 없음)
		//주소는 안넣어주고 stack에 int[] arr만 만들어놓은건가 ~?
		
		arr = new int[5];
		//stack에 만들어 놓은 상자에 heap에서 배열 만들어서 주소를 넣어준건가 ~?
		
		System.out.println("arr = " + arr); // [I@15db9742  [ 가 열려있다 : 배열 주소 
		// I : integer 형 변수다
		// java는 자동으로 0이 저장되어있다.
		
		System.out.println(arr[0]);			// 0
		System.out.println(arr[1]);			// 0
		System.out.println(arr[2]); 		// 0
		System.out.println(arr[3]);			// 0
		System.out.println(arr[4]);			// 0
		System.out.println();

		// java.lang.ArrayIndexOutOfBoundsException : 5
		// System.out.println(arr[5]);
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		for(int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();

	}

} // int[] arr = new int[5]; //좌항은 stack에 저장   우항은 heap에 저장
