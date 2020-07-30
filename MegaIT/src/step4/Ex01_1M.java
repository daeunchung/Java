package step4;

public class Ex01_1M {

	public static void main(String[] args) {
		String jumin = "890101-2012932";
		// 문제 1) 나이 출력
		// 정답 1) 30세
		String year = jumin.substring(0, 2);
		int yearnum = Integer.parseInt(year);
		int age = 2020 - (1900 + yearnum) + 1;
		System.out.println("나이 : " + age);
		
		// 문제 2) 성별 출력
		// 정답 2) 여성
		char key = jumin.charAt(7);
		if(key == '1' || key == '3') {
			System.out.println("남성");
		}else if(key == '2' || key == '4') {
			System.out.println("여성");
		}
			
	}

}
