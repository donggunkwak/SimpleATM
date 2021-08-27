import java.util.*;

public class SimpleATM {

	private static HashMap<String, Integer> accounts;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}
	public static void deposit(String ID, int money)
	{
		if(!accounts.containsKey(ID))
			accounts.put(ID,0);
		accounts.put(ID,accounts.get(ID)+money);
	}
	

}
