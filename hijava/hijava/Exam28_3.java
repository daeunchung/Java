package hijava;
import java.awt.*;
import java.awt.event.*;

public class Exam28_3 extends Frame{
	TextField tf;
	TextArea ta;
	public class Exam28_3() {
		this.setLayout(new BorderLayout());
		tf = new TextField();
		ta = new TextArea();
		this.add(tf,"North");
		this.add(tf,"Center");
		tf.addActionListener(new TxtHandler());
	}
	class TxtHandler implements ActionLister{
		public void actionPerformed(ActionEvent e) {
			ta.append(tf.getText() + "\n");
			tf.setText("");
		}
	}

	public static void main(String[] args) {
		Exam28_3 f = new Exam28_3();
		f.setSize(300, 200);
		f.setVisible(true);
	}

}
