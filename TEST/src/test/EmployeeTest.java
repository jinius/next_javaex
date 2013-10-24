package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import subclass.Circle;
import subclass.Employee;
import subclass.Manager;
import subclass.Rectangle;
import subclass.Shape;
import subclass.Triangle;

public class EmployeeTest
{

	@Test
	public void testEmployee()
	{
		Employee e = new Employee("James");
		e.setName("James");
		e.setSalary(1000.0f);
		
		assertEquals("James", e.getName());
		// assertEquals(1000.f, e.getSalary());
	}

	@Test
	public void testManager()
	{
		Employee e = new Manager("Tomas", "Personal");
		e.setName("Tomas");
		e.setSalary(2000.0f);
		
		assertEquals("Tomas", e.getName());
		// assertEquals(2000.f, e.getSalary());
		System.out.println(e.getDetails());
	}
	
	@Test
	public void testShape()
	{
		Shape s = new Circle();
		assertEquals("draw Circle", s.drawShape(new Circle()));
		assertEquals("draw Rectangle", s.drawShape(new Rectangle()));
		assertEquals("draw Triangle", s.drawShape(new Triangle()));
	}
	
	@Test
	public void testArrayList()
	{
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(new String("Edward"));
		list.add(new Integer(100));
		
		for ( int i = 0; i < list.size(); i++ )
		{
			Object obj = list.get(i);
			if ( obj instanceof String )
			{
				String str = (String)obj;
				assertEquals("Edward", str);
			}
			else if ( obj instanceof Integer )
			{
				Integer val = (Integer)obj;
				assertEquals(new Integer(100), val);
			}
		}
	}

}
