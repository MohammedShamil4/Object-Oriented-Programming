/*
Create a class ‘Person’ with data members Name, Gender, Address, Age and a constructor to initialize the data members and another class ‘Employee’ that inherits the properties of class Person and also contains its own data members like Empid, Company_name, Qualification, Salary and its own constructor. 
Create another class ‘Teacher’ that inherits the properties of class Employee and contains its own data members like Subject, Department, Teacherid and also contain constructors and methods to display the data members.
Use array of objects to display details of N teachers.
*/




import java.util.*;
class Person{  				//create class Person
	String Name;
	String Gender;
	int Age;
	String Address;
	
	 Person(String gen,String name,int age,String add){ 		//constructor of person
			Gender=gen;
			Name=name;
			Age=age;
			Address=add;
}

}
class Employee extends Person {				//create class Employee that inherit person
	int Empid;
	String Company_name;
	String Qualification;
	double Salary;
	
	Employee(String gen,String name,int age,String add,int id,String c_n,String qu, double sal){			
		super(gen,name,age,add);
		Empid=id;
		Company_name=c_n;
		Qualification=qu;
		Salary=sal;
		


		

	}
	



}

class Teacher extends Employee { 			//create class Teacher that inherit Employee 

	String Sub;
	String Dpt;
	int T_id;
Teacher(String gen,String name,int age,String add,int id,String c_n,String qu, double sal,String dpt,String sub,int tid){
		
                super(gen,name,age,add,id,c_n,qu,sal);
		Sub=sub;
		Dpt=dpt;
		T_id=tid;
		
	
	
	}
	
	

	void display(){  			

	System.out.println("\nName:"+super.Name+"\nGender :"+super.Gender+"\nAge: "+super.Age+"\nAddress: "+super.Address);
	System.out.println("\nEmp id: "+Empid+"\nCompany name:"+Company_name+"\nQualification: "+Qualification+"\nSalary: "+Salary);
		
	System.out.println("\nTearchers id: "+T_id+"\nDepartment: "+Dpt+"\nSubject: "+Sub);
	System.out.println("-------------------------------");
	

		

	}

}

class People {  			//Main class

	public static void main(String args[]){			//main method
			Scanner obj=new Scanner(System.in);
			System.out.print("Enter the no.of Teacher: ");
			int n=obj.nextInt();
			
			// Declaring an array of Teacher
			
			Teacher[] arr=new Teacher[n];		
			
			for(int i=0;i<n;i++){
					System.out.println("\nEnter the details of Teacher "+(i+1)); 		
					System.out.println("------------------------------");
					
					System.out.print("\nEnter Name: ");
					String name=obj.next();
					
					System.out.print("Enter Gender: ");
					String gen=obj.next();
					
					System.out.print("Enter Age: ");
					int age=obj.nextInt();
					
					System.out.print("Enter Address: ");
					String ad=obj.next();
					    
					System.out.print("\nEnter Emp id: ");
					int id=obj.nextInt();
					
					System.out.print("Enter Company name: ");
					String cname=obj.next();
					
					System.out.print("Enter Qualification: ");
					String qu=obj.next();					
					
					System.out.print("Enter Emp salary: ");
					double sal=obj.nextDouble();
					
					System.out.print("\nEnter Tearchers id: ");
					int t_id=obj.nextInt();
					
					System.out.print("Enter Department: ");
					String dep=obj.next();

					System.out.print("Enter Subject: ");
					String sub=obj.next();
					
					arr[i]=new Teacher(gen,name,age,ad,id,cname,qu,sal,dep,sub,t_id); 			
					
					
					System.out.println("-----------------------\n");
					
			}

		for(int j=0;j<n;j++){ 
				System.out.println("---------Details of Teacher-->" +(j+1)+"---------");

				arr[j].display();			
		}
		
		
	}
		
		
}
















/*
OUTPUT:
Enter the no.of Teacher: 2
Enter the details of Teacher 1
------------------------------
Enter Name: manju
Enter Gender: Female
Enter Age: 35
Enter Address: abc
Enter Emp id: 1
Enter Company name: pqr
Enter Qualification: bca
Enter Emp salary: 5000
Enter Tearchers id: 10
Enter Department: bca
Enter Subject: ds
-----------------------
Enter the details of Teacher 2
------------------------------
Enter Name: Sham
Enter Gender: Male
Enter Age: 67
Enter Address: abcd
Enter Emp id: 2
Enter Company name: pqrs
Enter Qualification: mca
Enter Emp salary: 6000
Enter Tearchers id: 20
Enter Department: mca
Enter Subject: ai
-----------------------
---------Details of Teacher-->1---------
Name:manju
Gender :Female
Age: 35
Address: abc
Emp id: 1
Company name:pqr
Qualification: bca
Salary: 5000.0
Tearchers id: 10
Department: bca
Subject: ds
-------------------------------
---------Details of Teacher-->2---------
Name:Sham
Gender :Male
Age: 67
Address: abcd
Emp id: 2
Company name:pqrs
Qualification: mca
Salary: 6000.0
Tearchers id: 20
Department: mca
Subject: ai
-------------------------------
*/
