package design;

public class Grading {

	/*
	 * You must use this class to return grade in a method
	 */
	Grades grade;
	int totalMarks;

	public Grading(int totalMarks){
		/*
		 * Establish a relation between instance variables to local variables
		 */
	}

	/*
	 * This method calculate grade based on the totalMarks given through parameterized constructor
	 * Write a Switch case based on totalMarks and assign grade variable accordingly
	 */
	public String whichGrade(){
		//switch (totalMarks)
		//and assign grades
		return grade.getGradeValue();
	}

}
