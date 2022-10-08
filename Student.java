/*
	Given the partial code for the class Student that contains 3 attributes: name, studentNumber and course.
	You are to provide the setter and getter methods as well as the body of the constructor that has a missing body.
	You are also required to provide an implementation to the method showStudentInformation() so that once it is 
	called it should display the name, studentNumber and course of the Student object.
*/   

public class Student
{
	private String name;
	private int studentNumber;
	private String course;

	// this is constructor #1 - no need to add anything here
	public Student()
	{}

	// this is constructor #2 - you have to provide the body of this constructor
	public Student(String name, int studentNumber, String course)
	{
		// complete the body of this constructor
		setName(name);
		setStudentNumber(studentNumber);
		setCourse(course);
	}

	// put your setters here
	public void setName(String name){
		this.name = name;
	}
	public void setStudentNumber(int studentNumber){
		this.studentNumber = studentNumber;
	}
	public void setCourse(String course){
		this.course = course;
	}

	// put your getters here
	public String getName(){
		return name;
	}
	public int getStudentNumber(){
		return studentNumber;
	}
	public String getCourse(){
		return course;
	}

	public void showStudentInformation()
	{
		// this method should display the name, studentNumber and the course of the student object.
		System.out.println();
		System.out.println("Name: " + name);
		System.out.println("Student No: " + studentNumber);
		System.out.println("Course: " + course);
	}
}
