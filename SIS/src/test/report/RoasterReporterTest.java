package test.report;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;

import report.RoasterReporter;
import studentinfo.Student;
import studentinfo.CourseSession;

public class RoasterReporterTest
{

	@Test
	public void testRoasterReporter()
	{
		CourseSession session = new CourseSession("ENGL", "101", createDate(2003, 1, 6));
		session.enroll(new Student("A"));
		session.enroll(new Student("B"));
		
		String report = new RoasterReporter(session).getReport();
		System.out.println(report);
		assertEquals(RoasterReporter.ROASTER_REPORT_HEADER + "A" +
			RoasterReporter.NEWLINE + "B" + RoasterReporter.NEWLINE +
			RoasterReporter.ROSTER_REPORT_FOOTER + 2 + RoasterReporter.NEWLINE,
			report);
	}
	
	public Date createDate(int year, int month, int day)
	{
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.DATE, day);
		
		return calendar.getTime();
	}

}
