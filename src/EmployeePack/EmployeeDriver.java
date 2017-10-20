package EmployeePack;

import java.text.ParseException;
import java.util.Scanner;
/*Name: Anupom Roy
 *Id  : 300853516
 *Centennial College
 *	Driver Class
 * */
public class EmployeeDriver 
{

	public static void main(String[] args) 
	{
		//Static Variable
		String name, address; 
		String dob, hiredDate; 
		int salary;
		
		Employee newEmp=new Employee();
		
		//Prompting the User to enter Info
		Scanner input= new Scanner (System.in);
		System.out.println("\nPlease Enter the name of the New Employee : ");
		name=input.nextLine();
		System.out.println("\nPlease Enter the New Employee Address  : ");
		address=input.nextLine();
		System.out.println("\nPlease Enter the New Employee's Date of Birth (MM/DD/YYYY) : ");
		dob=input.nextLine();		
		//repeats the date for verification
		newEmp.inputVerification(dob);
		System.out.println("\nPlease Enter the Date that  Employee Hired (MM/DD/YYYY) : ");
		hiredDate=input.nextLine();
		//repeats the date for verification
		newEmp.inputVerification(hiredDate);
		System.out.println("\nPlease Enter the New Employee's Salary : ");
		salary=input.nextInt();
		/*try 
			{
			salary=input.nextInt();
			}
		catch(Exception e) {
    		System.out.println("Invalid  format of Date");
    	    //handle exception if date is not in "dd-MMM-yyyy" format
    	}*/

		
		
		Employee empl=new Employee(name, address, dob,hiredDate,salary);
		System.out.println("\nThe Data for the New Employee as Entered: ");
		System.out.println(empl.PrintEmployee());
		
		

	}
	 

}
