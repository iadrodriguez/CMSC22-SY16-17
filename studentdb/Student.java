public class Student {

	private String studentNumber;
	private String firstName;
	private char middleInitial;
	private String lastName;
	private String course;
	private int yearLevel;

	public Student(String studentNumber, String firstName, char middleInitial, String lastName, String course, int yearLevel) {
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.course = course;
		this.yearLevel = yearLevel;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setMiddleInitial(char middleInitial) {
		this.middleInitial = middleInitial;
	}

	public char getMiddleInitial() {
		return middleInitial;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCourse() {
		return course;
	}

	public void setYearLevel(int yearLevel) {
		this.yearLevel = yearLevel;
	}

	public int getYearLevel() {
		return yearLevel;
	}

	public String toString() {
		return "Student Number: " + studentNumber + "\n" +
				"First Name: " + firstName + "\n" +
				"Middle Initial: " + middleInitial + "\n" +
				"Last Name: " + lastName + "\n" +
				"Program: " + course + "\n" +
				"Year Level: " + yearLevel + "\n";
	}

}