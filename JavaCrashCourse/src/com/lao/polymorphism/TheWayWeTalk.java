package com.lao.polymorphism;

public class TheWayWeTalk 
{
	public void talk(Parents styleOfTalking)
	{
		System.out.println("in a respectful manner");
	}
	public void talk(Partner styleOfTalking)
	{
		System.out.println("in a loveful way");
	}
	public void talk(Boss styleOfTalking)
	{
		System.out.println("in a professional way");
	}
	
public static void main(String[] args)
{
	TheWayWeTalk TheWayWeTalk =new TheWayWeTalk();
	Parents parents = new Parents();
	Partner partner = new Partner();
	Boss boss = new Boss();
	TheWayWeTalk.talk(parents);
	TheWayWeTalk.talk(partner);
	TheWayWeTalk.talk(boss);
}

}
