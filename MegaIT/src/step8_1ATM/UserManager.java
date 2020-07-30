package step8_1ATM;

import java.util.Scanner;

public class UserManager {
	Scanner scan = new Scanner(System.in);
	User[] user = null;
	int userCount = 0;
	
	void print_all_user() {
		for(int i = 0; i<userCount; i++) {
			user[i].printAccount();
		}
	}
	
	void addUser() {
		// 아이디 중복처리
		// if-else 문은 방파주기
		if(userCount == 0) {
			user = new User[1];
		}else {
			User temp[] = user;
			user = new User[userCount + 1];
			for(int i = 0; i<userCount; i++) {
				user[i] = temp[i];
			}
		}
		// 파준 방안에 생성자 불러서 객체선언 
		user[userCount] = new User();
		System.out.println("[가입] 아이디를 입력하세요. ");
		String name = scan.next();
		
		for(int  i = 0; i<userCount; i++) {
			if(user[i].name.equals(name)) {
				
			}
		}
		user[userCount].name = name;
		userCount += 1;
	}
	
	User getUser(int i) {
		return user[i];
	}
	
	int logUser() {
		int log = -1;
		System.out.println("[입력] 아이디를 입력하세요.");
		String name = scan.next();
		for(int i = 0; i<userCount; i++) {
			if(name.equals(user[i].name)) {
				log = i;
				System.out.println("[" +user[log].name + "]");
			}
		}
		return log;
	}
	
	void leave() {
		
		String name = scan.next();
		int id = -1;
		for(int i = 0; i<userCount; i++) {
			if(name.equals(user[i].name)) {
				id = i;
			}
		} 
		
		if(id == -1) return;
		User[] temp = user;
		user = new User[userCount - 1];
		for(int i = 0; i<id; i++) {
			user[i] = temp[i];
		}
		for(int i = id; i<userCount; i++) {
			user[i] = temp[i+1];
		}
		userCount -= 1;
	}
	
}
