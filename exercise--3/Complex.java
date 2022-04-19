//Add two complex numbers


import java.util.*;

class Complex{
		int real;
		int imag;
		Complex(int r,int i){ 		//constructor for seting data
			 this.real=r;
			 this.imag=i;
		}
		static Complex complexAdd(Complex c1,Complex c2){		 //Method for add two complex numbers
				Complex temp =new Complex(0,0);
				temp.real=c1.real+c2.real;
				temp.imag=c1.imag+c2.imag;
				return temp;
		
		
		} 
		static void showComp(Complex tmp){ 		 //display method
				System.out.println(tmp.real+"+i"+tmp.imag);
		
		
		}
		public static void main(String args[]){
				Scanner obj=new Scanner(System.in);
				System.out.println("Complex Number 1");
				System.out.print("Enter real part: ");
				int r=obj.nextInt();
				System.out.print("Enter imaginary part: ");
				int i=obj.nextInt();
				Complex c= new Complex(r,i);
				System.out.print("\nComplex Number 1 => ");
				showComp(c);
				System.out.println("---------------------------");
				
				
				
				System.out.println("Complex Number 2");
				System.out.print("Enter real part: ");
				int r1=obj.nextInt();
				System.out.print("Enter imaginary part: ");
				int i1=obj.nextInt();
				Complex c1= new Complex(r1,i1);
				System.out.print("\nComplex Number 2 => ");
				showComp(c1);
				System.out.println("----------------------------");
				
				
				Complex tmp=new Complex(0,0);
				tmp=complexAdd(c,c1);
				System.out.print("\nResult: ");
				
				showComp(tmp);
				
				
		
		
		}


}



/*
OUTPUT:
Complex Number 1
Enter real part: 1
Enter imaginary part: 0
Complex Number 1 => 1+i0
---------------------------
Complex Number 2
Enter real part: 5
Enter imaginary part: 9
Complex Number 2 => 5+i9
----------------------------
Result:6+i9
*/