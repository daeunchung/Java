package step6Method;

class Ex22{
	
	int changeNum(int num) {
		num = 100;
		return num;
	}
	
	int total;
	
	void sum(int x, int y) {
		// total = x + y;
		int total = x + y;
	}
}

public class Ex_1 {
	public static void main(String[] args) {
		
		int num = 10;
		
		Ex22 e = new Ex22();
		System.out.println("메서드 호출 전 = " + num);
		num = e.changeNum(num);
		System.out.println("메서드 호출 후 = " + num);
	}
}
