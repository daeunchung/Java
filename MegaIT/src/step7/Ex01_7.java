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
		// 객체 생성 X 오직 배열 크기 지정 (3명으로 지정)
		st[0] = new Student();
		// 0번학생에 학생 객체 부여(객체 생성)
		// 14 16 줄 코드는  둘 다 new를 사용하지만 new 의 역할이 다르므로 사용에 유의 !!!
		st[0].subjects = new Subject[3];
		// 0번학생 과목수를 3과목으로 (배열 크기 지정)
		for(int i = 0; i<3; i++) {
			st[0].subjects[i] = new Subject();
		} // 0번학생 3과목에 모두 과목 객체 부여
		
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