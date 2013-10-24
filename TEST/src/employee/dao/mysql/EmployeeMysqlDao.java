package employee.dao.mysql;

import domain.employee.Employee;
import employee.dao.IEmployeeDao;

public class EmployeeMysqlDao implements IEmployeeDao
{
	@Override
	public void insertEmployee(Employee e)
	{
		System.out.println("insert into MySQL table with Employee id " + e.getId());
	}

	@Override
	public void deleteEmployee(Employee e)
	{
		System.out.println("delete from MySQL table with Employee id " + e.getId());
	}

	@Override
	public void updateEmployee(Employee e)
	{
		System.out.println("update into MySQL table with Employee id " + e.getId());
	}

}
