package kr.koreait.score;

import java.util.Comparator;

public class ScoreTest {

	public static void main(String[] args) {

		ScoreList scoreList = new ScoreList();
		
		scoreList.addScore(new ScoreVO("ȫ�浿", 100, 100, 99));
		scoreList.addScore(new ScoreVO("�Ӳ���", 88, 76, 91));
		scoreList.addScore(new ScoreVO("����", 65, 74, 69));
		scoreList.addScore(new ScoreVO("������", 85, 78, 91));
		scoreList.addScore(new ScoreVO("�̸���", 89, 58, 73));
		
		System.out.println("���� ��");
		System.out.println(scoreList);
		
//		ArrayList.sort ���2. model class�� Comparable ����(Implements)
		scoreList.getScoreList().sort(Comparator.naturalOrder());
		System.out.println("���� ��");
		System.out.println(scoreList);
	}

}
