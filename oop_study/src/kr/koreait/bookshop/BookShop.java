package kr.koreait.bookshop;

import java.util.Date;

public class BookShop {

	public static void main(String[] args) {

		BookList bookList = new BookList();

//		Date date = new Date(2010, 5, 15);
//		BookVO book = new BookVO("�ڹ�", "ȫ�浿", "�ڸ������ǻ�", date, 35000);
		
		BookVO book = new BookVO("�ڹ�", "ȫ�浿", "�ڸ������ǻ�", new Date(2010, 5, 15), 35000);
		BookVO book2 = new BookVO("�ڹ�", "ȫ�浿", "�ڸ������ǻ�", new Date(2010, 5, 15), 35000);
		BookVO book3 = new BookVO("�ڹ�", "ȫ�浿", "�ڸ������ǻ�", new Date(2010, 5, 15), 35000);
		BookVO book4 = new BookVO("�ڹ�", "ȫ�浿", "�ڸ������ǻ�", new Date(2010, 5, 15), 35000);
		BookVO book5 = new BookVO("�ڹ�", "ȫ�浿", "�ڸ������ǻ�", new Date(2010, 5, 15), 35000);
		BookVO book6 = new BookVO("�ڹ�", "ȫ�浿", "�ڸ������ǻ�", new Date(2010, 5, 15), 35000);

		bookList.addBook(book);
		bookList.addBook(book2);
		bookList.addBook(book3);
		bookList.addBook(book4);
		bookList.addBook(book5);
		bookList.addBook(book6);
		
		System.out.println(bookList);
	}

}
