package TestExer;

import java.util.Arrays;

public class Account{
	public static void main(String[] args) {
		TestA[] t = new TestA[3];
		t[0] = new TestA(3, "hello", 23);
		t[1] = new TestA(5, "hi", 30);
		t[2] = new TestA(6, "ab", 17);
		
		Arrays.sort(t);
		
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i].toString());
		}
	}
}

class TestA {
	int num;
	String str;
	int age;
	
	TestA(){}
	
	TestA(int num, String str, int age){
		this.num = num;
		this.age = age;
		this.str = str;
	}


	@Override
	public String toString() {
		return "TestA [num=" + num + ", str=" + str + ", 나이=" + age + "]";
	}
	
	
	
}

