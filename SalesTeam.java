import java.util.*;

public class SalesTeam 
{
	private String associate;
	private String employees;
	private int employeeSize;
	
	public SalesTeam()
	{
		String[] people = {"Allison", "Jason", "Lindsay", "Andrew", "Dan", "Daisy"};
		LinkedList<String> team = new LinkedList<String>();
		{
		for (int i = 0; i < people.length; i++)
		{
			team.add(people[i]);
		}
		associate = team.get(getRandomNumber(0, 5));
		}
		
		employeeSize = team.size();
		
		ListIterator<String> iter = team.listIterator();
		
		for (String name : team)
		{
			employees = employees + iter.next() + ", ";
		}
		
	}
	
	
	public int getRandomNumber(int min, int max)
	{
		Random r = new Random();
		return r.ints(min, (max + 1)).limit(1).findFirst().getAsInt();
	}
	public String getSalesPerson()
	{
		return associate;
	}
	
	public String getSalesFaculty()
	{
		return employees;
	}

	public int getWorkerNumber()
	{
		return employeeSize;
	}
}
