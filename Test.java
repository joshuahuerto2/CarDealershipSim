import java.util.*;
import java.text.SimpleDateFormat;

public class Test {

	public static void main(String[] args) {
		
		int random = getRandomInRange(0, 1);
		//System.out.println(random);
		
		Calendar calendar = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");
		System.out.println(sdf.format(calendar.getTime()));
		System.out.println(calendar.getTime());
		//System.out.println(sdf.format(calendar.setTime();)));
		
		String[] people = {"Allison", "Jason", "Mark", "Andrew", "Lindsay", "Joey"};
		
		LinkedList<String> team = new LinkedList<String>();
		
		for (int i = 0; i < people.length; i++)
		{
			team.add(people[i]);
		}
		//System.out.println(team);
		
		associate = "Hello! My name is " + team.get(getRandomInRange(0, 5)) + ".";
		
		employeeSize = team.size();
		
		transaction = getRandomInRange(0, 100);
	
		ListIterator<String> iter = team.listIterator();
		employees = "";
		while(iter.hasNext())
		{
			employees = employees + iter.next() + " ";
		}
		
		System.out.println(getSalesPerson());
		System.out.println("Faculty: " + getSalesFaculty());
		System.out.println("There are " + getWorkerNumber() + " employees.");
		System.out.println("Number of transactions: "  + (transaction * employeeSize));
		
	}

	static String associate;
	static String employees;
	static int employeeSize;
	static int transaction;
	
	static int getRandomInRange(int min, int max)
	{
		Random r = new Random();
		return r.ints(min, (max + 1)).limit(1).findFirst().getAsInt();
	}
	
	static String getSalesPerson()
	{
		return associate;
	}
	
	static String getSalesFaculty()
	{
		return employees;
	}
	
	static int getWorkerNumber() 
	{
		return employeeSize;
	}
	
	public int getTransaction()
	{
		return transaction;
	}
}