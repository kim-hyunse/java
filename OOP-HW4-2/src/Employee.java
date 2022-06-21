
public class Employee extends Person {

	private int employeeID;
	private String employeeDepartment;

	public Employee()// constructor
	{
		super();// ��� ����
		employeeID = 0;
		employeeDepartment = "not yet";
	}

	public Employee(String initialName, String initialemployeeDepartment, int initialemployeeID) {// ������ overloading
		super(initialName);
		employeeID = initialemployeeID;
		employeeDepartment = initialemployeeDepartment;
	}

	public void reset(String newName, String initialemployeeDepartment, int initialemployeeID) {// ����
		setName(newName);
		employeeID = initialemployeeID;
		employeeDepartment = initialemployeeDepartment;
	}

	public int getemployeeID() {// accessors
		return employeeID;
	}

	public String getemployeeDepartment() {// accessors
		return employeeDepartment;
	}

	public void setemployeeID(int newemployeeID) {// mutators
		employeeID = newemployeeID;
	}

	public void setemployeeDepartment(String newemployeeDepartment) {// mutators
		employeeDepartment = newemployeeDepartment;
	}

	public void writeOutput() {// ��� ���
		System.out.println("Name: " + getName());
		System.out.println("employee ID " + getemployeeID());
		System.out.println("employee Department " + getemployeeDepartment());
	}

}
