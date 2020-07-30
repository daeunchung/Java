/*package step7;

class Student{
	String name;
	int score;
	
	void print() {
		System.out.println(name + " : " + score);
	}
}

public class Ex02_문자열1 {
	public static void main(String[] args) {
		String data = "3\n"; 
		data +="김영희/30\n";
		data += "이만수/40\n";
		data += "이철민/60";
		// System.out.println(data);

		Student st[];
		//문제1)data에 있는 내용을 잘라서 st에 저장후 출력 
		String[] temp = data.split("\n");
		int size = Integer.parseInt(temp[0]);
		
		st = new Student[size]; // st[] 는 3칸(학생수만큼 칸수생성)
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
	
		//문제2)꼴등 삭제후 다시 data에 저장	
		// 배열에서 내용물 한개 삭제 할때는 항상 tmp 생성해서 옮겨놓고 작업해야지 다은아 !!!!!!!!!
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
