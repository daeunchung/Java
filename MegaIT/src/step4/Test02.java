package step4;

public class Test02 {
	public static void main(String[] args) {
		String [][] student = {{"aaa","����","1001"}, {"bbb","����","1002" },
				{"ccc" ,"��ġ", "1003"} , {"ddd" , "����","1004"}};
		String[][] score = { // 1+12 = 13
				{"��ȣ" ,"����" , "����"},
				{"1001" ,"����","20"}, // 1
				{"1002" ,"����","50"},
				{"1003" ,"����","60"},
				{"1004" ,"����","17"},
				{"1001" ,"����","65"},
				{"1002" ,"����","15"},
				{"1003" ,"����","80"},
				{"1004" ,"����","70"},
				{"1001" ,"����","43"},
				{"1002" ,"����","90"},
				{"1003" ,"����","30"},
				{"1004" ,"����","70"} // 12
		};
		
		//�л� ������ ������ ��� ������ �̴� 
		//student ==> 1.id 2.�ּ� 3.��ȣ
		//score ==> 1.��ȣ 2.���� 3.���� 4.���� ���� �̴� 
		//����1) ��ü ������ 1���� �л� �̸� ��� 
		int chart[][] = new int [student.length][2]; // �л���ȣ�� ������ ��� 2���� �迭
		
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
		
		System.out.println("1�� �л� : " + student[idx][0]);
		System.out.println("1�� �л� ���� : " + chart[idx][1]);

	}
}
