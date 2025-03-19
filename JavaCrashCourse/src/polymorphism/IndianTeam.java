package polymorphism;

public class IndianTeam extends Cricket
{
	void bowling(String typeOfBowling)
	{
		System.out.println("We are bowling in different type "+typeOfBowling);
	}
	public static void main(String[] args) 
	{
		IndianTeam myTeam = new IndianTeam();
		//myTeam.Bowling();
		myTeam.bowling("Fast Bowling");
	}
}




