package step1;
/*
 * # ��÷����[1�ܰ�] 33.33333333333%�� ��÷Ȯ��
 */
import java.util.Random;
public class Ex10_3Q {

	public static void main(String[] args) {
	Random ran = new Random();
		
		int rNum = ran.nextInt(10);
		if(rNum < 3) {
			System.out.println("��÷");
		}
		if(rNum >= 3) {
			System.out.println("��");
		}
	}
}
