package design;

public interface Student {
	
	/*
	Student is an Interface which contains multiple unimplemented methods. Again few methods
	has been declared in below. you need to brainstorm to add more methods to meet the business requirements.
	*/
	//please read the following method and understand the business requirements of these following methods
	//and then implement these in a concrete class.
	
	//studentId() will return student id.
	public int studentId();
	
	//studentName() will return student name
	public String studentName();
	
	//whichDepartment() will assign student to departments
    public void whichDepartment();
	
	//assign student grade based on the totalNumbers()
	public int studentGrade();
	
	//student total numbers in midterm
	public double totalNumbers();

}
