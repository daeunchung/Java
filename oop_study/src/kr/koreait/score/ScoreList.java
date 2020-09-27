package kr.koreait.score;

import java.util.ArrayList;
import java.util.Comparator;

public class ScoreList {
	
	private ArrayList<ScoreVO> scoreList = new ArrayList<ScoreVO>();

	public ArrayList<ScoreVO> getScoreList() {
		return scoreList;
	}

	public void setScoreList(ArrayList<ScoreVO> scoreList) {
		this.scoreList = scoreList;
	}
	
	@Override
	public String toString() {
		String str = "";
		str += "==================================================================\n";
		str += "��ȣ �̸� java jsp spring ���� ��� ���� \n"	;
		str += "==================================================================\n";
		
//		������ ����Ѵ�.
//		for(int i = 0; i<scoreList.size()-1; i++) {
//			for(int j = i+1; j<scoreList.size(); j++) {
//				if(scoreList.get(i).getTotal() > scoreList.get(j).getTotal()) {
//					scoreList.get(j).setRank(scoreList.get(j).getRank() + 1);
//				}
//				if(scoreList.get(i).getTotal() < scoreList.get(j).getTotal()) {
//					scoreList.get(i).setRank(scoreList.get(i).getRank() + 1);
//				}
//			}
//		}
		
//		ArrayList.sort ���1. model class type�� ������ �񱳸� ���� Comparator ����
//		�������� ����
//       scoreList.sort(new Comparator<ScoreVO>() {
//          @Override
//          public int compare(ScoreVO stu1, ScoreVO stu2) {
//                 // TODO Auto-generated method stub
//                 int s1 = stu1.getTotal();
//                 int s2 = stu2.getTotal();
//                 if (s1 == s2) return 0;
//                 else if (s1 < s2) return 1;
//                 else return -1;
//          }
//       });
		
		for(ScoreVO vo : scoreList) {
			str += vo + "\n";
		}
		str += "==================================================================\n";
		return str;	
	}
	
//	ArrayList �� �μ��� �Ѱܹ��� ������ �߰��ϴ� �޼ҵ�
	public void addScore(ScoreVO vo) {
		scoreList.add(vo);
		
	}
}
