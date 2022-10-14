package day0201;

public class 문자열예제 {

	public static void main(String[] args) {
		String s = "abcdefg";
		String s1 = "abcabcdefg";
		String s2 = "abcdefg히히히";
		
		System.out.println("문자열 '길이' \n" + s.length());
		System.out.println("바이트 단위 문자열 길이 \n" + s2.getBytes().length); 
		
		System.out.println("문자열 안에 '특정 문자'를 꺼내는 메소드 \n" + s.charAt(1));
		System.out.println("'부분 문자열'을 꺼내는 메소드 subString \n" + s.substring(3));
		System.out.println("'부분 문자열'을 꺼내는 메소드 subString \n" + s.substring(2,4));
		
		System.out.println("다른 문자열과 내용이 '같은지' 조사하는 메소드 \n" + s.equals("abc"));
		System.out.println("다른 문자열과 비교하는 메소드 \n" + s.compareTo("abc")); //같으면 = 0
		
		System.out.println("문자열을 검색하기 \n" + s1.indexOf("c"));
		System.out.println("문자열을 검색하기 \n" + s1.lastIndexOf("c"));
	}

}
