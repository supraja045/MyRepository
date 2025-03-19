package com.lao.conditional_statements;

public class WhostheHero {


		public void guessMyHero()
		{
			String myguess= "Iron Man";
			if(myguess.equals("Iron Man"))
			{
				System.out.println("Whoa!! My guess is Iron Man");
			}
			else if(myguess.equals("Super Man"))
			{
				System.out.println("Alas!! My guess is Super Man");
			}
			else if(myguess.equalsIgnoreCase("Bat Man"))
			{
				System.out.println("Alas!! My guess is Bat Man");
			}
			else
			{
				System.out.println("Sorry I can't guess this super hero");
			}
		}
	

	public static void main(String[] args) {
		
		WhostheHero whostheHero = new WhostheHero();
		whostheHero.guessMyHero();
	}

}
