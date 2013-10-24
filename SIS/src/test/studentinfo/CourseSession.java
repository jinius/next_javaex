package test.studentinfo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import studentinfo.Student;

public class CourseSession
{
	String 	department;
	String 	code;
	int		numberOfStudent = 0;
	private	Date startDate;
	ArrayList<Student> studentList = new ArrayList<Student>();
	
	public CourseSession(String department, String code)
	{
		this.department = department;
		this.code = code;
	}

	public CourseSession(String department, String code, Date startDate)
	{
		this.department = department;
		this.code = code;
		this.startDate = startDate;
	}

	public String getDepartment()
	{
		return this.department;
	}

	public String getNumber()
	{
		return this.code;
	}

	public void enroll(Student student1)
	{
		studentList.add(student1);
		++this.numberOfStudent;
	}

	public Object getNumberOfStudents()
	{
		return this.numberOfStudent;
	}
	
	public ArrayList<Student> getAllStudents()
	{
		return studentList;
	}

	public Date getEndDate()
	{
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(startDate);
		int afterDays = 16 * 7 - 3;
		calendar.add(Calendar.DAY_OF_YEAR, afterDays);
		Date endDate = calendar.getTime();

		return endDate;
	}
}
