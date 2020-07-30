package hijava;
//스레드1 스레드2를 1초 대기후 반복출력시키기
public class Exam33_1 extends Thread{
	Exam33_1(String str){
		super(str);//문자열을 받아들여서 super 키워드에 전달
		//부모클래스의 생성자를 호출 -> 뭔소린지 이해안됌
	}
	public void run() { //thread클래스 상속시 반드시 구현
		try {//sleep()메서드 사용시 반드시 필요
			while(true) {
				System.out.println(Thread.currentThread().getName());
				this.sleep(1000);
			} 
		} catch (Exception e) {
				System.out.println(e.toString());
		}
	}
	public static void main(String[] args) {
		Exam33_1 t1 = new Exam33_1("스레드1");
		Exam33_1 t2 = new Exam33_1("스레드2");
		t1.start();//스레드를 시작하는 메서드
		t2.start();
	}
}
