package test.studentinfo;

import studentinfo.Student;
import junit.framework.TestCase;

public class StudentTest extends TestCase
{
	public void testCreate()
	{
		final String firstStudentName = "Kim Sung-hwan";
		Student student1 = new Student(firstStudentName);
		assertEquals(firstStudentName, student1.getName());
		
		final String secondStudentName = "Sung-hwan Kim";
		Student student2 = new Student(secondStudentName);
		assertEquals(secondStudentName, student2.getName());
	}
}
