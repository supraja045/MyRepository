/**
 * 
 */
package com.lao.javaLearning;

/**
 * @author This example is to understand Return types
 *
 */
public class CollectAmount {
	
	public Integer collectedAmount =1000; 
	public Integer collectAmountAndGiveitToMe()
	{
		System.out.println("Dad I've collected the amount " + collectedAmount +"rs and sent it you");
		return collectedAmount;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Return Types
		CollectAmount collectAmount = new CollectAmount();
		Integer amount = collectAmount.collectAmountAndGiveitToMe();
		System.out.println("Hi Son, I've received the amount "+ amount+"rs that you sent me ");
	}

}
