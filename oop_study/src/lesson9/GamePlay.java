package lesson9;

/*
 * class 가 Thread 를 extends 하고 그 class 는 문법적으로 run 메서드를 오버라이딩 해서 사용한다.
 * 윈도우에 창을 두개 띄우는걸 생각해보면됌.
 * 음악도 재생하고있으면서 게임도 하려고 두개를 동시에 하는과정을 실행하고싶을때 Thread 사용
 * 나중에 고급내용으로는 아주 여러개 Thread 띄워놓고 우선순위를 정해서 뭐를 먼저 그 다음에 뭐종료 이런식으로 할 수 있음.
 */
class BGMPlay extends Thread{
	
	boolean play = true;
	@Override
	public void run() {
		
		while(play) {
			System.out.println("배경 음악이 연주되는중.....");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class GamePlay {

	public static void main(String[] args) {
		BGMPlay bgmPlay = new BGMPlay();
		
		bgmPlay.start();
		
		for(int i = 0; i<=10;i++) {
			System.out.println("신나게 게임을 하는 중.....");
			if(i == 8) {
				System.out.println("앗... 엄마다 !!!");
				System.out.println("엄마가 오셔서 게임을 종료합니다. ㅜㅜㅜ");
				
				bgmPlay.play = false;
				break;
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
