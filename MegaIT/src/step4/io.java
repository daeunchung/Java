package step4;

import java.io.*;
public class io {
	public static void main(String[] args) {
		int data;
		try {
			File file = new File("output.txt");
			FileOutputStream fout = new FileOutputStream(file);
			
			// while문을 벗어나려면  Ctrl + z
			while ((data = System.in.read()) != -1)
				fout.write(data);
			fout.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
