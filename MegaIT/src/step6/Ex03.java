package step6;

class Ex333{
	
	int test1(int[] arr) { 
		int cnt = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] % 4 == 0) {
				cnt++;
			}
		}
		return cnt; 
	}
	
	int[] test2(int[] arr) { 
		int cnt = test1(arr);
		int[] temp = new int[cnt];
		
		int j = 0;
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] % 4 == 0) {
				temp[j] = arr[i];
				j++;
			}
		}
		return temp; 
	}
	
	void print(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}System.out.println();
	}
}

public class Ex03 {
	public static void main(String[] args) {

		Ex333 e = new Ex333();
		
		int[] arr = {87, 12, 21, 56, 100};
		e.print(arr);
		
		// 문제 1) 4의 배수의 개수를 리턴해주는 메서드
		int cnt = e.test1(arr);
		System.out.println("cnt = " + cnt);
	//	System.out.println("cnt = " + e.test1(arr));
		
		// 문제 2) 4의 배수만 배열 타입으로 리턴해주는 메서드
		int[] temp = e.test2(arr);
		e.print(temp);
		
	}
}
