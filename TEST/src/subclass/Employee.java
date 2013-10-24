package subclass;

public class Employee
{
	String name;
	float salary;
	
	public Employee(String name)
	{
		this.name = name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setSalary(float salary)
	{
		this.salary = salary;
	}

	public String getName()
	{
		return name;
	}

	public float getSalary()
	{
		return salary;
	}

	public String getDetails()
	{
		return "name:" + name + ",salary:" + salary;
	}
}
