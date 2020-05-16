//Name: Joshua Huerto
//Student Number: #500876654
//Assignment1, CPS209 W2019

//Importing the ArrayList and Scanner classes
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CarDealershipSimulator 
{

public static void main(String[] args)
  {
	  	/** The CarDealership object */	  
	 	 CarDealership cars = new CarDealership();
		
	 
	  	/** The initially empty array lists that will hold the list of new cars 
	  	 *  and the list of bought cars
	   	 */
		ArrayList<Car> newCars = new ArrayList<Car>();
		ArrayList<Car> bought = new ArrayList<Car>();
		/** The cars that are added to the list of cars through the "ADD" command */
		newCars.add(new Car("Toyota", "blue", Car.Model.SEDAN, Vehicle.Powersource.GAS_ENGINE, 9.5, false, 500, 25000));
		newCars.add(new Car("Honda", "red", Car.Model.SPORTS, Vehicle.Powersource.GAS_ENGINE, 9.2, false, 450, 30000));
		newCars.add(new Car("Kia", "white", Car.Model.MINIVAN, Vehicle.Powersource.GAS_ENGINE, 9.7, false, 550, 20000));
		newCars.add(new Car("BMW", "black", Car.Model.SEDAN, Vehicle.Powersource.GAS_ENGINE, 9.6, false, 660, 55000));
		newCars.add(new ElectricCar("Tesla", "red", Car.Model.SEDAN, Vehicle.Powersource.ELECTRIC_MOTOR, 9.1, true, 425, 85000, 30, "lithium"));
		newCars.add(new Car("Chevy", "red", Car.Model.MINIVAN, Vehicle.Powersource.GAS_ENGINE, 9.25, false, 475, 40000));
		newCars.add(new ElectricCar("ChevyVolt", "green", Car.Model.SEDAN, Vehicle.Powersource.ELECTRIC_MOTOR, 8.9, true, 375, 37000, 45, "lithium"));
		newCars.add(new Car("Bentley", "black", Car.Model.SEDAN, Vehicle.Powersource.GAS_ENGINE, 9.8, false, 575, 150000));
		newCars.add(new ElectricCar("NissanLeaf", "green", Car.Model.SEDAN, Vehicle.Powersource.ELECTRIC_MOTOR, 8.8, true, 325, 32000, 55, "lithium"));
		System.out.println(newCars);

	  /** A scanner object to read the commands from the console,
	   *  along with a condition for the while loop, making sure
	   *  that the input is not "Q"
	   */
		
		Scanner scanner = new Scanner(System.in);
		boolean active = true;
		
		//The simulator
		while(active)
		{
			try
			{
			System.out.println("Please enter a command: ");
			Scanner line = new Scanner(scanner.nextLine());
			String command = line.next();
			//Quit
			if(command.equals("Q") || command.equals("") || command.equals(null) || command.isEmpty())
			{
				System.out.println("Goodbye!");
				active = false;
			}
			//Checking to see if the input is anything other than a command
			if(!(command.equals("L") || command.equals("BUY") || command.equals("RET") || command.equals("ADD") || command.equals("SPR") || command.equals("SSR") || command.equals("SMR") || command.equals("FPR") 
					|| command.equals("FEL") || command.equals("FAW") || command.equals("FCL")) || command.equals(null) || command.isEmpty())

				{
				System.out.println(" ");			
				}
			//List
			else if(command.equals("L"))
			{			
				cars.displayInventory();
				System.out.println(" ");
				
			}
			//Buying a car
			else if(command.equals("BUY"))
			{
				if(!line.hasNextInt())
				{
					continue;
				}
				int index = line.nextInt();
				if(index < newCars.size())
				{
					bought.add(newCars.get(index));
					cars.buyCar(index);
				}
				else if(index > newCars.size())
				{
					continue;
				}
				System.out.println("Your car has been bought.");
				System.out.println(" ");
			}
			//Adding the list of cars
			else if(command.equals("ADD"))
			{
				cars.addCars(newCars);
				System.out.println("The cars have been added to the list.");
				System.out.println(" ");
				System.out.println(newCars);
			}
			//Returning a car
			else if(command.equals("RET"))
			{
				newCars.add(bought.get(bought.size() - 1));
				System.out.println("Your car has been returned.");
				System.out.println(" ");
			}
			//Sort by Price
			else if(command.equals("SPR"))
			{
				cars.sortByPrice();
				System.out.println("The cars have been sorted by their prices.");
				System.out.println(" ");
			}
			//Sort by Safety Rating
			else if(command.equals("SSR"))
			{
				cars.sortBySafetyRating();
				System.out.println("The cars have been sorted by their safety ratings.");
				System.out.println(" ");
			}
			//Sort by Max Range
			else if(command.equals("SMR"))
			{
				cars.sortByMaxRange();
				System.out.println("The cars have been sorted by their max ranges.");
				System.out.println(" ");
			}
			//Filter by Price Range
			else if(command.equals("FPR"))
			{
				//Reading input for doubles
				if(!line.hasNextDouble())
				{
					continue;
				}
				double min = line.nextDouble();

				if(!line.hasNextDouble())
				{
					continue;
				}
				double max = line.nextDouble();

				if (max > min)
				{
					cars.filterByPrice(min, max);
					System.out.println("");
				}
				else if (max < min || max == min)
				{
					continue;
				}
			}
			//Filter by Electric
			else if(command.equals("FEL"))
			{
				cars.filterByElectric();
				System.out.println("Now displaying electric cars.");
				System.out.println(" ");
			}
			//Filter by AWD
			else if(command.equals("FAW"))
			{
				cars.filterByAWD();
				System.out.println("Now displaying AWD cars.");
				System.out.println(" ");
			}
			//Clear filters
			else if(command.equals("FCL"))
			{
				cars.filtersClear();
				System.out.println("All filters have been removed");
				System.out.println(" ");
				}
			} catch (NoSuchElementException e)
			{
				System.out.println("Invalid command");
				System.out.println(" ");
			}
			  catch (IndexOutOfBoundsException f)
			{
				  System.out.println("Invalid index");
				  System.out.println(" ");
			}
		} 
  	}
}