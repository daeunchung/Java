package step4;

public class Ex22_2 {
	public static void main(String[] args) {
		String data = "10001/��ö��/600\n";
		data += "10002/�̿���/800\n";
		data += "10001/��ö��/1400\n";
		data += "10003/���缮/780\n";
		data += "10002/�̿���/950\n";
		data += "10004/�ڸ��/330\n";
		data += "10001/��ö��/670\n";
		data += "10003/���缮/3300\n";
		data += "10002/�̿���/200\n";
		data += "10004/�ڸ��/6800\n";
		data = data.substring(0 , data.length()-1); // ������ �ۻ��� 
		System.out.println(data);
		System.out.println("=====================");
		String [] tokens = data.split("\n");
		int totalSize = tokens.length;
		
		int numList [] = new int[totalSize];
		String nameList [] = new String[totalSize];
		int priceList[] = new int[totalSize];
		
		for(int i = 0; i < totalSize; i++) {
			String values[] = tokens[i].split("/");
			numList[i] = Integer.parseInt(values[0]);
			nameList[i] = values[1];
			priceList[i] = Integer.parseInt(values[2]);
		}
		
		for(int i = 0; i < totalSize; i++) {
			System.out.println(numList[i] + " " + nameList[i] + " " + priceList[i]);
		}
		System.out.println("=====================");
		
		int showNum[] = new int[totalSize];
		String showName[] = new String[totalSize];
		
		// �˿��� ������ int h �̰� while(w < h) �϶� for�� �˿�
		// numList[h]�� �տ� ��� �߿� �̹� ���Դ� num�̸� check = 1; �� �ٲ� h++��Ű��
		// numList[h]�� �տ� ���� �� ���� ���ο� num�̸� check = 0; �����Ͽ� ���� �� �־��ְ� count++;
		
		int showCount = 0;
		for(int h = 0; h < totalSize; h++) {
			int check = 0;
			for(int w = 0; w < h; w++) {
				if(showNum[w] == numList[h]) {
					check = 1;
				}
			}
			if(check == 0) {
				showNum[showCount] = numList[h];
				showName[showCount] = nameList[h];				
				showCount += 1;
			}
		}
		for(int i = 0; i<showCount; i++) {
			System.out.println(showNum[i] + " " + showName[i]);
		}
		System.out.println("=====================");
		int showTotalprice[] = new int[totalSize];

		for(int h = 0; h < totalSize; h++) {
			for(int w = 0; w<showCount; w++) {
				if(showNum[w] == numList[h]) {
					showTotalprice[w] = priceList[h];
				}
			}
		}
		for(int i = 0; i<showCount; i++) {
			System.out.println(showNum[i] + " " + showName[i] + " " + showTotalprice[i]);
		}

		

		// ����1) �� ������ ��  ������ ȸ���� ������ �������������� ����� �����̴�.
		//		 �����͸� �Ʒ��� ���� ��� �Ͻÿ� (�� ȸ���� ���� ���� )	
		/*
		  =====================
			10001 ��ö�� 2670
			10002 �̿��� 1950
			10003 ���缮 4080
			10004 �ڸ�� 7130
		   =====================		  
		 */
			
	}
}

