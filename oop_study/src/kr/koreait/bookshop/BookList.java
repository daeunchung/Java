package kr.koreait.bookshop;

import java.text.DecimalFormat;
import java.util.ArrayList;

// �������� å ���� (BookVO Ŭ����)�� ����ϴ� Ŭ����
public class BookList {
	
	private ArrayList<BookVO> bookList = new ArrayList<BookVO>();
	// �������� å ������ ����ϴ�   ArrayList �� �����Ѵ�.

	public ArrayList<BookVO> getBookList() {
		return bookList;
	}

	public void setBookList(ArrayList<BookVO> bookList) {
		this.bookList = bookList;
	}
	
	@Override
	public String toString() {
		String str = "";
		
		str += "==================================================\n";
		str += "	������	����		���ǻ�	������	����		\n";
		str += "==================================================\n";
		
		double total = 0.0;
		for(int i = 0; i<bookList.size(); i++) {
			str += bookList.get(i) + "\n";
			total += bookList.get(i).getPrice();
		}
		
//		for(BookVO book : bookList) {
//			str += book + "\n";
//			total += book.getPrice();
//		}
		
		str += "==================================================\n";
		DecimalFormat df = new DecimalFormat("#,##0��");
		str += "				�հ� �ݾ� : " + df.format(total) + "\n";
		str += "==================================================\n";
		
		return str;
	}
	
	
//	å 1���� ����(BookVO Ŭ���� ��ü)�� �μ��� �Ѱܹ޾� bookList ArrayList�� �����ϴ� �޼ҵ�
	public void addBook(BookVO vo) {
		bookList.add(vo);
	}
}
