
public class Exam18_1 {
	public static void main(String[] args) {
	String str1 = new String("Java Programming");
	System.out.println(str1.length());
	String str2 = new String("Java Programming");
	System.out.println(str1.equals(str2));
	String str3 = str1.substring(3);//부분문자열 3~마지막까지 추출
	System.out.println(str3);
	str3 = str1.substring(0,3); //부분문자열 012부분 추출
	System.out.println(str3);
	String str10 = new String("Java");
	String str11 = new String("Programming");
	System.out.println(str10 + str11);
	String str12 = 10.3 + str11;
	System.out.println(str12);
	
	StringBuffer sb = new StringBuffer();
	sb.append("Java Programming"); //버퍼는 편집가능
	System.out.println(sb.toString());
	sb.replace(0, 5, "jsp");
	System.out.println(sb);
	sb.delete(0, 3);
	System.out.println(sb);
	sb.reverse();
	System.out.println(sb);
	}
}
/*
String클래스는 기본 데이터형 X 객체 생성해야 사용가능함

new 연산자를 이용해서 객체를 생성할 경우 동일한 문자열을 저장하더라도 다른 기억공간에 생성되어서
String str1 = new String("자바");
String str2 = new String("자바"); 
System.out.println(str1==str2) : false

문자열 할당을 이용한 객체생성을 할경우 동일한 문자열을 생성할 경우 같은 기억공간에 할당
String str1 = "자바";
String str2 = "자바";
System.out.println(str1==str2) : true

String str1 = new String("java programming");// index[0]~[15]로 16개
System.out.println(str.length()); //16 : 공백도 한개로 count
String str2 = new String("java programming");
System.out.println(str1.equals(str2)); //true
String str3 = str1.substring(3); //a programming 반환
str3 = str1.substring(0,3); //jav 반환

String클래스의 메서드는 자신의 문자열을 수정하지 않으므로 새로운 객체를 생성하여 반환 받아 사용해야함
+ 연산자 : 문자열의 결합 : 숫자데이터와 문자열 결합시 숫자데이터가 문자열로 자동 형변환되어 연결된 문자열 반환
*/