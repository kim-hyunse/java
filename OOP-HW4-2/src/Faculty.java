
public class Faculty extends Employee {

	private String facultyTitle;

	public Faculty()// constructor
	{
		super();// ��� ����
		facultyTitle = "not yet";
	}

	public Faculty(String initialName, String initialemployeeDepartment, int initialemployeeID,
			String initialfacultyTitle) {// ������ overloading
		super(initialName, initialemployeeDepartment, initialemployeeID);
		facultyTitle = initialfacultyTitle;
	}

	public void reset(String newName, String initialemployeeDepartment, int initialemployeeID,
			String initialfacultyTitle) {// �����ϱ�
		super.reset(newName, initialemployeeDepartment, initialemployeeID);
		setfacultyTitle(initialfacultyTitle);
	}

	public String getfacultyTitle() {// accessors
		return facultyTitle;
	}

	public void setfacultyTitle(String newfacultyTitle) {// mutators
		facultyTitle = newfacultyTitle;
	}

	public void writeOutput() {// ��� ���

		super.writeOutput();
		System.out.println("Title " + facultyTitle);
	}

}
