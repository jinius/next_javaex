package employee.dao;

import employee.dao.mssql.EmployeeMssqlDao;
import employee.dao.mysql.EmployeeMysqlDao;
import employee.dao.oracle.EmployeeOracleDao;

public class EmployeeDaoFactory
{
	private String dbType;

	public EmployeeDaoFactory( String dbType )
	{
		this.dbType = dbType;
	}
	
	public IEmployeeDao createInstance()
	{
		if ( dbType.equalsIgnoreCase("ORACLE") )
			return new EmployeeOracleDao();

		if ( dbType.equalsIgnoreCase("MySQL") )
			return new EmployeeMysqlDao();

		if ( dbType.equalsIgnoreCase("MSSQL") )
			return new EmployeeMssqlDao();

		return null;
	}

}
