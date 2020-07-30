package lesson2;

// �θ�(����, ����, ���) Ŭ����
class Parent{
//	private String name;
//	private boolean gender;
	protected String name;
	protected boolean gender;
	
	public Parent() {
//	���� Ŭ������ �ٸ� ������ Parent(String name, boolean gender) �� �����Ѵ�.
		this("����", true);			// ���� �ȵǴ� �κ� ��� this �� �����ֳ�?
		System.out.println("�θ� Ŭ������ �⺻ ������ ����");
	}
	
	public Parent(String name, boolean gender) {
		this.name = name;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return name + "(" + (gender ? "��" : "��") + ")";
	}	

}

// �ڽ�(����, ����, �Ļ�) Ŭ����
// ����� ���� : class �ڽ�Ŭ�����̸� extends �θ�Ŭ�����̸�, �ڹٴ� ���� ����� �������� �ʴ´�.
// Child Ŭ������ Parent Ŭ������ ��ӹ޾� �����.

public class Child extends Parent {

	private int age;
	private String nickName;
	
	/*
	 * super��?
	�ڽ� Ŭ�������� ��ӹ��� �θ� Ŭ������ ��������� �����Ҷ� ����մϴ�.
	 * super()��?
	�ڽ� Ŭ������ �ڽ��� ������ �� �θ� Ŭ������ �����ڸ� �ҷ� �ʱ�ȭ �Ҷ� ���˴ϴ�. (�⺻������ �ڽ� Ŭ������ �����ڿ� �߰��˴ϴ�.)
	 * super() ��뿹��
	ChildClass��ü ������(ChildClass child = new ChildClass) ȣ�� ���� 
	- ChildClass() ������ ȣ��
	- this()�� ���Ͽ�, ChildClass(String, String) ������ ȣ��
	- super()�� ���Ͽ�, ParentClass(String, String) ������ ȣ��
	- ChildClass ��ü ���� �Ϸ�!
	 */
	
	public Child() {
		super();
		System.out.println("�ڽ� Ŭ������ �⺻ ������ ����");
	}
	
//	�θ� Ŭ������ ���� ��ӹ��� ��� ������ ���� ������  protected �� ��� �θ� Ŭ������ ��ӹ��� ���������
//	�����Ӱ� ���� �� �� �����Ƿ� this �� ����ϴ� �ʱ�ȭ�� �����ϴ�.

	public Child(String name, boolean gender, int age, String nickName) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.nickName = nickName;
	}
	
	@Override
	public String toString() {
		return name + "(" + (gender ? "��" : "��") + ") - " + age + ", " + nickName;
	}
	
	public static void main(String[] args) {
		
		Parent parent = new Parent();
		System.out.println(parent);
		Parent parent2 = new Parent("������", false);
		System.out.println(parent2);
		System.out.println("=========================================");
		
//		�ڽ� Ŭ������ �����ڰ� ����Ǳ� ���� �θ� Ŭ������ �����ڰ� ���� ����ȴ�.
		Child child = new Child();
		System.out.println(child);
		Child child2 = new Child("�Ӳ���", true, 42, "����");
		System.out.println(child2);
		
	}
}