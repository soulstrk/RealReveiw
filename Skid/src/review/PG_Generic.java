package review;

public class PG_Generic {

	public static void main(String[] args) {
		/*Box box = new Box();
		box.setObj(new Object());
		Object obj = box.getObj();
		
		box.setObj("hello");
		String str = (String)box.getObj(); // 형변환 필요
		
		box.setObj(1);
		int value = (int)box.getObj();*/ //제너릭 지정 X
		
		Box<Object> box = new Box<>();
		box.setObj(new Object());
		Object obj = box.getObj();
		
		Box<String> box2 = new Box<>();
		box2.setObj("34");
		box2.getObj();
		
		Box<Integer> box3 = new Box<>();
		box3.setObj(4);
		int v2 = box3.getObj(); // 제너릭 사용
	}

}

class Box<E>{
	private E obj;
	
	public void setObj(E obj) {
		this.obj = obj;
	}
	
	public E getObj() {
		return obj;
	}
}
