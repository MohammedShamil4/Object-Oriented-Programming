/*
Create interfaces Student and Sports.
Create a class Result implements Student and Sports.
Display the academic and sports score of a student.
*/

interface student
{
	int score=10;
	void displayscore();
}

interface sports
{
	int score=25;
	void displaysportsscore();
}

class Result implements student,sports
{
	public void displayscore()
	{
		System.out.println("Score : "+student.score);
	}
	public void displaysportsscore()
	{
		System.out.println("Sports score : "+sports.score);
	}

}

public class SportsStudentResult
{
	public static void main(String args[])
	{
		Result r = new Result();
		r.displayscore();
		r.displaysportsscore();
	}
}





/*
OUTPUT:
Score : 10
Sports score : 25
*/
