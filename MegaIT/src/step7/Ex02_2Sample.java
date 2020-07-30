/*package step7;
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
public class Ex02_2Sample {	
	public static void main(String[] args) {
		// ·Î¶Ç 1¼ÂÆ® (1)
		// 1°³´Â ´çÃ· 4°³´Â ²Î ÀÎ ·£´ýº¹±Ç
		Random ran = new Random();
		Lotto [] lotto = new Lotto[5];
		boolean check = false;	
		int n = 0;
		while(n < 5) {
			lotto[n] = new Lotto();
			for(int i = 0; i < 8; i++) {
				int r = ran.nextInt(2);
				if(r == 0) {
					lotto[n].data[i] = 0;
				}else {
					lotto[n].data[i] = 3;
				}			
			}
			int count = 0;
			for(int i = 0; i < 8; i++) {
				if(lotto[n].data[i] == 3) {
					count += 1;
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
				n += 1;		
			}
			else if(check == true && lotto[n].win == false) {
				lotto[n].print();
				n += 1;
			}			
		}	
	}
}

*/
