//Create a class ‘Employee’ with data members Empid, Name, Salary, Address and constructors to initialize the data members.
//Create another class ‘Teacher’ that inherit the properties of class employee and contain its own data members department, Subjects taught and constructors to initialize these data members and also include display function to display all the data members.
//Use array of objects to display details of N teachers.

import java.util.*;

class Employee
{

	int empid;
	String name;
	float salary;
	String address;

	Employee()
	{
		
	}


	Employee(int id, String nm, float sal, String addr)
	{
		empid=id;
		name=nm;
		salary=sal;
		address=addr;
	}

}


class Teacher extends Employee
{

	String department;
	String subject;

	Teacher(int id, String nm, float sal, String addr, String dept, String sub)
	{
	
		empid=id;
		name=nm;
		salary=sal;
		address=addr;
		department=dept;
		subject=sub;
	}
	

void display()
{
	System.out.println("Employee id : "+empid);
	System.out.println("Employee name : "+name);
	System.out.println("Employee salary : "+salary);
	System.out.println("Employee address : "+address);
	System.out.println("Department of teacher : "+department);
	System.out.println("Subject of teacher : "+subject);
}

}




class EmpTchr
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of teachers : ");
		int n = in.nextInt();

		Teacher[] obj = new Teacher[n];
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter employee id : ");	
			int id = in.nextInt();
			System.out.println("Enter employee name : ");	
			String nm = in.next();
			System.out.println("Enter salary : ");	
			float sal = in.nextFloat();
			System.out.println("Enter address : ");	
			String addr = in.next();
			System.out.println("Enter department : ");	
			String dept = in.next();
			System.out.println("Enter subject : ");	
			String sub = in.next();
			obj[i] = new Teacher(id, nm, sal, addr, dept, sub);
		}
		System.out.println("-----------------Recorded details of employee-------------------");	
		for (int i=0; i<n; i++)
		{
			
			obj[i].display();
		}
}
}











/*
OUTPUT: 
Enter the number of teachers : 
2
Enter employee id : 
1
Enter employee name : 
anju
Enter salary : 
50000
Enter address : 
abc
Enter department : 
mca
Enter subject : 
ai
Enter employee id : 
2
Enter employee name : 
sabu
Enter salary : 
70000
Enter address : 
abcd
Enter department : 
mca
Enter subject : 
java
-----------------Recorded details of employee-------------------
Employee id : 1
Employee name : anju
Employee salary : 50000.0
Employee address : abc
Department of teacher : mca
Subject of teacher : ai
Employee id : 2
Employee name : sabu
Employee salary : 70000.0
Employee address : abcd
Department of teacher : mca
Subject of teacher : java
*/
