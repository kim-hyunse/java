
public class Student extends Person {
	private int studentNumber;
	public Student() {
		super();
		studentNumber=0;	
	}
	public Student(String initialName,int initialStudentNumber) {
		super(initialName);
		studentNumber=initialStudentNumber;
	}
	public void reset(String newName,int newStudentNumber) {	
		setName(newName);
		studentNumber =newStudentNumber;
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int newStudentNumber) {
		 studentNumber=newStudentNumber;
	}

}
