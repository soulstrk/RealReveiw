package review;

public class PG_StringBuffer {

	public static void main(String[] args) {
		
		  StringBuffer sb = new StringBuffer();
		  sb.append("hello");
		  sb.append(" ");
		  sb.append("world");
		  
		  String str = sb.toString();
		  System.out.println(str);
		  
		  StringBuffer sb2 = new StringBuffer();
		  StringBuffer sb3 = sb2.append("hello");
		  if(sb2 == sb3) System.out.println("sb2 == sb3");
		 

		// 메소드 체이닝 : 자기자신을 리턴하여 계속해서 자신의 메소드를 호출하는 방식
	
	    //String 클래스의 문제점 
		String str1 = "hello world";
		String str2 = str1.substring(5);
		System.out.println(str1);
		System.out.println(str2);
		
		String str3 = str1 + str2;
		System.out.println(str3);
		
		String str4 = new StringBuffer().append(str1).append(str2).toString(); // 내부적인 로직
		System.out.println(str4);
		
		String str5 = "";
		for (int i = 0; i < 100; i++) {
			str5 = str5 + "*";
		}
		System.out.println(str5);
		//스트링버퍼를 꺼내서 결합하기 때문에 굉장히 좋지 않은 로직
		
		StringBuffer ab = new StringBuffer();
		for (int i = 0; i < 100; i++) {
			ab.append("*");
		}
		String str6 = ab.toString();
		System.out.println(str6);
		// 문자열을 반복문 안에서 사용하는 것은 성능상으로 문제가 되기 때문에 반드시 피하는게 좋다!
	}
}
