package test.studentinfo;

import java.util.Date;

import studentinfo.CourseSession;
import studentinfo.Student;
import junit.framework.TestCase;

public class CourseSessionTest extends TestCase
{
	CourseSession session;
	Date startDate;

	@Override
	public void setUp()
	{
		int year	= 103;
		int month	= 0;
		int date	= 6;
		
		startDate = new Date(year, month, date);
		session = new CourseSession("ENGL", "101", startDate);
	}

	public void testCreate()
	{
		assertEquals("ENGL", session.getDepartment());
		assertEquals("101", session.getNumber());
		
		Student student1 = new Student("Kim Sung-hwan");
		session.enroll(student1);
		assertEquals(1, session.getNumberOfStudents());
		
		Student student2 = new Student("Sung-hwan Kim");
		session.enroll(student2);
		assertEquals(2, session.getNumberOfStudents());
	}
	
	public void testCourseDates()
	{
		int year = 103;
		int month = 3;
		int date = 25;

		Date sixteenWeeksOut = new Date( year, month, date );
		assertEquals( sixteenWeeksOut, session.getEndDate() );
	}
}
