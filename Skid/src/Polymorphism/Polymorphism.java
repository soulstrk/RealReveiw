package Polymorphism;

class Employee {
	String name, id;

	public Employee(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public void gotoOffice() {
		System.out.println(name + "님 출근하였습니다...");
	}

	public void gotoHome() {
		System.out.println(name + "님 퇴근하였습니다...");
	}

	public void startJob() {
	}
}

class Programmer extends Employee {
	// 기술자 등급 1, 2, 3, 4
	private int techGrade;

	public Programmer(String newName, String newID, int newTechGrade) {
		super(newName, newID);
		this.techGrade = newTechGrade;
	}

	public void startJob() {
		System.out.println(super.name + " 님이 S/W개발업무를 시작합니다.");
	}

	public void dispGrade() {
		System.out.println(super.name + " 님의 기술자 등급은 " + techGrade + " 입니다.");
	}
}

class ProgrammerChief extends Programmer {
	private String part; // 업무파트

	public ProgrammerChief(String newName, String newID, int newTechGrade, String newPart) {
		super(newName, newID, newTechGrade);
		this.part = newPart;
	}

	// 영업팀장의 업무는 더이상 확장이 안된다는 의미, 상속안된다는 의미
	// Programmer Class의 메소드 재정의
	final public void startJob() {
		System.out.println(super.name + "님이 프로그램 개발팀 직원을 관리합니다.");
	}

	public void dispPart() {
		System.out.println(super.name + " 님이 맡고 있는 파트는 " + this.part + " 입니다.");
	}
}

class Designer extends Employee {
	private String majorTech; // 주 사용기술

	public Designer(String newName, String newID, String newMajorTech) {
		super(newName, newID);
		this.majorTech = newMajorTech;
	}

	public void startJob() {
		System.out.println(super.name + " 님이 디자인 업무를 시작 합니다.");
	}

	public void dispMajorTech() {
		System.out.println(super.name + " 님의 주 사용기술은 " + majorTech + " 입니다.");
	}
}

public class Polymorphism {
	public static void main(String args[]) {
		// p1, d1, pc1 같은 Employee Type의 startJob이지만 다른 결과를 나타내죠
		// 이게 다형성 입니다.
		Employee p1 = new Programmer("안철수", "12346", 3);
		Employee d1 = new Designer("안정환", "23256", "플래쉬");
		Employee pc1 = new ProgrammerChief("홍길동", "12335", 1, "윈도우개발");
		p1.startJob();
		d1.startJob();
		pc1.startJob();
	}
}
