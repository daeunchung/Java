// �޸� ������ �׷������� ������ �ʹ� �����ؼ� �׸� �� ������
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
	/* run() �޼��� 
	 * horse[] 4�� ��� ��ü �ο��ϰ� �̸� �־��ֱ�
	 * Play() �޼��� ȣ�� PrintHorse() �޼��� ȣ��*/
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
		// ���ǿ� �� �̵� ��Ȳ(4���� �� ��¼� �����ְ���) �ѹ� �����ְ�
	}
	
	// �̵� �߿� ���� �� ��ġ ��� �޼���
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
		int count = 0; // ������ �� ������ ���� ����
		while(loop) {
			PrintHorse(); // �� ���� �̵���Ȳ �ѹ� �����ְ�
			for(int i = 0; i<size; i++) {
				if(horses[i].win == true) continue;
				// �̹� �����ؼ� ����� ����� for�� ���������ÿ�
				int r = ran.nextInt(4) + 1; // 1ĭ~4ĭ ���� �̵�����
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
				Thread.sleep(1000); // 1000ms (1��) ���� ����
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

