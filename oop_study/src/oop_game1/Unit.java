package oop_game1;

public abstract class Unit {

	int curhp;		// 현재 hp
	int maxhp;
	int power;
	String name;
	String state = "노말";
	
	Unit(){}	// 기본 생성자
	
	// 한번만 수행하는 생성자
	// 생성자 말고 아래의 init 메서드 호출로도 수행가능
	Unit(String na, int max, int pw){
		// 키워드 this : 매개변수(parameter)로 전달받은 것과 클래스 변수의 이름이 같으면 생략 불가능. 본래 생략 가능
		name = na;	
		maxhp = max;
		curhp = max;
		power = pw;
	}
	
	void init(int max, int pw) {
		maxhp = max;
		curhp = max;
		power = pw;
	}
	void init(String na, int max, int pw) {
		name = na;
		maxhp = max;
		curhp = max;
		power = pw;
	}
	
	// 입력 받은 Unit 클래스의 target 에 있는 내용물 건드는 메서드
	void attack(Unit target) {
		target.curhp -= power;
		System.out.println("[" + name + "] 이 " + target.name + "] 에게 " + power + "의 데미지를 입힙니다. ");
		if(target.curhp <= 0) {
			System.out.println("[" + target.name + "] 을 처치했습니다.");
			target.curhp = 0;
		}
		
	}
	
	void printData() {
		System.out.println("[" + name + "] [" + curhp + "/" + maxhp + "] [" + power + "]");
	}
	
}