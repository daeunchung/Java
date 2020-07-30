class Car{
	int num = 5;
	int speed = 110;
	void velUp() {
		speed += 10;
	}
	void velDown() {
		speed -= 5;
	}
}
public class Exam9_1 {
	public static void main(String[] args) {
	Car tico = new Car();
	//System.out.println("tico.speed"); 이거는 문자열 tico.speed를 고대로 출력
	System.out.println(tico.speed);

	tico.velUp();
	tico.velUp();
	System.out.println(tico.speed);
	tico.velDown();
	System.out.println(tico.speed);

	}

}
//클래스는 객체를 생성하기 위한 틀과 같은 개념
//클래스는 속성과 행위를 포함하고 있음 