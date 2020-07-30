package kr.koreait.bookshop;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

// å 1���� ������ ����ϴ� Ŭ����
public class BookVO {

	private String title;
	private String author;
	private String publisher;
	private Date date;
	private double price;
	
	public BookVO() {
		// TODO Auto-generated constructor stub // �⺻ ������
	}
	
	public BookVO(String title, String author, String publisher, Date date, double price){
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		
//		�������� �μ� (data)�� �Ѿ�� ��¥���� �⵵�� 1900�� ���� 1�� ���� �����Ų��.
		date.setYear(date.getYear() - 1900);
		date.setMonth(date.getMonth() - 1);
		
		this.date = date;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E)");
		
//		���� ���� ����
//		NumberFormat nf = NumberFormat.getNumberInstance();		// õ ���� ���� ��ȣ
//		NumberFormat nf = NumberFormat.getCurrencyInstance();	// ��ȭ ��ȣ
//		NumberFormat nf = NumberFormat.getPercentInstance();	// �����
		
//		DecimalFormat df = new decimalformat("���� ����");
//		���� ������ ������ "#,##0" �� ���� �ʿ��� ���ڸ� �� �Ǵ� �ڿ� �ٿ��ش�.
//		DecimalFormat df = new DecimalFormat("#,##0");			//	õ ���� ���� ��ȣ
//		DecimalFormat df = new DecimalFormat("��#,##0");			// ��ȭ ��ȣ
//		DecimalFormat df = new DecimalFormat("��#,##0");
//		DecimalFormat df = new DecimalFormat("��#,##0");
//		DecimalFormat df = new DecimalFormat("��#,##0");
//		�Ҽ��� �Ʒ� ���ڸ� ����Ϸ��� "#,##0" �ڿ� "." �� ��� �ʿ��� �ڸ� ��ŭ "0"�Է��Ѵ�.
//		DecimalFormat df = new DecimalFormat("$#,##0.00");
//		DecimalFormat df = new DecimalFormat("#,##0%");			// �����
		DecimalFormat df = new DecimalFormat("#,##0��");

//		return "BookVO [title=" + title + ", author=" + author + ", publisher=" + publisher + ", date=" + sdf.format(date) + ", price=" + df.format(price) + "]";
		return String.format("%s %s %s %s %s", title, author, publisher, sdf.format(date), df.format(price));
	
	}
	
}
