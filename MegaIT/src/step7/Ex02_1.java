package step7;

import java.util.Random;

class RanNum{
	int num;
	
}
public class Ex02_1 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		// ����) RanNum Ŭ������ Ȱ���ؼ� �ߺ����ڱ��� ��� 
		//      num�� 1~5���̼��ڸ� �������� �����Ѵ�. (���� �ߺ����ڱ���)
		RanNum[] arr = new RanNum[5];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = new RanNum();
		}
		
		
		for(int i = 0; i<arr.length; i++) {
			int rNum = ran.nextInt(5) + 1;
			int check = 1;
			
			for(int j = 0; j<i; j++) {
				if(arr[j].num == rNum) {
					check = -1;
				}
			}
			
			if(check == -1) {
				i--;
			}else {
				arr[i].num = rNum;
			}
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i].num + " ");
		}
	}
}
