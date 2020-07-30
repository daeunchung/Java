package hijava;

public class Exam8_1 {

	public static void main(String[] args) {
		//int data[] = new int[5];
		//-> data[0],[1],[2],[3],[4] = 모두 0으로 초기화
		
		int data[] = {12,12,12,34,23};
		//int data[] = new int[5];
		for(int i=0;i<5;i++) {
			data[i]=10;
			System.out.println(data[i]);
		}
	}
}

