/*package step7;

class Student{
	String name;
	int score;
	
	void print() {
		System.out.println(name + " : " + score);
	}
}

public class Ex02_���ڿ�1 {
	public static void main(String[] args) {
		String data = "3\n"; 
		data +="�迵��/30\n";
		data += "�̸���/40\n";
		data += "��ö��/60";
		// System.out.println(data);

		Student st[];
		//����1)data�� �ִ� ������ �߶� st�� ������ ��� 
		String[] temp = data.split("\n");
		int size = Integer.parseInt(temp[0]);
		
		st = new Student[size]; // st[] �� 3ĭ(�л�����ŭ ĭ������)
		for(int i = 0; i<size; i++) {
			st[i] = new Student();
		}
		for(int i = 0; i<size; i++) {
			String[] info = temp[i+1].split("/");
			st[i].name = info[0];
			st[i].score = Integer.parseInt(info[1]);
			
			st[i].print();
		}
		System.out.println();
	
		//����2)�õ� ������ �ٽ� data�� ����	
		// �迭���� ���빰 �Ѱ� ���� �Ҷ��� �׻� tmp �����ؼ� �Űܳ��� �۾��ؾ��� ������ !!!!!!!!!
		int minScore = st[0].score;
		int minIdx = 0;
		
		for(int i = 0; i<size; i++) {
			if(minScore > st[i].score) {
				minScore = st[i].score;
				minIdx = i;
			}
		}
		Student[] tmpSt = st;
		st = new Student[size-1];

		int j = 0;
		for(int i = 0; i<size; i++) {
			if(i != minIdx) {
				st[j] = tmpSt[i];
				j++;
			}
		}
		size = size - 1;
		tmpSt = null;
		for(int i = 0; i<size; i++) {
			st[i].print();
		}
	}

}*/
