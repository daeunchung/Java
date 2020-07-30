package step2;

public class Ex01_2 {

	public static void main(String[] args) {
		
		// 1. 배열 사용법(1)
		int[] arr = new int[3]; // java는 이렇게 하면 3칸 다 기본 0으로 채워짐
		
		// 좌변은 arr가 stack에 저장된다. 우변은 new int[3]가 heap에 저장된다.
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		for(int i = 0; i < 3; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		// 2.배열 사용법(2) : 축약형
		
		int[] temp = {10, 20, 30};
		
		for(int i = 0; i < 3; i++) {
			System.out.println(temp[i]);
		}
		
	}

}
