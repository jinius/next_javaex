package employee.dao.oracle;

import domain.employee.Employee;
import employee.dao.IEmployeeDao;

public class EmployeeOracleDao implements IEmployeeDao
{
	@Override
	public void insertEmployee(Employee e)
	{
		System.out.println("insert into ORACLE table with Employee id " + e.getId());
	}

	@Override
	public void deleteEmployee(Employee e)
	{
		System.out.println("delete from ORACLE table with Employee id " + e.getId());
	}

	@Override
	public void updateEmployee(Employee e)
	{
		System.out.println("update into ORACLE table with Employee id " + e.getId());
	}
}
