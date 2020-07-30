//다시 들어 ^^ㅎㅎㅎ
package hijava;
//더블 버퍼링을 사용한 애니메이션 예제
import java.awt.*;
import java.applet.*;
public class Exam36_3 extends Applet implements Runnable {
	Image img[];
	Image offimg = null;
	Graphics offg;
	String file[];
	int i, index = 0;
	Thread t;
	public void init() {
		file = new String[10];
		img = new Image[10];
		for (i = 1; i <= 10; i++) {
			file[i-1] = "T" + i + ".gif";
			img[i-1] = this.getImage(getDocumentBase(), file[i-1]);
		}
		this.setSize(500, 200);
		t = new Thread(this);
		t.start();
	}
	public void update(Graphics g) {
		if (offimg == null) {
			offimg = this.createImage(500,  200);
			offg = offimg.getGraphics();
		}
		offg.setColor(Color.white);
		offg.fillRect(0,  0,  500,  200);
		offg.drawImage(img[index], 0, 0, this);
		paint(g);
	}
	public void paint(Graphics g) {
		if (offimg != null)
			g.drawImage(offimg, 0, 0, this);
	}
	public void run() {
		while (true) {
			if (index > 9)
				index = 0;
			try {
				t.sleep(200);
				repaint();
				index++;
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
	}
}//10장의 이미지가 반복적으로 출력되는것 확인가능
//이미지 애니메이션을 위해서는 이미지가 사진에 저장이 되어있어야함.