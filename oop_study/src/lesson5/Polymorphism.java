package lesson5;

class Unit{
	int hp;
	int power;
}
class Wolf extends Unit{
	int leg; int bite;
}

class Bat extends Unit{
	int fly; int poison;
}

public class Polymorphism {

	public static void main(String[] args) {

		Unit[] unitList = new Unit[10];
		Wolf wolf = new Wolf();
		unitList[0] = wolf;
		Bat bat = new Bat();
		unitList[1] = bat;
		
		// Wolf클래스 객체 wolf 와 Bat 클래스 객체 bat 을 Unit클래스 배열 unitList 의 0번지와 1번지에 넣어줬음
	}

}
