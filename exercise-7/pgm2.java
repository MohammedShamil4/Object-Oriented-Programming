//Find the average of N positive integers, raising a user defined exception for each negative input.


import java.util.*;
class myException extends Exception{
	public myException(String s){
		super(s);
	}
}
class pgm2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of items: ");
		int n=sc.nextInt();
		int d;
		int total=0;
		int c=0;
		System.out.println("Enter numbers: ");
		for(int i=0;i<n;i++){
			d = sc.nextInt();
			try{
				if(d>=0){
					c++;
					total=total+d;
				}
				else{
					throw new myException("Negative numbers not allowed");
				}
			}
			catch(myException ex){
				System.out.println(ex.getMessage()+"\n");
			}
		}
			System.out.println("Average of "+c+" positive numbers="+(double)total/c);
	}
}



/*
OUTPUT 1:
Enter the number of items: 
2
Enter numbers: 
1
2
Average of 2 positive numbers=1.5
OUTPUT 2:
Enter the number of items: 
2
Enter numbers: 
1
2
Average of 2 positive numbers=1.5
*/
