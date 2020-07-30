package step7;

import java.util.Scanner;

class User{
	String id;
	int money;
}
public class Ex01_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int max = 100;
		User [] user = new User[max];
		for(int i = 0; i<user.length; i++) {
			user[i] = new User();
		}
		System.out.println(user); // 배열주소 출력 [Lstep7.User;@7d4991ad
		// [는 배열주소라는 의미로 붙어있는 것
		System.out.println(user[0]);
		System.out.println(user[1]);
		
		user[0].id = "aaaa";
		user[0].money = 1000;
		
		user[1].id = "bbbb";
		user[1].money = 2000;
		
		int count = 2;
		
		for(int i = 0; i<count; i++) {
			System.out.println(user[i].id + " " + user[i].money);
		}
		
		User temp = user[1]; 
		// temp 라는 변수명을 가진 클래스 변수 에 user[1] 을 넣어준다
		// 주소복사.. 된다고 함
		temp.id = "ccccc";
		System.out.println("===================================");
		for(int i = 0; i<count; i++) {
			System.out.println(user[i].id + " " + user[i].money);
		} // temp.id 를 바꿨는데 user[1].id 가 ccccc로 변경되었다.
		
		System.out.println(temp);
		System.out.println(user[1]);
		// 같은 주소를 가지고있다
		
	}
}
