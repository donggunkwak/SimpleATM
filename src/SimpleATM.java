import java.util.*;

public class SimpleATM {

	private static HashMap<String, Double> accounts;

	public static void deposit(String ID, double money)
	{
		if (money > 0)
		{
			if(!accounts.containsKey(ID))
				accounts.put(ID,0.0);
			accounts.put(ID,(accounts.get(ID)+money));
		}
	}
	
	public static void withdraw(String ID, double money)
	{
		if (accounts.containsKey(ID))
		{
			if (money > 0 && money < accounts.get(ID))
			{
				accounts.replace(ID, accounts.get(ID)-money);
			}
		}
	}
	
	public static String checkBalance(String ID)
	{
		String end = "";
		if (accounts.containsKey(ID))
		{
			return "Balance: $" + accounts.get(ID);
		}
		else
		{
			return "ID does not exist.";
		}
	}

}
