package step7;
class Book{
	String title;   // å ����
	String author;  // å ����
 	int price;      // å ����
	
 	// �⺻ ������
	// Book(){} : ���� �Ƚ���� �ڵ������Ǿ��ִ�
	
	// ������ �����ε�
	Book(String title, int price){
		// this.title = title;
		// author = "���ڹ̻�";
		// this.price = price;
		
		// ������ ȣ��
		this(title, "���ڹ̻�", price);
	}
	
    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    void showInfo() {
        System.out.println(title + ":" + author + "(" + price + "��)");
    }


}
public class Ex04_������3 {
	public static void main(String[] args) {
		
		Book b1 = new Book("�ڹ��� ����", "���ü�", 27000);
		b1.showInfo();
		
		Book b2 = new Book("������", 9000);
		b2.showInfo();

	}
}
