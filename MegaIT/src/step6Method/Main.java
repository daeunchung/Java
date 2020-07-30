package step6Method;

class Monster {
	/*
	 * 1. static ����
	 * 		. Ŭ������.������
	 * 2. non-static ����
	 * 		. new
	 *		. ������.������
	 */
	static int count;
	
	void init() {
		System.out.println("���� ������.");
		count = count + 1;
	}
	
	void die() {
		System.out.println("���� ����.");
		count = count - 1;
		
		if(count == 0) {
			System.out.println("������ �����ڿ���.");
		}else if(count > 0) {
			System.out.println("���� �����ڴ� " + count + "�� ���ҽ��ϴ�.");
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