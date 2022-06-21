
public class Faculty extends Employee {

	private String facultyTitle;

	public Faculty()// constructor
	{
		super();// 상속 받음
		facultyTitle = "not yet";
	}

	public Faculty(String initialName, String initialemployeeDepartment, int initialemployeeID,
			String initialfacultyTitle) {// 생성자 overloading
		super(initialName, initialemployeeDepartment, initialemployeeID);
		facultyTitle = initialfacultyTitle;
	}

	public void reset(String newName, String initialemployeeDepartment, int initialemployeeID,
			String initialfacultyTitle) {// 리셋하기
		super.reset(newName, initialemployeeDepartment, initialemployeeID);
		setfacultyTitle(initialfacultyTitle);
	}

	public String getfacultyTitle() {// accessors
		return facultyTitle;
	}

	public void setfacultyTitle(String newfacultyTitle) {// mutators
		facultyTitle = newfacultyTitle;
	}

	public void writeOutput() {// 결과 출력

		super.writeOutput();
		System.out.println("Title " + facultyTitle);
	}

}
