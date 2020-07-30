package step4;
// # 주민등록번호 검사
public class Ex01_1 {

	public static void main(String[] args) {
		String jumin = "890101-2012932";
		// 문제 1) 나이 출력
		// 정답 1) 30세
		String year = jumin.substring(0, 2);
		System.out.println("출생년도 : 19" + year);
		
		int cen = 1900;
		int birth = Integer.parseInt(year);
		int yearOfBirth = (cen + birth);
		System.out.println("나이 : " + (2020 - yearOfBirth + 1));
				
		// 문제 2) 성별 출력
		// 정답 2) 여성
		String[] arr = jumin.split("-");
		String genderTag = arr[1].substring(0, 1);
		int gender = Integer.parseInt(genderTag);

		if(gender == 2) {
			System.out.println("성별 : 여성");
		}else {
			System.out.println("성별 : 남성");
		}
	}

}
