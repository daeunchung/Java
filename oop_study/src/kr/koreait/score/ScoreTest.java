package kr.koreait.score;

public class ScoreTest {

	public static void main(String[] args) {

		ScoreList scoreList = new ScoreList();
		
		scoreList.addScore(new ScoreVO("ȫ�浿", 100, 100, 99));
		scoreList.addScore(new ScoreVO("�Ӳ���", 88, 75, 91));
		scoreList.addScore(new ScoreVO("����", 65, 74, 69));
		scoreList.addScore(new ScoreVO("������", 85, 78, 91));
		scoreList.addScore(new ScoreVO("�̸���", 89, 58, 73));
		
		System.out.println(scoreList);
	}

}
