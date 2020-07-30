package hijava;
//키보드로 입력한 내용을 파일에 저장하기 예제

import java.io.*;//입출력 패키지
public class Exam34_2 {
	public static void main(String[] args) {
		int data;//키보드로 읽은 값을 저장할 변수
		try {
			File file = new File("output.txt");//키보드로 입력한 데이터를 저장할 파일
			FileOutputStream fout = new FileOutputStream(file);
			while((data = System.in.read()) != -1)
				fout.write(data);
			fout.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
//Ctrl+z 누르면 data값이 -1 인것으로 되므로 종료키가 된다
//아래 콘솔창에 저장할 문자 다 쓰고 Ctrl+z 누르면 콘솔창 상단에 <terminated>뜸
