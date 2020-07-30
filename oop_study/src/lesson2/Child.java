package lesson2;

// 부모(상위, 슈퍼, 기반) 클래스
class Parent{
//	private String name;
//	private boolean gender;
	protected String name;
	protected boolean gender;
	
	public Parent() {
//	현재 클래스의 다른 생성자 Parent(String name, boolean gender) 를 실행한다.
		this("무명씨", true);			// 이해 안되는 부분 어떻게 this 로 쓸수있나?
		System.out.println("부모 클래스의 기본 생성자 실행");
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
		return name + "(" + (gender ? "남" : "여") + ")";
	}	

}

// 자식(하위, 서브, 파생) 클래스
// 상속의 형식 : class 자식클래스이름 extends 부모클래스이름, 자바는 다중 상속을 지원하지 않는다.
// Child 클래스는 Parent 클래스를 상속받아 만든다.

public class Child extends Parent {

	private int age;
	private String nickName;
	
	/*
	 * super란?
	자식 클래스에서 상속받은 부모 클래스의 멤버변수를 참조할때 사용합니다.
	 * super()란?
	자식 클래스가 자신을 생성할 때 부모 클래스의 생성자를 불러 초기화 할때 사용됩니다. (기본적으로 자식 클래스의 생성자에 추가됩니다.)
	 * super() 사용예제
	ChildClass객체 생성시(ChildClass child = new ChildClass) 호출 순서 
	- ChildClass() 생성자 호출
	- this()에 의하여, ChildClass(String, String) 생성자 호출
	- super()에 의하여, ParentClass(String, String) 생성자 호출
	- ChildClass 객체 생성 완료!
	 */
	
	public Child() {
		super();
		System.out.println("자식 클래스의 기본 생성자 실행");
	}
	
//	부모 클래스로 부터 상속받은 멤버 변수의 접근 권한이  protected 일 경우 부모 클래스의 상속받은 멤버변수에
//	자유롭게 접근 할 수 있으므로 this 를 사용하는 초기화가 가능하다.

	public Child(String name, boolean gender, int age, String nickName) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.nickName = nickName;
	}
	
	@Override
	public String toString() {
		return name + "(" + (gender ? "남" : "여") + ") - " + age + ", " + nickName;
	}
	
	public static void main(String[] args) {
		
		Parent parent = new Parent();
		System.out.println(parent);
		Parent parent2 = new Parent("성춘향", false);
		System.out.println(parent2);
		System.out.println("=========================================");
		
//		자식 클래스의 생성자가 실행되기 전에 부모 클래스의 생성자가 먼저 실행된다.
		Child child = new Child();
		System.out.println(child);
		Child child2 = new Child("임꺽정", true, 42, "도적");
		System.out.println(child2);
		
	}
}