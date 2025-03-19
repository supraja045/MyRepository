package com.lao.conditional_statements;

public class HeroOrNot {

	public void switchCaseExample()

	{
	String myHero= "Spider Man";
	
		switch (myHero) {
		case "Iron Man":
			System.out.println("Iron Man is a super hero");
		case "Super Man":
			System.out.println("Super Man is a super hero");
			break;
		case "Bat Man":
			System.out.println("Bat Man is a super hero");
			break;
		default:
			System.out.println("hyello");
		
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeroOrNot HeroOrNot = new HeroOrNot();
		HeroOrNot.switchCaseExample();

	}

}
