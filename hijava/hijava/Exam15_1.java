package hijava;

interface VolumeSystem{
	void VolumeUp();
	void VolumeDown();
}

public class Exam15_1 implements VolumeSystem{
	public void VolumeUp() {
		System.out.println("∫º∑˝¿ª ≥Ù¿Œ¥Ÿ");
	}
	public void VolumeDown() {
		System.out.println("∫º∑˝¿ª ≥∑√·¥Ÿ");
	}

	public static void main(String[] args) {
		Exam15_1 audio = new Exam15_1();
		audio.VolumeUp();
		audio.VolumeDown();
	}

}
