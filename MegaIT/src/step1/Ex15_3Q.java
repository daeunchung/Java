package step1;
// # 반복문 기본문제 [2단계]
public class Ex15_3Q {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		// 문제1) 1~5까지의 합 출력
		// 정답 1) 15
		while(i <= 5) {
			sum += i;
			System.out.print(sum + " ");
			i++;
		}
		System.out.println();
		
		
		// 문제2) 1~10까지 반복해 3미만 7이상만 출력
		// 정답2) 1, 2, 7, 8, 9, 10

		i = 1;
		while(i < 11) {
			if(i < 3 || i >= 7) {
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();
		
		
		// 문제3) 문제2의 조건에 맞는 수들의 합 출력
		// 정답3) 37

		sum = 0;
		i = 1;
		while(i < 11) {
			if(i < 3 || i >= 7) {
				sum += i;
			}
			i++;
		}
		System.out.println("sum = " + sum);
		
		
		// 문제4) 문제2의 조건에 맞는 수들의 개수 출력
		// 정답4) 6
		int count = 0;
		i = 1;
		while(i < 11) {
			if(i < 3 || i >= 7) {
				count += 1;
			}
			i++;
		}
		System.out.println("count = " + count);
	}

}
