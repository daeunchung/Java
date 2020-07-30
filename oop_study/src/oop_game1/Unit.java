package oop_game1;

public abstract class Unit {

	int curhp;		// ���� hp
	int maxhp;
	int power;
	String name;
	String state = "�븻";
	
	Unit(){}	// �⺻ ������
	
	// �ѹ��� �����ϴ� ������
	// ������ ���� �Ʒ��� init �޼��� ȣ��ε� ���డ��
	Unit(String na, int max, int pw){
		// Ű���� this : �Ű�����(parameter)�� ���޹��� �Ͱ� Ŭ���� ������ �̸��� ������ ���� �Ұ���. ���� ���� ����
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
	
	// �Է� ���� Unit Ŭ������ target �� �ִ� ���빰 �ǵ�� �޼���
	void attack(Unit target) {
		target.curhp -= power;
		System.out.println("[" + name + "] �� " + target.name + "] ���� " + power + "�� �������� �����ϴ�. ");
		if(target.curhp <= 0) {
			System.out.println("[" + target.name + "] �� óġ�߽��ϴ�.");
			target.curhp = 0;
		}
		
	}
	
	void printData() {
		System.out.println("[" + name + "] [" + curhp + "/" + maxhp + "] [" + power + "]");
	}
	
}