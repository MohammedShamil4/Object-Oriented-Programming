//Write a user defined exception class to authenticate the user name and password.



import java.util.*;
class myException extends Exception{
	public myException(String s){
		super(s);
	}
}
class pgm1{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Username: ");
		String username=sc.next();
		System.out.print("Enter Password: ");
		String password=sc.next();
		System.out.println("-------------------\n");
		System.out.print("Confirm Username: ");
		String u=sc.next();
		System.out.print("Confirm Password: ");
		String p=sc.next();
		try{
			if((u.equals(username)) && (p.equals(password))){
				throw new myException("Authentication success");
			}
			else{
				throw new myException("Authentication Failed...!");
			}
		}
		catch(myException ex){
			System.out.print(ex.getMessage()+"\n");
		}
	}
}

/*
OUTPUT 1:
Enter Username: reema
Enter Password: 123
-------------------
Confirm Username: reema
Confirm Password: 123
Authentication success
OUTPUT 2:
Enter Username: reema
Enter Password: 123
-------------------
Confirm Username: abc
Confirm Password: 123
OUTPUT 3;
Enter Username: reema 
Enter Password: 123
-------------------
Confirm Username: reema 
Confirm Password: abc  
Authentication Failed...!
*/
