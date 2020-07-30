package step8_1ATM;

public class User {
	String name = "";
	Account acc[] = null;
	int accCount = 0;
	
	void printAccount() {
		System.out.println(name);
		for(int i = 0; i<accCount; i++) {
			acc[i].print();
		}
	}
	
	/*
	 * int check_user() { int check = -1; for(int i = 0; i<accCount; i++) {
	 * if(acc[i].name.equals(name)) { } } }
	 */
	
}
