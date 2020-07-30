package step4;

import java.io.FileWriter;

// # 파일 저장하기 : 연습문제1
public class Ex12_1 {

	public static void main(String[] args) {
		// 김철수/20,이만수/30,이영희/40
		
		String[] names = {"김철수", "이만수", "이영희"};
		int[]     ages = {	   20,     30,     40};
		
		String fileName = "fileTest01.txt";
		
		String data = "";

		for(int i = 0; i<names.length; i++) {
			data += names[i];
			data += "/";
			data += ages[i];
			if(i != names.length - 1) {
				data += ",";
			}
		}System.out.println(data);

		FileWriter fw = null;
		try {
			fw = new FileWriter(fileName); // 파일을 저장하고
			fw.write(data); // 문자열을 적고
			fw.close(); // fw 를 끝낸다 (?)
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
