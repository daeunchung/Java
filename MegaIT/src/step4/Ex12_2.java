package step4;

import java.io.FileWriter;

// # ���� �����ϱ� : �������� 2
public class Ex12_2 {

	public static void main(String[] args) {
		// momk/1111/20000
		// megait/2222/30000
		// github/3333/40000
		
		String[] names = {"momk", "megait", "github"};
		String[] pws   = {"1111",   "2222",   "3333"};
		int[]    moneys= { 20000,    30000,    40000};
		
		String fileName = "fileTest02.txt";
		
		String data = "";

		for(int i = 0; i<names.length; i++) {
			data += names[i];
			data += "/";
			data += pws[i];
			data += "/";
			data += moneys[i];
			data += "\n";
		}
		
		// ������ ���� ���� -> �� �������� 40000 �ڿ� "\n" ������ ����..?
		data = data.substring(0, data.length() - 1);
		System.out.println(data);
		
		FileWriter fw = null;
		try {
			fw = new FileWriter(fileName);
			fw.write(data);
			fw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}