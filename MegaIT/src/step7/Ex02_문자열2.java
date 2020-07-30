package step7;
class Test{
	int num;
	int size;
	char[] data;
	
	void print() {
		for(int i = 0; i<data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}
}
public class Ex02_문자열2 {
	public static void main(String[] args) {
		String data ="6\n";
		data += "0/2/a/b\n";
		data += "1/3/a/b/c\n";
		data += "2/5/a/b/c/d/e\n";
		data += "3/4/a/b/c/d\n";
		data += "4/3/a/b/c\n";
		data += "5/1/a";
	// data += num/size(문자개수)/data; 구조로 되어이있음
		System.out.println(data);	

		Test[] t;	
        // data의 정보를 클래스배열에 저장.
		String[] temp = data.split("\n");
		int size = Integer.parseInt(temp[0]);
		
		t = new Test[size];
		for(int i = 0; i<size; i++) {
			t[i] = new Test();
		}
		
		for(int i = 0; i<size; i++) {
			String[] info = temp[i+1].split("/");
			
			t[i].num =  Integer.parseInt(info[0]);
			t[i].size =  Integer.parseInt(info[1]);
			// 클래스에 char[] 배열을 해당 data 의 문자개수에 맞게 틔어줘야함
			t[i].data = new char[t[i].size];
			
			int k = 2;
			for(int j = 0; j<t[i].size; j++) {
			// for(int j=0; j<t[i].data.length; j++) 도 가능
				
				// 비록 info[] 한칸에 한문자씩 담겨 있긴 하지만
				// 변수형태가 String 형태라서 charAt()메서드 필요 
				t[i].data[j] = info[k].charAt(0);
				k++;
			}
		}
		for(int i = 0; i<size; i++) {
			t[i].print();
		}
	}
}