package step4;

import java.util.Random;
import java.util.Scanner;

public class Test03 {
		public static void main(String[] args) {
			
			//����) ����ܾ� ���߱�  
			// ����ܾ ���� * �� ǥ�õȴ�. 
			// ����ܾ �Է¹ް� Ʋ�������� �������� �ѱ��ھ� ��������. (������ 5���� ����)
			// (����) ���࿡ ���� ö�ڰ� �������� �ѹ��� ��������. 
			// ���� �������ų� ���߸� ���� 
			Scanner scan = new Scanner(System.in);
			Random ran = new Random();
			
			int score = 100;
			String word = "performance";
			String meaning = "����";
			int size = word.length();
			
			int check[] = new int[size];  // ��Ʈ üũ�� ���ؼ� Ȯ���Ҽ��ִ�.
			char [] letter = word.toCharArray();
			
//			for(int i = 0; i<letter.length; i++) {
//				System.out.print(letter[i]);
//			}System.out.println();
			
//			for(int i = 0; i<check.length; i++) {
//				System.out.print(check[i]);
//			}System.out.println();

			int cnt = 0;

			while(true) {
				System.out.println("�� : " + meaning);
				System.out.print("���� : ");
				for(int i =0; i< size; i++) {
					if(check[i] == 0) {
						System.out.print("*");
					}else if(check[i] == -1) {
						System.out.print(letter[i]);
					}
					
				}
				System.out.println();
				System.out.println("����ܾ �Է��ϼ��� >>> ");
				String me = scan.next();
				
				if(me.equals(word)) {
					System.out.println("�����Դϴ�.");
					System.out.printf("Ʋ�� Ƚ���� %d��, %d�� �����Դϴ�.", cnt, cnt*5);
					break;
					
				}else {
					
					while(true) {
						int r = ran.nextInt(size);
						if(check[r] == 0) {
							for(int i = 0; i<size; i++) {
								if(letter[i] == letter[r]) {
									check[i] = -1;
								}
							}
							break;
							
						}else if(check[r] == -1){
							continue;
						}
					}
					cnt += 1;
				}
				
				if(cnt == 9) {
					System.out.println("�ʹ� ���� Ʋ���̱���.");
					System.out.println("������ " + word + "�Դϴ�.");
					break;
				}
			}
		}
}
