package step7;
class Member{
	String name;
	int num;
}
class MemberManager{
	Member[] memberList = new Member[3];
}
public class Ex01_6 {
	public static void main(String[] args) {
		MemberManager mg = new MemberManager();
		Member m1 = new Member();
		System.out.println(m1);
		mg.memberList[0] = m1;
		System.out.println(mg.memberList[0]);
		m1.name = "��ö��";
		m1.num = 1001;
		System.out.println(mg.memberList[0].name);
		System.out.println(mg.memberList[0].num);
		System.out.println("------------------------------");
		mg.memberList[0].name = "���̵𰡰�";
		mg.memberList[0].num = 3;
		System.out.println(mg.memberList[0].name);
		System.out.println(mg.memberList[0].num);		
		System.out.println(m1.name);
		System.out.println(m1.num);
		System.out.println("------------------------------");
		m1 = new Member();
		System.out.println(m1);
		// ���� �������� new Member(); �ϸ� ���ο� �ּҰ��� �ް����
		mg.memberList[1] = m1;
		m1.name = "�̸���";
		m1.num = 1002;
		
		m1 = new Member();
		mg.memberList[2] = m1;
		m1.name = "�ڿ���";
		m1.num = 1003;
		
		Member temp = mg.memberList[1];
		System.out.println(temp.name);
		
	}
}
