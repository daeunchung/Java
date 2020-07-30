package lesson9;

/*
 * class �� Thread �� extends �ϰ� �� class �� ���������� run �޼��带 �������̵� �ؼ� ����Ѵ�.
 * �����쿡 â�� �ΰ� ���°� �����غ����.
 * ���ǵ� ����ϰ������鼭 ���ӵ� �Ϸ��� �ΰ��� ���ÿ� �ϴ°����� �����ϰ������ Thread ���
 * ���߿� ��޳������δ� ���� ������ Thread ������� �켱������ ���ؼ� ���� ���� �� ������ ������ �̷������� �� �� ����.
 */
class BGMPlay extends Thread{
	
	boolean play = true;
	@Override
	public void run() {
		
		while(play) {
			System.out.println("��� ������ ���ֵǴ���.....");
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
			System.out.println("�ų��� ������ �ϴ� ��.....");
			if(i == 8) {
				System.out.println("��... ������ !!!");
				System.out.println("������ ���ż� ������ �����մϴ�. �̤̤�");
				
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
