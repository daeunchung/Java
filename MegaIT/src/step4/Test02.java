package step4;

public class Test02 {
	public static void main(String[] args) {
		String [][] student = {{"aaa","신촌","1001"}, {"bbb","강남","1002" },
				{"ccc" ,"대치", "1003"} , {"ddd" , "강동","1004"}};
		String[][] score = { // 1+12 = 13
				{"번호" ,"과목" , "점수"},
				{"1001" ,"국어","20"}, // 1
				{"1002" ,"국어","50"},
				{"1003" ,"국어","60"},
				{"1004" ,"국어","17"},
				{"1001" ,"수학","65"},
				{"1002" ,"수학","15"},
				{"1003" ,"수학","80"},
				{"1004" ,"수학","70"},
				{"1001" ,"영어","43"},
				{"1002" ,"영어","90"},
				{"1003" ,"영어","30"},
				{"1004" ,"영어","70"} // 12
		};
		
		//학생 정보와 성적이 담긴 데이터 이다 
		//student ==> 1.id 2.주소 3.번호
		//score ==> 1.번호 2.국어 3.수학 4.영어 점수 이다 
		//문제1) 전체 성적이 1등인 학생 이름 출력 
		int chart[][] = new int [student.length][2]; // 학생번호와 총점을 담는 2차원 배열
		
		for(int i = 1; i<student.length; i++) {
			chart[i-1][0] = Integer.parseInt(score[i][0]);
			for(int j = i; j<score.length; j++) {
				if(score[i][0].equals(score[j][0])) {
					chart[i-1][1] += Integer.parseInt(score[j][2]);
				}
			}
		}
		
		int max = 0; int idx = 0;
		for(int i = 0; i<chart.length; i++) {
			if(max < chart[i][1]) {
				max = chart[i][1];
				idx = i;
			}
		}
		
		System.out.println("1등 학생 : " + student[idx][0]);
		System.out.println("1등 학생 총점 : " + chart[idx][1]);

	}
}
