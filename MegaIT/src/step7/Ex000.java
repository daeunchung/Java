package step7;

class Toy{
	String name;
	int price;
}

public class Ex000 {
	public static void main(String[] args) {

		int s1 = 10;
		int s2 = 20;
		int s3 = 30;
		int[] scores = {10, 20, 30};
		
		Toy t1 = new Toy();
		Toy t2 = new Toy();
		Toy t3 = new Toy();
		// Toy[] toys = {t1, t2, t3};
		
		Toy[] toys = new Toy[3];
		for(int i=0; i<3; i++) {
			toys[i] = new Toy();
			System.out.println(toys[i]);
		}
		
	}
}
