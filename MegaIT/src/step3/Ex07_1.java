package step3;

public class Ex07_1 {
	public static void main(String[] args) {

		int[] arr = {87, 100, 24, 11, 79};
		
		int[] temp = arr;
		// 대괄호가 붙은 변수들은 주소만 저장가능하다
		// int[] temp = arr; 하면 배열은 새로 안생기고 주소만 딱 복사되는 것
		// temp로 수정하던지 arr로 수정하던지(temp[1] = 0; arr[1] = 0;)상관없이 한 배열이 수정되어서 무조건 둘다 바뀜
		// 
		
		temp[1] = 0; // arr[1] = 0; 해도 같은 결과 
		
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		for(int i=0; i<5; i++) {
			System.out.print(temp[i] + " ");
		}
		System.out.println();
		
		System.out.println(arr);
		System.out.println(temp);
		// 둘다 이름만 출력해보면 [I@15db9742 로 둘다 같은 주소를 가지고 있음을 확인할 수 있다

	}
}
/*int[] arr = {87, 100, 24, 11, 79}; 

위문장은

int[ ] arr= new int[5];

arr[0] =87;

arr[1] =100;

arr[2] =24;

arr[3] =11;

arr[4] =79;

위다섯문장을 한줄로 축약해놓은거*/
