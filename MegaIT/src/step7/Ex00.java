package step7;
// # 메모리 구조 그리기
public class Ex00 {
	public static void main(String[] args) {
		
		int[][] arr = {
			{1, 2, 3},
			{7, 8, 9},
			{4, 5, 6}
		};
		
		int[] temp = arr[1];
		arr[1] = arr[2];
		arr[2] = temp;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		int[] scores = {1, 2, 3, 4, 5};
		scores[0] = scores[1];
		
	}
}
