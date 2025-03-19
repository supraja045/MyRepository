package com.lao.abstraction;

public  class Motorola extends Mobiles//  //Example of Multiple Inheritance in Class
{

	@Override
	public void OS()
	{
		System.out.println("Motorola Mobile OS details here");
	}
	
	
	@Override
	public void screenSize()
	{
		System.out.println("Motorola Mobile Screensize details here");
	}
	
	@Override
	public void NetworkCabability() {
		// TODO Auto-generated method stub
		System.out.println("We can use 5G");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobiles mobiles = new Motorola();
		mobiles.OS();
		mobiles.screenSize();
		mobiles.NetworkCabability();

		
	}

	@Override
	public void musicSystem() {
		// TODO Auto-generated method stub
		{
			System.out.println("the new gen Motorola mobile will have dolbyAutm music systems.");
		}
	}


}
