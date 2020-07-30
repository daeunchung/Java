// 메모리 구조를 그려보려고 했으나 너무 복잡해서 그릴 수 없었음
package step7;
import java.util.Random;
class Horse{
	String name = ""; int pos = 0; int rank =  0;
	boolean win = false;
}
class Racing{
	Random ran = new Random();
	int size = 4;
	Horse[] horses = new Horse[size];	
	int line = 20;
	int track [][] = new int[size][line];
	/* run() 메서드 
	 * horse[] 4개 모두 객체 부여하고 이름 넣어주기
	 * Play() 메서드 호출 PrintHorse() 메서드 호출*/
	void run() {
		for(int i = 0; i<size; i++) {
			horses[i] = new Horse();
		}
		horses[0].name = "a";
		horses[1].name = "b";
		horses[2].name = "c";
		horses[3].name = "d";
		Play();
		PrintHorse();
		// 막판에 말 이동 현황(4마리 다 결승선 지나있겠지) 한번 보여주고
	}
	
	// 이동 중에 말의 현 위치 출력 메서드
	void PrintHorse() {
		System.out.println();
		for(int i = 0; i<size; i++) {
			for(int n = 0; n<line; n++) {
				if(horses[i].pos == n) {
					System.out.print("[" + horses[i].name + "]");
				}else {
					System.out.print("[ ]");
				}
			}
			System.out.println();
		}
		
	}
	void Play() {
		boolean loop = true;
		int count = 0; // 도착한 말 마리수 세는 변수
		while(loop) {
			PrintHorse(); // 말 현재 이동상황 한번 보여주고
			for(int i = 0; i<size; i++) {
				if(horses[i].win == true) continue;
				// 이미 도착해서 우승한 놈들은 for문 빠져나가시오
				int r = ran.nextInt(4) + 1; // 1칸~4칸 까지 이동가능
				horses[i].pos += r;
				if(horses[i].pos >= 19) {
					horses[i].pos = 19;
					horses[i].rank = count + 1;
					horses[i].win = true;
					count += 1;
					if(count >= size) {
						loop = false;
						break;
					}
				}
			}
			try {
				Thread.sleep(1000); // 1000ms (1초) 동안 정지
			}catch (Exception e) {}
		}
	}
}

public class Ex02_4 {
	public static void main(String[] args) {
		Racing race = new Racing();
		race.run();

	}
}

