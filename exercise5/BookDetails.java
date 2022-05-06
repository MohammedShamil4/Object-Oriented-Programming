/*
Write a program has classes Publisher, Book, Literature and Fiction.
Read the information and print the details of books from either the category, using inheritance.
Class Publisher- Attribute PublisherName, Method display()
Class Book subclass of Publisher- Attribute- Title, Author, Method display()
Class Literature subclass of Book-Attribute-type, Method display()
Class Fiction subclass of Book-Attribute-genre, Method display()
*/


import java.util.*;

class Publisher
{
	String pname;
	Publisher(String n)		//constructor
	{
		pname=n;
	}
	void display()
	{
		System.out.println("Publisher name : "+pname);
	}
}

class Book extends Publisher			//subclass of Publisher
{
	String title,author;
	Book(String n,String t,String a)			//constructor
	{
		super(n);			//invoking parent constructor
		title=t;
		author=a;
	}
	void display()
	{
		super.display();			//invoking parent class display()
		System.out.println("Book title : "+title);
		System.out.println("Author : "+author);
	}
}

class Literature extends Book			//subclass of book
{
	String type;
	Literature(String n,String t,String a,String typ)				//constructor
	{
		super(n,t,a);			//invoking parent constructor
		type=typ;
	}
	void display()
	{
		super.display();				//invoking parent class display
		System.out.println("Type : "+type);
	}
}

class Fiction extends Book			//subclass of book
{
	String genre;
	Fiction(String n,String t,String a,String r)				//constructor
	{
		super(n,t,a);			//invoking parent constructor
		genre=r;
	}
	void display()
	{
		super.display();				//invoking parent class display
		System.out.println("Genre : "+genre);
	}
}

class BookDetails
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number of Books of literature: ");
		int n1=s.nextInt();
		System.out.println("Enter Number of Books of Fiction: ");
		int n2=s.nextInt();
		Book ref;
			Literature obj1[]=new Literature[n1];
			Fiction obj2[]=new Fiction[n2];
			int i=0;
			int j=0;
 
			do{
				System.out.println("\n\nEnter Literature Book "+(i+1)+" details");
				System.out.println("Enter Publisher name :  ");
				String p=s.next();
				System.out.println("Enter Book name :  ");
				String bk=s.next();
				System.out.println("Enter Author name :  ");
				String au=s.next();
				System.out.println("Enter Literature type :  ");
				String lt=s.next();
				obj1[i]=new Literature(p,bk,au,lt);
				i++;
			}while(i<n1);
         
			do{
				System.out.println("\n\nEnter Fiction Book "+(j+1)+" details");
				System.out.println("Enter Publisher name :  ");
				String p=s.next();
				System.out.println("Enter Book name :  ");
				String bk=s.next();
				System.out.println("Enter Author name :  ");
				String au=s.next();
				System.out.println("Enter Fiction type :  ");
				String lt=s.next();
				obj2[j]=new Fiction(p,bk,au,lt);
				j++;
			}while(j<n2);
			while(true){
			System.out.println("\n\n1.LITERATURE\n2.FICTION\n3.EXIT\n\nEnter work type to show....\n");
		        int ch2=s.nextInt();
		       switch(ch2){
		       case 1:
				for(i=0;i<n1;i++)
				{
					System.out.println("\n____LITERATURE BOOK "+ (i+1)+" INFORMATION ___\n");
				        obj1[i].display();
				}
				break;
			case 2:
				for(j=0;j<n2;j++)
				{
					System.out.println("\n____FICTION BOOK "+(j+1)+" INFORMATION ___\n");
					obj2[j].display();    
				}
				break;
			default:
				System.out.println("Invalid");
				System.out.println("Exiting.....");
				System.exit(0);
					}
				}
		}
}



/*
OUTPUT:
Enter Number of Books of literature:
1
Enter Number of Books of Fiction:
2
Enter Literature Book 1 details
Enter Publisher name :
Pappiyon
Enter Book name :
Dilli
Enter Author name :
Ismail_Meladi
Enter Literature type :
Poem
Enter Fiction Book 1 details
Enter Publisher name :
Arrow_Books
Enter Book name :
The_Old_Man_And_The_Sea
Enter Author name :
Ernest_Hemingway
Enter Fiction type :
Novel
Enter Fiction Book 2 details
Enter Publisher name :
Corgi_Books
Enter Book name :
Deception_Point
Enter Author name :
Dan_Brown
Enter Fiction type :
Novel
1.LITERATURE
2.FICTION
3.EXIT
Enter work type to show....
1
____LITERATURE BOOK 1 INFORMATION ___
Publisher name : Pappiyon
Book title : Dilli
Author : Ismail_Meladi
Type : Poem
1.LITERATURE
2.FICTION
3.EXIT
Enter work type to show....
2
____FICTION BOOK 1 INFORMATION ___
Publisher name : Arrow_Books
Book title : The_Old_Man_And_The_Sea
Author : Ernest_Hemingway
Genre : Novel
____FICTION BOOK 2 INFORMATION ___
Publisher name : Corgi_Books
Book title : Deception_Point
Author : Dan_Brown
Genre : Novel
1.LITERATURE
2.FICTION
3.EXIT
Enter work type to show....
3
Invalid
Exiting.....
*/
