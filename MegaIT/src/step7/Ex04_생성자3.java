package step7;
class Book{
	String title;   // 책 제목
	String author;  // 책 저자
 	int price;      // 책 가격
	
 	// 기본 생성자
	// Book(){} : 굳이 안써놔도 자동생성되어있다
	
	// 생성자 오버로딩
	Book(String title, int price){
		// this.title = title;
		// author = "작자미상";
		// this.price = price;
		
		// 생성자 호출
		this(title, "작자미상", price);
	}
	
    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    void showInfo() {
        System.out.println(title + ":" + author + "(" + price + "원)");
    }


}
public class Ex04_생성자3 {
	public static void main(String[] args) {
		
		Book b1 = new Book("자바의 정석", "남궁성", 27000);
		b1.showInfo();
		
		Book b2 = new Book("춘향전", 9000);
		b2.showInfo();

	}
}
