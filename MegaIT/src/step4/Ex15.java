package step4;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//# 파일 컨트롤러[2단계] : ATM 0135-0216    0220-0250 
// 미완성 sel == 7 일때 제대로 안돌아감
public class Ex15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int size = 5;
		int count = 0;
		int log = -1;
		
		String[] accs = new String[size];
		String[]  pws = new String[size];
		int[]  moneys = new int[size];
		
		String fileName = "atm.txt";
		
		while(true) {
			System.out.println("---------");
			for(int i = 0; i<count; i++) {
				System.out.println(accs[i] + " : " + pws[i]  + " : "+ moneys[i]);
			}System.out.println("---------");
			if(log == -1) {
				System.out.println("상태 : 로그아웃");
			}else {
				System.out.println("상태 : " + accs[log] + "님, 로그인");
			}
			
			System.out.println("[MEGA ATM]");
			System.out.println("[1]회원가입");
			System.out.println("[2]회원탈퇴");
			System.out.println("[3]로그인");
			System.out.println("[4]로그아웃");
			System.out.println("[5]입금");
			System.out.println("[6]출금");
			System.out.println("[7]이체");
			System.out.println("[8]잔액조회");
			System.out.println("[9]저장");
			System.out.println("[10]로드");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.println("[가입]계좌번호 입력 : ");
				String acc = scan.next();
				
				int check = 1;
				for(int i = 0; i<count; i++) {
					if(accs[i].equals(acc)) {
						check = -1;
					}
				}
				if(check == 1) {
					if(count == 5) {
					System.out.println("[메세지]회원가입이 더이상 불가능합니다");
					continue;
					}
					System.out.println("[가입]비밀번호 입력 : ");
					String pw = scan.next();
					
					accs[count] = acc;
					pws[count] = pw;
					moneys[count] = 1000;
					count ++;
					System.out.println("[메세지]회원가입을 축하합니다.");
				}else {
					System.out.println("[메세지]계좌번호가 중복됩니다.");
				}
			}
			
			else if(sel == 2) {
				if(log == -1) {
					for(int i = log; i<count; i++) {
						accs[i] = accs[i+1];
						pws[i] = pws[i+1];
						moneys[i] = moneys[i+1];
					}
				}count--;
				log = -1;	
			}
			else if(sel == 3) {
				if(log != -1) {
					System.out.println("[메세지]" + accs[log] + "님, 로그인중..");
				}else if(log == -1) {
					System.out.println("[로그인]계좌번호 입력 : ");
					String acc = scan.next();
					System.out.println("[로그인]비밀번호 입력 : ");
					String pw = scan.next();
					
					for(int i = 0; i<count; i++) {
						if(accs[i].equals(acc) && pws[i].equals(pw)) {
							log = i;
						}
					}
				}
			}
			else if(sel == 4) {
				if(log == -1) {
					System.out.println("[메세지]로그인 후 이용가능합니다.");
				}else {
					log = -1;
					System.out.println("[메세지]로그아웃 되었습니다.");
				}
			}
			else if(sel == 5) {
				if(log != -1) {
					System.out.println("[입금]금액 입력 : ");
					int money = scan.nextInt();
					
					moneys[log] += money;
					System.out.println("[메세지]입금이 완료되었습니다.");
				}else {
					System.out.println("[메세지]로그인 후 이용가능합니다.");
				}
			}
			else if(sel == 6) {
				if(log != -1) {
					System.out.println("[출금]금액 입력 : ");
					int money = scan.nextInt();
					if(moneys[log] >= money) {
						moneys[log] -= money;
						System.out.println("[메세지]출금이 완료되었습니다.");
					}else {
						System.out.println("[메세지]잔액이 부족합니다.");
					}
				}else {
					System.out.println("[메세지]로그인 후 이용가능합니다.");
				}
			}
			
			else if(sel == 7) {
				if(log == -1) {
					System.out.println("[메세지]로그인 후에 이용가능합니다.");
				}else {
					System.out.println("[이체]이체할 계좌번호를 입력 : ");
					String acc = scan.next();
					
					int check = -1;
					for(int i = 0; i<count; i++) {
						if(accs[i].equals(acc)) {
							check = i;
						}else {
							System.out.println("[메세지]계좌번호를 확인해주세요.");
							continue;
						}
					}
					if(check != -1) {
						System.out.println("[이체]금액 입력 : ");
						int money = scan.nextInt();
						if(moneys[log] >= money) {
							moneys[log] -= money;
							moneys[check] += money;
							System.out.println("[메세지]이체 완료");
						}else {
							System.out.println("[메세지]잔액이 부족합니다.");
						}
					}	
				}
			}
			else if(sel == 8) {
				if(log != -1) {
					System.out.println(accs[log] + "님의 계좌 잔액은 " + moneys[log] + "원 입니다");
				}else {
					System.out.println("[메세지]로그인 후 이용가능합니다");
				}
			}
			else if(sel == 9) {
				if(count == 0) {
					System.out.println("[메세지]저장할 데이터가 없습니다.");
					continue;
				}
				String data = "";
				for(int i = 0; i<count; i++) {
					data += (accs[i]+ "/" +pws[i] + "/" + moneys[i] + "\n");
				}
				data = data.substring(0, data.length()-1);
				
				FileWriter fw = null;
				try {
					fw = new FileWriter(fileName);
					fw.write(data);
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					if(fw != null) {
						try {
							fw.close();
						} catch (IOException e) {
						}
					}
				}
			}
			else if(sel == 10) {
				File file = new File(fileName);
				if(file.exists()) {
					FileReader fr = null;
					BufferedReader br = null;
					try {
						fr = new FileReader(file);
						br = new BufferedReader(fr);
						
						String data = "";
						while(true) {
							String line = br.readLine();
							if(line == null) {
								break;
							}
							data += line;
							data += "\n";
						}
						data = data.substring(0, data.length()-1);
						
						String[] temp = data.split("\n");
						count = temp.length;
						
						for(int i = 0; i<count; i++) {
							String[] info = temp[i].split("/");
							accs[i] = info[0];
							pws[i] = info[1];
							moneys[i] = Integer.parseInt(info[2]);
						}
					} catch (Exception e) {
						e.printStackTrace();
					}finally {
						if(fr != null) {try { fr.close(); } catch (IOException e) {}}
						if(br != null) {try { fr.close(); } catch (IOException e) {}}
					}
				}
			}
			else if(sel == 0) {
				System.out.println("[메세지]프로그램 종료");
				break;
			}
			
		}

	}

}
