package hijava;
//파일 내용 읽기 예제

import java.io.*;//입출력해야해서 io패키기
public class Exam34_1 {
	public static void main(String[] args) {
		int data = 0;
		String file = "C:\\Users\\user\\eclipse-workspace\\First\\src\\hijava\\Exam34_1.java";
		try {
			FileInputStream fin = new FileInputStream(file);
			while((data = fin.read()) != -1)
				System.out.write(data);
			fin.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
//실제로 존재하는 파일의 정확한 절대경로를 작성해줘야만 코드가 출력된다
//파일 주소 잘못 넣어주면 file not founded 뜸