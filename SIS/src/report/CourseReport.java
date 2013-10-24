package report;

import java.util.ArrayList;

import test.studentinfo.CourseSession;

public class CourseReport
{
	ArrayList<CourseSession> sessions = new ArrayList<CourseSession>();
	
	public void add(CourseSession session) {
		sessions.add(session);
	}
	
	public String text() {
		StringBuilder builder = new StringBuilder();
		
		for( CourseSession session : sessions ) {
			builder.append(session.getDepartment());
			builder.append(" ");
			builder.append(session.getNumber());
//			builder.append(StringUtil.NEWLINE);
		}
		return builder.toString();
	}
	
	public String textSort() {
		StringBuilder builder = new StringBuilder();
		
//		Collections.sort(sessions);
		
		for( CourseSession session : sessions ) {
			builder.append(session.getDepartment());
			builder.append(" ");
			builder.append(session.getNumber());
//			builder.append(StringUtil.NEWLINE);
		}
		
		return null;
	}
}
