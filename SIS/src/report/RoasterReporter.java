package report;

import java.util.ArrayList;

import studentinfo.CourseSession;
import studentinfo.Student;

public class RoasterReporter
{

	public static final String NEWLINE = System.getProperty("line.separator");
	public static final String ROASTER_REPORT_HEADER = "student" + NEWLINE + "-" + NEWLINE;
	public static final String ROSTER_REPORT_FOOTER = NEWLINE + "# student";
	
	CourseSession session;
	public RoasterReporter(CourseSession session)
	{
		this.session = session;
	}

	public String getReport()
	{
		StringBuilder builder = new StringBuilder();
		builder.append(ROASTER_REPORT_HEADER);
		
		ArrayList<Student> list = session.getAllStudents();
		
		for(Student student : session.getAllStudents())
		{
			builder.append(student.getName());
			builder.append(NEWLINE);
		}
		
		builder.append(ROSTER_REPORT_FOOTER);
		builder.append(list.size());
		builder.append(NEWLINE);

		return builder.toString();
	}

}
