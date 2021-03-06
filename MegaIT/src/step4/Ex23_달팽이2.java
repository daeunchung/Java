package step4;

public class Ex23_달팽이2 {
	public static void main(String[] args) {
		int size = 5;
		int[][] map = new int[5][5];
		boolean[][] check = new boolean[5][5];
		
		int x = 0;
		int y = 0;
		int num = 1;
		int dir = 1;		// 1(오른쪽) 2(하) 3(왼쪽) 4(상)
		
		map[y][x] = num;
		check[y][x] = true;
		
		for(int i=0; i<24; i++) {
			int yy = y;
			int xx = x;
			
			if(dir > 4) {
				dir %= 4;
			}
			
			
			if(size <= xx || xx < 0 || size <= yy || yy < 0 ) {
				dir += 1;
				xx %= 5;
				yy %= 5;
			}
			
			if(dir == 1) {
				xx = xx + 1;
			}else if(dir == 2) {
				yy = yy + 1;
			}else if(dir == 3) {
				xx = xx - 1;
			}else if(dir == 4) {
				yy = yy - 1;
			}
			
			
			num = num + 1;
			
			y = yy;
			x = xx;
			
			map[y][x] = num;
			check[y][x] = true;
			
			System.out.println("y =  " + y + ", x = " + x);
			
		} // 좌표값이 변하는 모습을 25번 찍어서 보여주기
	
		
		// ---------- 이미 다 변경된 이후에 모습 출력만 ---------------
		// 달팽이 숫자 출력
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(map[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		// check 값이 모두 true로 바뀌었는지 확인
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(check[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
	}
}
