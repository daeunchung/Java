//인터페이스의 다중 상속 활용
interface Volume{
	void printVolume();
}
interface Tuner{
	void printTuner();
}
interface Controller extends Volume, Tuner{
	//인터페이스가 다른 인터페이스를 상속받았기 때문에 printVolume이나 printTuner가 
	//모두 interface Controller에 정의가 되어있다고 볼수있다
	void printController();
}
class Audio implements Controller{
	public void printVolume() {
		System.out.println("볼륨 조절기");
	}
	public void printTuner() {
		System.out.println("채널 선택기");
	}
	public void printController() {
		System.out.println("볼륨, 채널 통합 조정");
	}
}
class Test15_1{
	public static void main(String[] args) {
	Audio a = new Audio();
	a.printVolume();
	a.printTuner();
	a.printController();
	}
}
//자바클래스는 다중상속 불가능 -> 인터페이스 이용하여 가능
//class A extends B implements C,D,E { } 가능