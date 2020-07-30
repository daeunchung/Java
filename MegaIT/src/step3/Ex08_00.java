package step3;
// # 2차원 배열
public class Ex08_00 {

	public static void main(String[] args) {
		
		int[][] ar = new int[3][3];
		
		System.out.println(ar[0]); // [I@15db9742
		ar[0][0] = 10;
		ar[0][1] = 20;
		ar[0][2] = 30;
		
		System.out.println(ar[1]); // [I@6d06d69c
		ar[1][0] = 40;
		ar[1][1] = 50;
		ar[1][2] = 60;
		
		System.out.println(ar[2]); //[I@7852e922
		ar[2][0] = 70;
		ar[2][1] = 80;
		ar[2][2] = 90;
		
		for(int i = 0; i<ar.length; i++) {
			for(int j = 0; j<ar[i].length; j++) {
				System.out.print(ar[i][j] + " ");
			}System.out.println();
		}
		
		System.out.println("-------------------------------------");
		
		int[] temp = ar[1];
		for(int i = 0; i<temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
		
	}

}
