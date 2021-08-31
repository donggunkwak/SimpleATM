import java.util.*;

public class SimpleATM {

	private static HashMap<String, Double> accounts = new HashMap<String, Double>();
	
	public void deposit(String ID, double money)
	{
		if (money > 0)
		{
			if(!accounts.containsKey(ID))
				accounts.put(ID,0.0);
			accounts.put(ID,(accounts.get(ID)+money));
		}
	}
	
	public void withdraw(String ID, double money)
	{
		if (accounts.containsKey(ID))
		{
			if (money > 0 && money < accounts.get(ID))
			{
				accounts.replace(ID, accounts.get(ID)-money);
			}
		}
	}
	
	public String checkBalance(String ID)
	{
		String end = "";
		if (accounts.containsKey(ID))
		{
			return "Balance for " + ID + ": $" + accounts.get(ID);
		}
		else
		{
			return "Error: ID does not exist.";
		}
	}
	
	public static void main (String [] args)
	{
		SimpleATM thing = new SimpleATM();
		thing.deposit("Winfrey", 25159684372.43);
		thing.deposit("Bezos", 193495330293.43);
		thing.deposit("Bezos", 20394353.35);
		thing.withdraw("Bezos", 3593293.66);
		thing.deposit("MrTheiss",64033.55);
		thing.withdraw("MrTheiss", 443964.46);
		System.out.println(thing.checkBalance("Bezos"));
		System.out.println(thing.checkBalance("Winfrey"));
		System.out.println(thing.checkBalance("YoMama"));
		System.out.println(thing.checkBalance("MrTheiss"));
	}

}
