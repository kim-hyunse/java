
public class Staff extends Employee {

	private int staffPay;

	public Staff()// constructor
	{
		super();// 상속
		staffPay = 0;
	}

	public Staff(String initialName, String initialemployeeDepartment, int initialemployeeID, int initialstaffPay) {// 생성자
																													// overloading
		super(initialName, initialemployeeDepartment, initialemployeeID);
		staffPay = initialstaffPay;
	}

	public void reset(String newName, String initialemployeeDepartment, int initialemployeeID, int initialstaffPay) {// 리셋
		super.reset(newName, initialemployeeDepartment, initialemployeeID);
		setstaffPay(initialstaffPay);
	}

	public int getstaffPay() {// accessors
		return staffPay;
	}

	public void setstaffPay(int initialstaffPay) {// mutators
		if (1 <= initialstaffPay && initialstaffPay <= 20) {
			staffPay = initialstaffPay;// 값이 1~20 사이에 있는 지 확인하기
		} else {
			System.out.println("WRONG RANGE");
			System.exit(0);
		}
	}

	public void writeOutput() {// 결과 출력

		super.writeOutput();
		System.out.println("staff Pay " + staffPay);
	}

}
