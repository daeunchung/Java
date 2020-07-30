package step1;
/*
 * # 369게임[2단계]
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 */
public class Ex18_2Q {

	public static void main(String[] args) {
		int i = 1;

		while(i <= 50) {
			
			int cnt = 0;
			int ten = i/10;
			int one = i%10;
			//십의 자리, 일의 자리 변수를 while문 안에서 지정해 주어야 하는구나..
			//main내에 while문 밖에 변수 선언했더니 적용 X
			
			if(( ten != 0 ) && ( ten%3 == 0 )) {
				cnt ++;
			}
			if(( one != 0 ) && ( one%3 == 0 )) {
				cnt ++;
			}
			// if 안에 조건문 찾기 무지 힘들었음 
			// 다시 한번 볼것
	
			if(cnt == 2) {
				System.out.print("짝짝 ");
			}
			else if(cnt == 1) {
				System.out.print("짝 ");
			}
			else if(cnt == 0) {
				System.out.print(i + " ");
			}
			
			i++; // 증감식이 while문 내에 있는것도 주의하세요 다은
		}
		
	}
		
}

