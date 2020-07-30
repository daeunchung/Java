package step6Method;

class Monster {
	/*
	 * 1. static 변수
	 * 		. 클래스명.변수명
	 * 2. non-static 변수
	 * 		. new
	 *		. 변수명.변수명
	 */
	static int count;
	
	void init() {
		System.out.println("몬스터 생성중.");
		count = count + 1;
	}
	
	void die() {
		System.out.println("몬스터 죽음.");
		count = count - 1;
		
		if(count == 0) {
			System.out.println("마지막 생존자였다.");
		}else if(count > 0) {
			System.out.println("현재 생존자는 " + count + "명 남았습니다.");
		}
	}
}

public class Main {
	public static void main(String[] args) {
		
		System.out.println(Monster.count);
		
		Monster m1 = new Monster();
		m1.init();
		Monster m2 = new Monster();
		m2.init();
		Monster m3 = new Monster();
		m3.init();	
		
		m1.die();
		
		System.out.println(Monster.count);
		
	}
}
