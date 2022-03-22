//program to find the number of days in a month for a given year.Check Leap year also.
import java.util.*;

class leapyr
{
 public static void main (String args[])
{
Scanner input=new Scanner(System.in);
System.out.print("enter the year : "); 
int y=input.nextInt();
System.out.println("  \n1.January 2.February 3.March 4.April 5.May 6.June 7.July 8.August 9.September 10.October 11.November 12.December "); 
System.out.print("choose  month  to see number of days from (1-12) : "); 
int m=input.nextInt();
int s;
if ((y % 400==0) || (y %100!=0) && (y%4==0))
{
s=1;
System.out.println(y+" is a leap year "); 
 }
else
{
s=0;
System.out.println(y+" is not leap year "); 
}
switch(m)
{  
         case 1:
         System.out.print("January have 31 days");
         break;

        case 2:
          if (s==0)
            {
            System.out.print("February have 28 days");
            }
         else
            { 
            System.out.print("February have 29 days");
            }
         break;
case 3:
         System.out.print("March have 31 days");
         break;
case 4:
         System.out.print("April have 30 days");
         break;
case 5:
         System.out.print("May have 31 days");
         break;
case 6:
         System.out.print("June have 30 days");
         break;
case 7:
         System.out.print("July have 31 days");
         break;
case 8:
         System.out.print("August have 31 days");
         break;
case 9:
         System.out.print("September have 30 days");
         break;
case 10:
         System.out.print("October have 31 days");
         break;
case 11:
         System.out.print("November  have 30 days");
         break;
case 12:
         System.out.print("December have 31 days");
         break;
}
}
}


/*  OUTPUT

enter the year : 2025
1.January 2.February 3.March 4.April 5.May 6.June 7.July 8.August 9.September 10.October 11.November 12.December
choose  month  to see number of days from (1-12) :1
2025 is not leap year
January have 31 days

enter the year : 2024
1.January 2.February 3.March 4.April 5.May 6.June 7.July 8.August 9.September 10.October 11.November 12.December
choose  month  to see number of days from (1-12) :2
2024 is a leap year
February have 29 days

enter the year : 2023
1.January 2.February 3.March 4.April 5.May 6.June 7.July 8.August 9.September 10.October 11.November 12.December
choose  month  to see number of days from (1-12) :2
2023 is not leap year
February have 28 days

enter the year : 2024
1.January 2.February 3.March 4.April 5.May 6.June 7.July 8.August 9.September 10.October 11.November 12.December
choose  month  to see number of days from (1-12) :3
2024 is a leap year
March have 31 days

enter the year : 2024
1.January 2.February 3.March 4.April 5.May 6.June 7.July 8.August 9.September 10.October 11.November 12.December
choose  month  to see number of days from (1-12) :4
2024 is a leap year
April have 30 days

enter the year : 2024
1.January 2.February 3.March 4.April 5.May 6.June 7.July 8.August 9.September 10.October 11.November 12.December
choose  month  to see number of days from (1-12) :5
2024 is a leap year
May have 31 days


*/
