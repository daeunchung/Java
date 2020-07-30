/*package step7;

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
	void add_student(Student st) {
		if(count == 0) {
			list = new Student[1];
		}else if(count > 0) {
			// 기존 list 를 temp라는 클래스배열에 옮겨 놓고 list배열을 한칸늘려
			Student[] temp = list;
			list = new Student[count+1];
			for(int i = 0; i<count; i++) {
				list[i] = temp[i];
			}
			temp = null;
		}
		list[count] = st;
		count++;
	}
	
	// ID 입력받아서 탈퇴라그랬는데 왜 int index 를 받지..(?)
	Student remove_student(int index) {
		Student del_st = list[index];
		if(count == 1) {
			list = null;
		}else if(count > 1) {
			Student[] temp = list;
			list = new Student[count-1];
			for(int i = 0; i<index; i++) {
				list[i] = temp[i];
			}
			for(int i = index; i<count-1; i++) {
				list[i] = temp[i+1];
			}
			temp = null;
		}
		count--;
		return del_st;
	}
	
	// 입력받은 Student st가 기존 list에 존재하는지 체크하는 메서드
	int check_id(Student st){
		int check = -1;
		for(int i = 0; i<count; i++) {
			if(list[i].id.equals(st.id)) {
				check = i;
				break;
			}
		}
		return check;
	}
	void print_student() {
		for(int i = 0; i<count; i++) {
			list[i].print_data();
		}
	}
	
	// data 출력메서드
	String out_data(){
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
			if(i != count-1) {
				data += "\n";
			}
		}
		return data;
	}
	
	// data 정렬메서드
	void sort_data() {
		// 사전순 정렬 X 값 큰것부터 출력하는 코드 (사전반대방향 정렬)
		for(int i = 0; i<count; i++){
			for(int j = 0; j<count; j++) {
				if(list[i].id.compareTo(list[j].id) > 0) {
					Student temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		} 
		
		// 사전순 정렬 O
		for(int i = 0; i<count; i++){
			String minId = list[i].id;
			int minIdx = i;
			for(int j = i; j<count; j++) {
				if(list[i].id.compareTo(list[j].id) > 0) {
					Student temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}
	}
	
	// data 로드메서드
	void load_data(Student[] temp, int c) {
		count = c;
		list = temp;
		// count 와 list 는 각각 class Manager안의 int변수와 Student클래스배열 변수
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Manager manager = new Manager();
		boolean run  = true;
		while(run) {
			System.out.println("1.가입 2.탈퇴 3.정렬 4.출력 5.저장 6.로드");
			int sel = scan.nextInt();
			//
			 // [1] 가입 : ID 중복검사 구현
			 // [2] 탈퇴 : ID를 입력받아 탈퇴
			 // [3] 정렬 : 이름을 국어사전 순으로 정렬
			 // [4] 저장 : 아래와 같은 형식으로 저장
			 // 			예) 
			 // 			2				// 회원 수
			 //			qwer,1234		// id,pw	
			 //			abcd,1111		// id, pw
			 //
			if(sel == 1) {
				Student temp = new Student();
				System.out.println("[가입] id 를 입력하세요 >>> ");
				temp.id = scan.next();
				int check = manager.check_id(temp);
				if(check == -1) { // 중복되는거 없으면
					System.out.println("[가입] pw 를 입력하세요 >>> ");
					temp.pw = scan.next();
					manager.add_student(temp);
					System.out.println(temp.id + "님 가입을 환영합니다.");
				}else {
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
					System.out.println("없는 아이디입니다.");
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
			else if(sel == 5) { // 저장
				if(manager.count == 0) continue;
				try {
					FileWriter fw = new FileWriter("student_manager.text");
					String data = manager.out_data();
					if(!data.equals("")) {
						fw.write(data);
						System.out.println(data);
					}
					fw.close();
				} catch (Exception e) {e.printStackTrace();}
			}
			else if(sel == 6) { // 출력
				try {
					File file = new File("student_manager.text");
					if(file != null) {
						FileReader fr = new FileReader(file);
						BufferedReader br = new BufferedReader(fr);
						String line = br.readLine();
						// 한줄씩 읽어오기 !!!!!!!!! 맨날 못써 맨날 까먹어 !!
						int count = Integer.parseInt(line);
						Student[] temp = new Student[count];
						for(int i = 0; i<count; i++) {
							temp[i] = new Student();
							line = br.readLine();
							String value[] = line.split(",");
							temp[i].id = value[0];
							temp[i].pw = value[1];
						}
						fr.close();
						br.close();
						manager.load_data(temp, count);
					}
					manager.print_student();
				} catch (Exception e) {e.printStackTrace();}
			}
		}
	}
}
*/
