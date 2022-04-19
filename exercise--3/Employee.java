//Program to create a class for Employee having attributes eNo, eName eSalary. Read n employ information and Search for an employee given eNo, using the concept of Array of Objects


import java.util.*;
class Search{

		int linear(int arr[],int item,int len){
		int j=0;
		while(j<len){
			if(arr[j]==item){
				return j;
			}
			j++;
		}
		return -1;
		
	
	
	}

}
class Employee{
	int eno;			//initialise variables
	String eName;
	double eSalary;
	
	
	void setData(int eno,String name,double salary){
			this.eno=eno;
			this.eName=name;      
			this.eSalary=salary;
	
	}
	void disp(){  		//method for display the details
			
			System.out.println("Employee no: "+eno+"\nEmployee Name: "+eName+"\nSalary:"+eSalary+"\n");
	
	}
	
	public static void main(String ar[]){
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter the no.of employees:");
			int n=obj.nextInt();
			Search s= new Search();

			// Declaring an array of Employee
			Employee[] arr;
			arr=new Employee[n];		// Allocating memory for n objects of type Employee
			int array[]=new int[n];
			for(int i=0;i<n;i++){
					System.out.println("Enter the details of employee "+(i+1));
					
					System.out.print("Enter employee no: ");
					int en=obj.nextInt();
					
					System.out.print("\nEnter employee name: ");
					String name=obj.next();
					
					System.out.print("\nEnter employee salary: ");
					double sal=obj.nextDouble();
					
					arr[i]=new Employee();
					arr[i].setData(en,name,sal);
					array[i]=en;
					System.out.println("-----------------------------\n");
					
			}
			
			
			
			do
			{
					System.out.println("\n1.Search \n2.exit");
					System.out.println("Select your option: ");
					int opt =obj.nextInt();
					
					System.out.println("-----------------------------\n");
					
					switch(opt){
						case 1:System.out.println("Searching....!");
							   System.out.println("Enter the employee no. to search:");
							   int emp_no=obj.nextInt();
							   int result= s.linear(array,emp_no,n);
							   if(result==-1){
									System.out.println("No employee exists for this number");
							   }
							   else{
									arr[result].disp();
				
								}
								System.out.println("-----------------------------\n");
								break;
						case 2: System.out.println("Exiting....!");
								System.exit(0);
								break;
								
					
					
					}
					
			
			}while(true);
			
			
			
	}

}

/*
OUTPUT:
Enter the no.of employees:
2
Enter the details of employee 1
Enter employee no: 1
Enter employee name: Anamika
Enter employee salary: 25000
-----------------------------
Enter the details of employee 2
Enter employee no: 2
Enter employee name: Jiffin
Enter employee salary: 35000
-----------------------------
1.Search
2.exit
Select your option:
1
-----------------------------
Searching....!
Enter the employee no. to search:
1
Employee no: 1
Employee Name: Anamika
Salary:25000.0
-----------------------------
1.Search
2.exit
Select your option:
1
-----------------------------
Searching....!
Enter the employee no. to search:
2
Employee no: 2
Employee Name: Jiffin
Salary:35000.0
-----------------------------
1.Search
2.exit
Select your option:
1
-----------------------------
Searching....!
Enter the employee no. to search:
3
No employee exists for this number
-----------------------------
1.Search
2.exit
Select your option:
2
-----------------------------
Exiting....!
*/