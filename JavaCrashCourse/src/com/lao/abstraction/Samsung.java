package com.lao.abstraction;

public class Samsung extends Mobiles{

	
	
	@Override
	public void OS()
	{
		System.out.println("Samsung Mobile OS details here");
	}
	
	@Override
	public void screenSize()
	{
		System.out.println("Samsung Mobile Screensize details here");
	}
	
	@Override
	public void NetworkCabability() {
		// TODO Auto-generated method stub
		System.out.println("We can use only upto 4G");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobiles mobiles = new Samsung();
		mobiles.OS();
		mobiles.screenSize();
		mobiles.NetworkCabability();
		
	}

	@Override
	public void musicSystem() {
		// TODO Auto-generated method stub
		{
			System.out.println("the new gen Samsung mobile will have new gen music systems.");
		}
	}


}
