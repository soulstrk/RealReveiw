package review;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class ListSerMapFrameworrk {

	public static void main(String[] args) {
		/*
		 * ArrayList al = new ArrayList(); al.add("one"); al.add("two");
		 * al.add("three"); for (int i = 0; i < al.size(); i++) {
		 * System.out.println(al.get(i)); }
		 */
		// 첫장 ---------------------------------------------------

		/*
		 * ArrayList al = new ArrayList(); al.add("one"); // ArrayList의 인자값은 오브젝트 타입으로
		 * 되어 있다. al.add("two"); al.add("three"); for (int i = 0; i < al.size(); i++) {
		 * String value = (String)al.get(i); System.out.println(value); }
		 */ // 두번째장 (옛날방식) ---------------------------------------------------

		/*
		 * ArrayList<String> al = new ArrayList<String>(); // 제네릭 요소 추가 al.add("one");
		 * // ArrayList의 인자값은 오브젝트 타입으로 되어 있다. al.add("two"); al.add("three"); for (int
		 * i = 0; i < al.size(); i++) { String value = (String)al.get(i);
		 * System.out.println(value); }
		 */ // 세번째장 제네릭 요소의 추가 ---------------------------------------------------

		// HashSet은 중복의 데이터를 허용하지 않는다
		/*
		 * ArrayList<String> al = new ArrayList<String>(); al.add("one"); al.add("two");
		 * al.add("two"); al.add("three"); al.add("three"); al.add("five");
		 * System.out.println("array"); Iterator ai = al.iterator(); while
		 * (ai.hasNext()) { System.out.println(ai.next()); }
		 * 
		 * HashSet<String> hs = new HashSet<String>(); hs.add("one"); hs.add("two");
		 * hs.add("two"); hs.add("three"); hs.add("three"); hs.add("five"); Iterator hi
		 * = hs.iterator(); System.out.println("\nhashset"); while (hi.hasNext()) {
		 * System.out.println(hi.next()); }
		 */ // 세번째 장 ---------------------------------------------------

		// 집합!
		/*
		 * HashSet<Integer> A = new HashSet<Integer>(); A.add(1); A.add(2); A.add(3);
		 * 
		 * HashSet<Integer> B = new HashSet<Integer>(); B.add(3); B.add(4); B.add(5);
		 * 
		 * HashSet<Integer> C = new HashSet<Integer>(); C.add(1); C.add(2);
		 * 
		 * System.out.println(A.containsAll(B)); // false
		 * System.out.println(A.containsAll(C)); // true
		 * 
		 * //A.addAll(B); //합집합 //A.retainAll(B); //교집합 //A.removeAll(B); //A에서B를 뺀 차집합
		 * 
		 * Iterator hi = A.iterator(); //설명해보기! while(hi.hasNext()){
		 * System.out.println(hi.next()); }
		 */ // 다섯번째 집합의 개념 ---------------------------------------------------

		/*
		 * HashMap<String, Integer> a = new HashMap<String, Integer>(); a.put("one", 1);
		 * a.put("two", 2); a.put("three", 3); a.put("four", 4);
		 * System.out.println(a.get("one")); System.out.println(a.get("two"));
		 * System.out.println(a.get("three"));
		 */
		// ------------------------------- HashMap

		List<Computer> computers = new ArrayList<Computer>();
		computers.add(new Computer(500, "egoing"));
		computers.add(new Computer(200, "leezche"));
		computers.add(new Computer(3233, "graphittie"));
		Iterator i = computers.iterator();
		System.out.println("before");
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		Collections.sort(computers);
		System.out.println("\nafter");
		i = computers.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}

class Computer implements Comparable {
	int serial;
	String owner;

	Computer(int serial, String owner) {
		this.serial = serial;
		this.owner = owner;
	}

	public int compareTo(Object o) {
		return this.serial - ((Computer) o).serial;
	}

	public String toString() {
		return serial + " " + owner;
	}
}
