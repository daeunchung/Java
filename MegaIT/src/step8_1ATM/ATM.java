package step8_1ATM;

import java.util.Scanner;

public class ATM {
	Scanner scan = new Scanner(System.in);
	UserManager userManager = new UserManager();
	int log = -1; // �α׾ƿ� ����
	
	void menu() {
		boolean run = true;
		while(run) {
			System.out.println("[MAGA ATM]");
			System.out.println("[1.�α���]\n[2.�α׾ƿ�]\n[3.ȸ������]\n[4.ȸ��Ż��]\n[0.����]");
			int sel = scan.nextInt();
			if(sel == 1) {
				login();
			}else if(sel == 2) {
				logout();
			}else if(sel == 3) {
				join();
			}else if(sel == 4) {
				leave();
			}else if(sel == 0) {
				run = false;
			}
		}
	}
	
	void login() {
		log = userManager.logUser();
		if(log != -1) {
			loginMenu();
		}else {
			System.out.println("[�޼���] �α��ν���");
		}
	}
	void join() { userManager.addUser();}
	void logout() { log = -1;}
	void leave() { userManager.leave();}
	void loginMenu() {
		boolean run = true;
		while(run) {
			System.out.println("[1.���»���] [2.���»���] [3.��ȸ] [0.�α׾ƿ�]");
			int sel = scan.nextInt();
			if(sel == 1) {
			
			}else if(sel == 2) {
				
			}else if(sel == 3) {
				
			}else if(sel == 0) {
				run = false;
			}
		}
	}
}
