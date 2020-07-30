package step7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

class Student{
	String id = "";
	String pw = "";
	
	void set_data(String i , String  p) {
		id = i; pw = p;
	}
	
	void print_data() {
		System.out.println("이름 : " + id + " 비밀번호 : " + pw);
	}
}

class Manager{
	Student [] list = null;
	int count = 0;
	
	// 학생 추가
	void add_student(Student st) {
		if(count == 0) {
			list = new Student[1];
		}else if(count > 0){
			Student [] temp = list;
			list = new Student[count + 1];
			for(int i = 0; i<count; i++) {
				list[i] = temp[i];
			}
			temp = null;
		}
		list[count] = st;
		count += 1;
	}
	
	// 학생 삭제
	Student remove_student(int index) {
		Student del_st = list[index];
		if(count == 1) {
			list = null;
		}else if(count > 1) {
			Student [] temp = list;
			list = new Student[count-1];
			for(int i = 0; i<index; i++) {
				list[i] = temp[i];
			}
			for(int i = index; i<count-1; i++) {
				list[i] = temp[i+1];
			}
			temp = null;
		}
		count -= 1;
		return del_st;
	}
	
	// id 중복확인
	int check_id(Student st) {
		int check = -1;
		for(int i = 0; i<count; i++) {
			if(st.id.equals(list[i])) {
				check = i;
				break;
			}
		}
		return check;
		
	}
	
	// 출력
	void print_student() {
		for(int i = 0; i<count; i++) {
			list[i].print_data();
		}
	}
	
	// data 출력 메서드
	String out_data() {
		String data = "";
		if(count == 0) {
			return data;
		}
		data += count;
		data += "\n";
		for(int i = 0; i<count; i++) {
			data += list[i].id;
			data += ",";
			data += list[i].pw;
			if(i != count -1) {
				data += "\n";
			}
		}
		return data;
		
	}
	// 정렬 메서드
	void sort_data() {
		for(int i = 0; i<count; i++) {
			for(int j = 0; j<count; j++) {
				if(list[i].id.compareTo(list[j].id) > 0) {
					Student temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}
	}
	
	// data 저장 메서드
	void load_data(Student [] temp, int c) {
		count = c;
		list = temp;
	}
}

public class Ex03Re { 
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Manager manager = new Manager();
		boolean run  = true;
		while(run) {
			System.out.println("1.가입 2.탈퇴 3.정렬 4.출력 5.저장 6.로드");
			int sel = scan.nextInt();
			/*
			 * [1] 가입 : ID 중복검사 구현
			 * [2] 탈퇴 : ID를 입력받아 탈퇴
			 * [3] 정렬 : 이름을 국어사전 순으로 정렬
			 * [4] 출력 : 
			 * [5] 저장 : 아래와 같은 형식으로 저장
			 * 			예) 
			 * 			2				// 회원 수
			 *			qwer,1234		// id,pw	
			 *			abcd,1111		// id, pw
			 * [6] 로드(불러오기) : 
			 */
			if(sel == 1) {
				Student temp = new Student();
				System.out.println("[가입] id 를 입력하세요 >>> ");
				temp.id = scan.next();
				int check = manager.check_id(temp);
				if(check == -1) {
					System.out.println("[가입] pw 를 입력하세요 >>> ");
					temp.pw = scan.next();
					manager.add_student(temp);
					System.out.println(temp.id + "님 가입을 환영합니다.");
				} 
				else {
					System.out.println("중복아이디 입니다.");
				}
			}
			else if(sel == 2) {
				manager.print_student();
				Student temp = new Student();
				System.out.println("[탈퇴] id 를 입력하세요 >>> ");
				temp.id = scan.next();
				int check = manager.check_id(temp);
				if(check == -1) {
					System.out.println("없는 아이디입니다");
				}else {
					Student del_st = manager.remove_student(check);
					System.out.println(del_st.id + "님 탈퇴 되었습니다.");
				}
			}
			else if(sel == 3) {
				manager.sort_data();
				manager.print_student();
			}
			else if(sel == 4) {
				manager.print_student();
			}
			else if(sel == 5) {
				if(manager.count == 0) {return;}
				try {
					FileWriter fw = new FileWriter("student_manager.text");
					String data = manager.out_data();
					if(!data.equals("")) {
						fw.write(data);
						System.out.println(data);
					}
					fw.close(); 
				}catch (Exception e) {e.printStackTrace();}
			}
			else if(sel == 6) {
				
				try {
					File file = new File("student_manager.text");
					if(file != null) {
						FileReader fr = new FileReader(file);
						BufferedReader br = new BufferedReader(fr);
						String line = br.readLine(); // 한줄씩 읽어오기
						int count = Integer.parseInt(line);
						
						Student [] temp = new Student[count];
						for(int i = 0; i<count; i++) {
							temp[i] = new Student();
							line = br.readLine();
							String value[] = line.split(",");
							temp[i].id = value[0];
							temp[i].pw = value[1];
						}
						fr.close(); br.close();
						manager.load_data(temp, count);
						
					}
					manager.print_student();
					
				}
				catch (Exception e) {
					e.printStackTrace();
				}

			}
			
		}
	}
	
}
