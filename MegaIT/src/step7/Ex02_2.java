package step7;
/* �ζ� ������ ���� 8��
 * 3�� 3�� ��µǸ� 1ȸ ��÷�Ȱ�
 * 
 *  - �ζ� 1��Ʈ ä���ֱ�
 * �ϴ� 5���� ��� Lotto ��ü �ο��ϰ�
 * 8�� ���ڸ� ���� �ζ� 5�ٿ� ��� random ���� �־���
 * 0 �Ǵ� 1 �޾Ƽ� 0�� 0���� 1�� 3���� ����
 * 
 * ���� �� ä���ְ� ���� - üŷ(Ȯ���۾�)
 * int count �����ؼ�
 * 3�� ���� 3�� ������ win = true;
 *  
 * check�� false, win�� true �̸� ���� �ѹ��� ��÷X, �̹��� ó����÷O
 * check�� true, win�� false �̸� ������ ��÷ ����O, �̹����� ��÷X
 * 
 * check true win true -> ��÷Ƚ�� 1���� �̾���ؼ� �Ұ���
 * check false win false -> �ѹ��� ������ ��÷ �Ǿ���ؼ� �Ұ���
 */
import java.util.Random;

class Lotto{
	int [] data = new int[8];
	boolean win = false;
	void print() {
		for(int i = 0; i < 8; i++) {
			System.out.print(data[i]);
		}
		System.out.println();
	}
}
public class Ex02_2 {	
	public static void main(String[] args) {
		
		// ����) �ζ� 1��Ʈ
		//      1���� ��÷ 4���� ���� �������� ����
		Random ran = new Random();	
		Lotto[] lotto = new Lotto[5];
		boolean check = false;
		
		for(int n = 0; n<lotto.length; n++) {
			lotto[n] = new Lotto();
				
			for(int i = 0; i<8; i++) {
				int r = ran.nextInt(2);
				
				if(r == 0) {
					lotto[n].data[i] = 0;
				}else if(r == 1) {
					lotto[n].data[i] = 3;
				}
			}	
			int count = 0;
			for(int i = 0; i<8; i++) {
				if(lotto[n].data[i] == 3) {
					count++;
					if(count == 3) {
						lotto[n].win = true;
						break;
					}
				}else {
					count = 0;
				}
			}
			if(check == false && lotto[n].win == true) {
				check = true;
				lotto[n].print();
			}
			else if(check == true && lotto[n].win == false) {
				lotto[n].print();
			}	
		}		
	}
}
/*
 * �� �ڵ�ó�� �ϸ� �ܼ�â�� �ζǰ� (1��~5��) ���� ���� �ٸ��� ��µȴ�. 
 * Q. �� �� �ڵ�ó�� for(int n = 0; n<lotto.length; n++) {} for������ 5�� ������ �ȵɱ� ?
 * 
 * A. for���� 5�� ������� ����� �־��� ������ ���� �Ʒ��� print(); �޼��尡 5�� ����Ǵ� ����X
 * �ֳ��ϸ� (check==false && win==false)�� ���, (check==true && win==true)�� ��� ��
 * 5�� �ȿ� ������ ������ print(); ������ �ʱ� ������ �����ϰ� ��� Ƚ���� ���������Ѵ�(1��~5��)
 * 
 * �ݸ鿡 while(n<lotto.length) {} while������ ������
 * ���� �Ʒ��� print(); �� �ؾ߸� n++; �� �Ǳ� ������ Ȯ���� ����� 5�� �̷������.
 */
