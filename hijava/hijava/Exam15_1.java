package hijava;

interface VolumeSystem{
	void VolumeUp();
	void VolumeDown();
}

public class Exam15_1 implements VolumeSystem{
	public void VolumeUp() {
		System.out.println("������ ���δ�");
	}
	public void VolumeDown() {
		System.out.println("������ �����");
	}

	public static void main(String[] args) {
		Exam15_1 audio = new Exam15_1();
		audio.VolumeUp();
		audio.VolumeDown();
	}

}
