package employee.dao.mssql;

import domain.employee.Employee;
import employee.dao.IEmployeeDao;

public class EmployeeMssqlDao implements IEmployeeDao
{
	@Override
	public void insertEmployee(Employee e)
	{
		System.out.println("insert into MSSQL table with Employee id " + e.getId());
	}

	@Override
	public void deleteEmployee(Employee e)
	{
		System.out.println("delete from MSSQL table with Employee id " + e.getId());
	}

	@Override
	public void updateEmployee(Employee e)
	{
		System.out.println("update into MSSQL table with Employee id " + e.getId());
	}

}
