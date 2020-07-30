package step1;

/*
 * 2. 대입 연산자 : =
 * 변수는 오직 대입 연산자를 통해서만이 
 * 값의 변경이 가능하다
 */

public class Ex02_4 {

	public static void main(String[] args) {

		int num = 8;
		System.out.println(num + 1); //9
		System.out.println(num); //8
		num = num +1;
		System.out.println(num); //9
	}

}
