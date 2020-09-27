package kr.koreait.score;

import java.util.Comparator;

public class ScoreTest {

	public static void main(String[] args) {

		ScoreList scoreList = new ScoreList();
		
		scoreList.addScore(new ScoreVO("홍길동", 100, 100, 99));
		scoreList.addScore(new ScoreVO("임꺽정", 88, 76, 91));
		scoreList.addScore(new ScoreVO("장길산", 65, 74, 69));
		scoreList.addScore(new ScoreVO("일지매", 85, 78, 91));
		scoreList.addScore(new ScoreVO("이몽룡", 89, 58, 73));
		
		System.out.println("정렬 전");
		System.out.println(scoreList);
		
//		ArrayList.sort 방법2. model class의 Comparable 구현(Implements)
		scoreList.getScoreList().sort(Comparator.naturalOrder());
		System.out.println("정렬 후");
		System.out.println(scoreList);
	}

}
