/*package step7;

class Subject{
	String name;
	int score;
}
class Student{
	Subject[] subjects;
	String name;
}

public class Ex01_7 {
	public static void main(String[] args) {
		Student[] st = new Student[3];
		// ��ü ���� X ���� �迭 ũ�� ���� (3������ ����)
		st[0] = new Student();
		// 0���л��� �л� ��ü �ο�(��ü ����)
		// 14 16 �� �ڵ��  �� �� new�� ��������� new �� ������ �ٸ��Ƿ� ��뿡 ���� !!!
		st[0].subjects = new Subject[3];
		// 0���л� ������� 3�������� (�迭 ũ�� ����)
		for(int i = 0; i<3; i++) {
			st[0].subjects[i] = new Subject();
		} // 0���л� 3���� ��� ���� ��ü �ο�
		
		st[1] = new Student();
		st[1].subjects = new Subject[2];
		st[1].subjects[0] = new Subject();
		st[1].subjects[1] = new Subject();
		
		st[2] = new Student();
		st[2].subjects = new Subject[1];
		st[2].subjects[0] = new Subject();
	}
}
*/