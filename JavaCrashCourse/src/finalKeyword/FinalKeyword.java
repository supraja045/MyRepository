package finalKeyword;

public class FinalKeyword {


	public static void main(String[] args) 
	{
		final int number = 10; // A final variable
		// number = 20; // Error: Cannot modify final variable
		System.out.println(number); // Output: 10
	}
}
