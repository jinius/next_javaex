package employee.web;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import domain.employee.Employee;
import employee.dao.EmployeeDaoFactory;
import employee.dao.IEmployeeDao;

public class EmployeeClient
{

	public EmployeeClient()
	{
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream instream = new FileInputStream("db.properties");
		prop.load(instream);
		
		String dbType = prop.getProperty("dbtype");
		System.out.println("DB Type : " + dbType);

		Employee e = new Employee(1001, "James", 10000.0f);
		EmployeeDaoFactory daoFactory = new EmployeeDaoFactory(dbType);
		IEmployeeDao dao = daoFactory.createInstance();
		dao.insertEmployee(e);
		dao.deleteEmployee(e);
		dao.updateEmployee(e);
	}

}
