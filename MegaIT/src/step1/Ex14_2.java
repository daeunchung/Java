package step1;

public class Ex14_2 {
	public static void main(String[] args) {
		
		System.out.printf("%d", 10);
		System.out.println();// println()공백으로 하면 줄넘김이라는 뜻
		
		System.out.printf("%f\n", 3.14); // 3.140000
		System.out.printf("%.2f\n", 3.14); // 3.14 
		//소수점 두번째 자리 까지만 나타내라
		
		System.out.printf("%c\n", 'b');
		System.out.printf("%s\n", "출력문의 이해");
		
		String fruit = "사과";
		int cnt = 5;
		System.out.printf("%s가 %d개 있습니다\n", fruit, cnt);
		
		/*
		 * printf라는 이름의 맨 끝 f는 formatted(서식화된)를 의미한다
		 * '서식화된 출력'이란 출력의 양식 스스로 결정지어서 출력한다는 뜻이다
		 * 
		 * 앞의 숫자는 출력될 내용이 차지하는 공간의 최소 넓이를 의미합니다. 
		 * print("%-10f는 1.5 나누기 3의 결과이다" % (1.5 / 3))를 
		 * 편집기에 입력하여 실행해보시면 의미를 이해하실 수 있을 겁니다
		 * 참고로 차치하는 공간에서 기본 정렬이 오른쪽 정렬인데, 
		 * - 를 붙이면 왼쪽 정렬이 됩니다
		 */
		
	}

}
