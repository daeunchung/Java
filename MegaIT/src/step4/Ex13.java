package step4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

// # 파일 로드하기 : 연습문제
public class Ex13 {

	public static void main(String[] args) {
		String[] ids = null;
		String[] pws = null;
		int[] moneys = null;
		
		String fileName = "fileTest02.txt";

		File file = new File(fileName);
		
		int size = 0;
		String data = "";
		
		if(file.exists()) {
			FileReader fr = null;
			BufferedReader br = null;
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr); // 버퍼트 리더는 메서드안에 파일리더명을 읽네..
				
				while(true) {
					String line = br.readLine(); // 한 줄 읽어오기
					if(line == null) {
						break;
					}
					data += line;
					data += "\n";
				}
				data = data.substring(0, data.length()-1);
				
				String[] temp = data.split("\n"); // line 이 temp배열에 한개씩 들어갈듯?
				size = temp.length;
				
				ids = new String[size];
				pws = new String[size];
				moneys = new int[size];
				
				for(int i = 0; i<size; i++) {
					String[] info = temp[i].split("/");
					ids[i] = info[0];
					pws[i] = info[1];
					moneys[i] = Integer.parseInt(info[2]);
				}
				for(int i = 0; i<size; i++) {
					System.out.println(ids[i] + " : " + pws[i] + " : " + moneys[i]);
				}
				
				fr.close();
				br.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
