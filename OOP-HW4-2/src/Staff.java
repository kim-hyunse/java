
public class Staff extends Employee {

	private int staffPay;

	public Staff()// constructor
	{
		super();// ���
		staffPay = 0;
	}

	public Staff(String initialName, String initialemployeeDepartment, int initialemployeeID, int initialstaffPay) {// ������
																													// overloading
		super(initialName, initialemployeeDepartment, initialemployeeID);
		staffPay = initialstaffPay;
	}

	public void reset(String newName, String initialemployeeDepartment, int initialemployeeID, int initialstaffPay) {// ����
		super.reset(newName, initialemployeeDepartment, initialemployeeID);
		setstaffPay(initialstaffPay);
	}

	public int getstaffPay() {// accessors
		return staffPay;
	}

	public void setstaffPay(int initialstaffPay) {// mutators
		if (1 <= initialstaffPay && initialstaffPay <= 20) {
			staffPay = initialstaffPay;// ���� 1~20 ���̿� �ִ� �� Ȯ���ϱ�
		} else {
			System.out.println("WRONG RANGE");
			System.exit(0);
		}
	}

	public void writeOutput() {// ��� ���

		super.writeOutput();
		System.out.println("staff Pay " + staffPay);
	}

}
