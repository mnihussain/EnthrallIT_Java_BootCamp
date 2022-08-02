package design;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentInfo {
	
 /*This class can be implemented from Student interface then add additional methods in StudentInfo class.
 * Also, Student interface can be implemented into an abstract class. So create an Abstract class
 * then inherit that abstract class into StudentInfo class. Once you're done with designing StudentInfo class,
 * you can get grade by implementing Grading class
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 * Implement Nested class.
 * Use Exception Handling.
 */

	/*
	 * MUST IMPLEMENT
	 * This class should have a method that returns grade
	 */

	/*
	 * declare few static and final fields and some non-static fields
	 * Create more methods if needed
	 * Implement Error/Exception Handling
	 */
	static int examYear;
	
	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public StudentInfo(int studentId){}

    public StudentInfo(String name, int studentId){}
	
	/*
	 * IMPLEMENT IT
	 * Below method should calculate Student total marks. It takes a Map<String, Integer> as a parameter.
	 * So you need to implement the logic to return total marks.
	 */

	public int calculateTotalMark(Map<String, Integer> subjectsAndMarks){
		int total = 0;

		return total;
	}
	
	/*
	 * Below method will store Subject and Mark and return a map. It is implemented already.
	 * use this map for total mark calculation and grading
	 */

	public Map <String, Integer> subjectsAndMarks(){
		Map<String, Integer> subjectsAndMarks = new HashMap <>();
		Scanner sc = new Scanner(System.in);
		for(Subjects subject: Subjects.values()) {
			System.out.println("Subject : "+subject.name()+"\nPlease enter the mark obtained for the "+subject.name()+" in int (example: 88): \nHit ENTER once input");
			String givenMark = sc.nextLine();
			int mark = Integer.parseInt(givenMark.replaceAll("[^0-9]", ""));
			subjectsAndMarks.put(subject.name(), mark);
		}

		return subjectsAndMarks;
	}
}
