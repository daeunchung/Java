package step6;

/*
 * # 메서드의 구조[3단계] : 리턴값이 있는 메서드
 * int getNum(매개변수[parameter]){
 * 		실행할 내용;
 * 		return 10;
 * } 
 *
 * # 메서드의 사용(호출)
 * int num = getNum(인자,인수[argument]);
 */

class Ex3{
	
	int num;
	void setNum(int num) {
		this.num = num;
	}
	
	int getNum() {
		return num;
	}
}

public class Ex03_0 {
	public static void main(String[] args) {

		Ex3 e = new Ex3();
		e.setNum(100);
		
		int result = e.getNum();
		System.out.println(result);
		
	}
}
