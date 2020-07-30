package step1;

/*
 * # 변수의 특징
 * 1. 변수는 값을 한개만 저장할 수 있다.
 * 2. 때문에 새로운 값이 저장되면 이전의 값은 사라진다.
 * 3. 같은 이름의 변수를 사용할 수 없다.
 */

public class Ex03_4 {

	public static void main(String[] args) {

		int num = 10;
		num = 9;
		num = 3;
		System.out.println(num);
	}

}
