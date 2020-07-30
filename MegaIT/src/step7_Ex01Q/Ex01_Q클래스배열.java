/*package step7_Ex01Q;

import java.util.Scanner;

class Subject{
	String name;
	int score;
}
class Student{
	Subject[] subjects;
	String name;
}

public class Ex01_Q클래스배열 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// # 학생 추가 삭제 컨트롤러
		//   => 컨트롤러를 완성해 아래 3개의 정보를 추가하시오.
		//   김철수 : 과목3개 수학 50 국어50 영어 60 
		//   이만수 : 과목2개 수학 20 국어 30 
		//   이영희 : 과목1개 수학 100

		Student[] list = new Student[3];
		int count = 0; // 학생 수
		while(true) {
		
			// 현재 list 한번 쭉 출력해주기
			for(int i = 0; i<count; i++) {
				System.out.println("[" + (i+1) + "]" +  list[i].name + "학생>>>");
				if(list[i].subjects != null) {
					for(int j = 0; j<list[i].subjects.length; j++) {
						System.out.println("[" + (j+1) + "]" + list[i].subjects[j].name + " : " + list[i].subjects[j].score + "점");
					}
				}
				System.out.println();
			}
				
			System.out.println("[1]학생 추가하기");		// 이름 입력받아 추가
			System.out.println("[2]과목 추가하기");		// 이름과 과목 입력받아 추가
			System.out.println("[3]성적 추가하기");		// 이름과 과목 그리고 성적 입력받아 추가
			// [1] : class Student 한칸 늘려주고(new) , 새 객체 부여(new)
			// [2] : class Subject 한칸 늘려주고(new) , 새 객체 부여(new)
			// [3] : 기존에 있던 배열에 성적(값)만 넣어주면됌
			
			int choice = scan.nextInt();
			
			if(choice == 1) {
				System.out.print("이름 입력 : ");
				String name = scan.next();
				
				list[count] = new Student();
				list[count].name = name;
				count++;
			}
			else if(choice == 2) {
				for(int i = 0; i<count; i++) {
					System.out.println("[" + (i+1) + "]" + list[i].name);
				}
				System.out.print("학생 선택 : ");
				int select = scan.nextInt();
				select--;
				
				System.out.print("과목 입력 : ");
				String subject = scan.next();
				if(list[select].subjects == null) {
					list[select].subjects = new Subject[1];
					
					list[select].subjects[0] = new Subject();
					list[select].subjects[0].name = subject;
				}else {
					int size = list[select].subjects.length;
					
					Subject[] temp = list[select].subjects; 
					// temp 에다가 주소값 넣어놓기
					list[select].subjects = new Subject[size + 1];
					// 배열 크기만 새롭게 해준것. 주소값 안건들었음
					
					for(int i = 0; i<size; i++) {
						list[select].subjects[i] = temp[i];
						// 기존에 내용물들 새 배열로 옮겨주기
					}
					
					list[select].subjects[size] = new Subject();
					// 클래스 배열 칸에다가  Subject 객체를 부여 (객체 생성)
					list[select].subjects[size].name = subject;
					// 속에 내용물 (과목명) 넣어주기
					
					temp = null;
				}
			}
			else if(choice == 3) {
				for(int i = 0; i<count; i++) {
					System.out.println("[" + (i+1) + "]" + list[i].name);
				}
				System.out.print("학생 선택 : ");
				int select = scan.nextInt();
				select--;
				
				if(list[select].subjects != null) {
					for(int i = 0; i<list[select].subjects.length; i++) {
						System.out.println("[" + (i+1) + "]" + list[select].subjects[i].name + " : " + list[select].subjects[i].score + "점");
					}
				}
				System.out.print("과목 선택 : ");
				int num = scan.nextInt();
				num--;
				
				System.out.print("성적 입력 : ");
				int score = scan.nextInt();
				
				list[select].subjects[num].score = score;
			}
		}
	}
}
*/
