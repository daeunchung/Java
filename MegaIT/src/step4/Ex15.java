package step4;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//# ���� ��Ʈ�ѷ�[2�ܰ�] : ATM 0135-0216    0220-0250 
// �̿ϼ� sel == 7 �϶� ����� �ȵ��ư�
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
				System.out.println("���� : �α׾ƿ�");
			}else {
				System.out.println("���� : " + accs[log] + "��, �α���");
			}
			
			System.out.println("[MEGA ATM]");
			System.out.println("[1]ȸ������");
			System.out.println("[2]ȸ��Ż��");
			System.out.println("[3]�α���");
			System.out.println("[4]�α׾ƿ�");
			System.out.println("[5]�Ա�");
			System.out.println("[6]���");
			System.out.println("[7]��ü");
			System.out.println("[8]�ܾ���ȸ");
			System.out.println("[9]����");
			System.out.println("[10]�ε�");
			System.out.println("[0]����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.println("[����]���¹�ȣ �Է� : ");
				String acc = scan.next();
				
				int check = 1;
				for(int i = 0; i<count; i++) {
					if(accs[i].equals(acc)) {
						check = -1;
					}
				}
				if(check == 1) {
					if(count == 5) {
					System.out.println("[�޼���]ȸ�������� ���̻� �Ұ����մϴ�");
					continue;
					}
					System.out.println("[����]��й�ȣ �Է� : ");
					String pw = scan.next();
					
					accs[count] = acc;
					pws[count] = pw;
					moneys[count] = 1000;
					count ++;
					System.out.println("[�޼���]ȸ�������� �����մϴ�.");
				}else {
					System.out.println("[�޼���]���¹�ȣ�� �ߺ��˴ϴ�.");
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
					System.out.println("[�޼���]" + accs[log] + "��, �α�����..");
				}else if(log == -1) {
					System.out.println("[�α���]���¹�ȣ �Է� : ");
					String acc = scan.next();
					System.out.println("[�α���]��й�ȣ �Է� : ");
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
					System.out.println("[�޼���]�α��� �� �̿밡���մϴ�.");
				}else {
					log = -1;
					System.out.println("[�޼���]�α׾ƿ� �Ǿ����ϴ�.");
				}
			}
			else if(sel == 5) {
				if(log != -1) {
					System.out.println("[�Ա�]�ݾ� �Է� : ");
					int money = scan.nextInt();
					
					moneys[log] += money;
					System.out.println("[�޼���]�Ա��� �Ϸ�Ǿ����ϴ�.");
				}else {
					System.out.println("[�޼���]�α��� �� �̿밡���մϴ�.");
				}
			}
			else if(sel == 6) {
				if(log != -1) {
					System.out.println("[���]�ݾ� �Է� : ");
					int money = scan.nextInt();
					if(moneys[log] >= money) {
						moneys[log] -= money;
						System.out.println("[�޼���]����� �Ϸ�Ǿ����ϴ�.");
					}else {
						System.out.println("[�޼���]�ܾ��� �����մϴ�.");
					}
				}else {
					System.out.println("[�޼���]�α��� �� �̿밡���մϴ�.");
				}
			}
			
			else if(sel == 7) {
				if(log == -1) {
					System.out.println("[�޼���]�α��� �Ŀ� �̿밡���մϴ�.");
				}else {
					System.out.println("[��ü]��ü�� ���¹�ȣ�� �Է� : ");
					String acc = scan.next();
					
					int check = -1;
					for(int i = 0; i<count; i++) {
						if(accs[i].equals(acc)) {
							check = i;
						}else {
							System.out.println("[�޼���]���¹�ȣ�� Ȯ�����ּ���.");
							continue;
						}
					}
					if(check != -1) {
						System.out.println("[��ü]�ݾ� �Է� : ");
						int money = scan.nextInt();
						if(moneys[log] >= money) {
							moneys[log] -= money;
							moneys[check] += money;
							System.out.println("[�޼���]��ü �Ϸ�");
						}else {
							System.out.println("[�޼���]�ܾ��� �����մϴ�.");
						}
					}	
				}
			}
			else if(sel == 8) {
				if(log != -1) {
					System.out.println(accs[log] + "���� ���� �ܾ��� " + moneys[log] + "�� �Դϴ�");
				}else {
					System.out.println("[�޼���]�α��� �� �̿밡���մϴ�");
				}
			}
			else if(sel == 9) {
				if(count == 0) {
					System.out.println("[�޼���]������ �����Ͱ� �����ϴ�.");
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
				System.out.println("[�޼���]���α׷� ����");
				break;
			}
			
		}

	}

}
