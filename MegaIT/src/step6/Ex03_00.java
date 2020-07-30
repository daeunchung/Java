package step6;

class Ex33{
	void test1(int x) { x = 100; }
	
	int test2() { 
        int x = 100;
        return x;
    }
	
	void test3(int[] arr) {
		arr[1] = 77;
	}
	
	int test4(int[] arr) {
		arr[1] = 88;
		return arr[1];
	}
	
	int test5(int[] arr) {
		arr[1] = 99;
		return arr[1];
	}
}

public class Ex03_00 {
	public static void main(String[] args) {

		Ex33 e = new Ex33();
		
		int x = 7;
		// x의 값을 100으로 변경시켜주는 메서드 
		System.out.println("x = " + x);
		e.test1(x);
		System.out.println("x = " + x);
		
		System.out.println();
		
		x = e.test2();
		System.out.println("x = " + x);
		
		//---------------------------------------
		
		int[] arr = {10, 20, 30, 40, 50};
		e.test3(arr);
		
		System.out.println(arr[1]);
		
		arr[1] = e.test4(arr);
		System.out.println(arr[1]);
		
		System.out.println(e.test5(arr));
	}
}
