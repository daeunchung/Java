package step1;

public class Ex03_2Q {

	public static void main(String[] args) {
		//예) 현금이 1000원있다. 200원짜리 과자 구입 후, 잔돈 출력 
				int 현금 = 1000;
				int 과자 = 200;
				int 잔돈 = 현금 - 과자;
				System.out.println("잔돈 = " + 잔돈 + "원");
				
				//문제1) 월급이 100원이다. 연봉은? (조건 : 세금 10% 제외)
				int 월급 = 100;
				int 연봉 = 월급*12;
				double 세후월급 = 연봉*0.9;
				System.out.println("연봉 = " + 연봉 + "원");
				System.out.println("세후월급 = " + 세후월급 + "원");
				
				//문제2) 시험점수를 30, 50, 4점 을 받았다. 평균은?
				int s1 = 30;
				int s2 = 50;
				int s3 = 4;
				double avg = (s1 + s2 + s3)/3 ;
				System.out.println("평균 = " + avg + "점");
				
				//문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력
				int 가로 = 3;
				int 세로 = 6;
				double 넓이 = 가로 * 세로 / 2;
				System.out.println("삼각형의 넓이 = " + 넓이);
				
				//문제4) 100초를 1분 40초로 출력
				int time = 100;
				int min = time/60 ;
				int sec = time%60 ;
				System.out.println(min + "분" +  sec + "초");
				
				//문제5) 800원에서 500원짜리 개수 , 100원짜리 개수
				//정답5) 500원(1개), 100원(3개) 
				int money = 800;
				int fivers = money / 500;
				int ones = (money % 500) / 100;
				System.out.println("500원의 개수 = " + fivers + "개");
				System.out.println("100원의 개수 = " + ones + "개");

	}

}
