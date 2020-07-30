package step4;

public class Ex22_2 {
	public static void main(String[] args) {
		String data = "10001/김철수/600\n";
		data += "10002/이영희/800\n";
		data += "10001/김철수/1400\n";
		data += "10003/유재석/780\n";
		data += "10002/이영희/950\n";
		data += "10004/박명수/330\n";
		data += "10001/김철수/670\n";
		data += "10003/유재석/3300\n";
		data += "10002/이영희/200\n";
		data += "10004/박명수/6800\n";
		data = data.substring(0 , data.length()-1); // 마지막 글삭제 
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
		
		// 검열의 기준은 int h 이고 while(w < h) 일때 for문 검열
		// numList[h]이 앞에 놈들 중에 이미 나왔던 num이면 check = 1; 로 바꿔 h++시키기
		// numList[h]이 앞에 나온 적 없는 새로운 num이면 check = 0; 유지하여 새로 값 넣어주고 count++;
		
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

		

		// 문제1) 위 데이터 는  각각의 회원이 물건을 구입했을때마다 기록한 내용이다.
		//		 데이터를 아래와 같이 출력 하시요 (각 회원별 구입 총합 )	
		/*
		  =====================
			10001 김철수 2670
			10002 이영희 1950
			10003 유재석 4080
			10004 박명수 7130
		   =====================		  
		 */
			
	}
}

