package my.jdbc;

import java.sql.SQLException;

import my.jdbc.dao.EmployeeDao;
import my.jdbc.dao.EmployeeDaoImpl;
import my.jdbc.model.Employee;

/*

1st :- Create the Connection.


*/
public class Main {

	public static void main(String[] args) throws SQLException {
		

//		Employee e = new Employee(9, 44444, "Kunal singh", "kunal123@gmail.com");
//		String str="Ducat";
//
		EmployeeDao empDao = new EmployeeDaoImpl();
//		empDao.saveEmployee(e);
		
//		empDao.updateEmployee(e);
		
//		empDao.deleteAnEmployee(9);
		
//		empDao.printAllEmployee();
		
//		Employee emp = empDao.getEmpById(3);
//		System.out.println(emp);
		
//		System.out.println(empDao.getAllEmps());
		System.out.println(empDao.getEmpByName("tddud' or '1 = 1"));
		
		System.out.println("Main.main()");
	
	}

}
