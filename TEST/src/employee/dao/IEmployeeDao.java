package employee.dao;

import domain.employee.Employee;

public interface IEmployeeDao
{
	public void insertEmployee(Employee e);
	public void deleteEmployee(Employee e);
	public void updateEmployee(Employee e);
}
