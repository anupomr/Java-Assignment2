package EmployeePack;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*Name: Anupom Roy
 *Id  : 300853516
 *Centennial College
 *	Object Class
 * */
public class Employee 
{
	//Instance Variable
	String empName, empAddress; 
	String dateOfBirth, hiredDate; 
	int annualSalary;

	// Constructor with argument
	public  Employee() 
	{
		
	}
	
	// Constructor with argument
	public  Employee(String empName, String address, 
	String dateOfBirth, String hiredDate, 
	int salary) 
	{
		this.empName=empName;
		this.empAddress=address; 
		this.dateOfBirth=dateOfBirth; 
		this.hiredDate=hiredDate; 
		this.annualSalary=salary;
	}
	public String PrintEmployee()
	{
		String displayEmp="Employee Name: "+empName+
						"\nEmpl Address : "+empAddress+
						"\nBirth Date   : "+dateOfBirth+
						"\nDate hired   : "+hiredDate+
						"\nYearly Salary: "+annualSalary;
		return displayEmp;
	}
	public void inputVerification(String dateInString) 
	 {
		 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	    	try {
	    	    Date date = formatter.parse(dateInString);
	    	    System.out.println(date);
	    	    
	    	} catch (ParseException e) {
	    		System.out.println("Invalid  format of Date");
	    	    //handle exception if date is not in "dd-MMM-yyyy" format
	    	}

	 }

}
