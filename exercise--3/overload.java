//find the area of different shapes using overloaded function
import java.util.*;
class overloadDemo {
                                      void shape(int a) {
                                                        System.out.println("Area of the square is  : "+a*a);
                                                                     }
                                      void shape(int a,int b) {
                                                        System.out.println("Area of the rectangle is  : "+a*b);
                                                                     }
                                      void shape(double a) {
                                                        System.out.println("Area of the circle is  : "+3.14*a*a); 
                                                                     }
                                  }
class overload {
                         public static void main(String args[]){
                                     overloadDemo ob=new overloadDemo();
                                     Scanner in=new Scanner(System.in);
                                                                   
                                     System.out.println("enter an option \n1.square 2.rectangle 3.circle"); 
                                     int c=in.nextInt();

                                                   if (c==1) {
                                                                   System.out.println("enter the side of the square" ); 
                                                                   int s=in.nextInt();
                                                                   ob.shape(s); }
                                                  else if(c==2) {
                                                                    System.out.println("enter the length and breadth of the rectangle" ); 
                                                                    int l=in.nextInt();
                                                                    int b=in.nextInt();
                                                                     ob.shape(l,b); }
                                                  else if (c==3) {
                                                                    System.out.println("enter the radius of the circle" ); 
                                                                    double r=in.nextDouble();
                                                                     ob.shape(r);}
                                                   else
                                                                     System.out.println("invalid input"); 
                                                                              
                                                                                       }

                        }


/* output

enter an option
1.square 2.rectangle 3.circle
1
enter the side of the square
3
Area of the square is  : 9

enter an option
1.square 2.rectangle 3.circle
2
enter the length and breadth of the rectangle
4
5
Area of the rectangle is  : 20

enter an option
1.square 2.rectangle 3.circle
3
enter the radius of the circle
4
Area of the circle is  : 50.24
*/