//Name: Joshua Huerto
//Assignment1, CPS209 W2019


//Importing the ArrayList to be used for organizing the Car objects
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CarDealership
{

    //An instance variable referencing an ArrayList of Car objects
    private ArrayList<Car> list;
    
    //Parameters for the price fiter 
    private double min, max;

    //Instance variables for the other filters
    private boolean ifElectric, ifAWD, price;
    
    /** A SafetyComparator class that implements the Comparator interface 
     * 	and compares two cars based on their safety ratings
     */
    private class SafetyComparator implements Comparator<Car>
    {
    	/** A compare() method to check for equality between two cars 
    	 * 	
    	 * 	@param	Car A	The first car
    	 * 	@param	Car B	The second car
    	 * 	@return	1	If the safety rating of the first car is greater than that of the second car
    	 * 	@return	0	If the safety ratings of both cars are equal
    	 * 	@return -1	If the safety rating of the second car is greater than that of the first car
    	 */
    	public int compare(Car A, Car B)
    	{
    		if (A.getSafetyRating() > B.getSafetyRating())
    		{
    			return 1;
    		}
    		else if (A.getSafetyRating() == B.getSafetyRating())
    		{
    			return 0;
    		}
    		
    		return -1;
    	}
    }
    /** A RangeComparator class that implements the Comparator interface
     * 	and compares two cars based on their max ranges
     */
    private class RangeComparator implements Comparator<Car>
    {
    	/** A compare() method to check for equality between two cars
    	 * 	
    	 * 	@param Car A	The first car
    	 * 	@param Car B	The second car
    	 * 	@return 1	If the max range of the first car is greater than that of the second car
    	 * 	@return 0	If the max ranges of both cars are equal
    	 * 	@return -1	If the max range of the second car is greater than that of the first car
    	 */
    	public int compare(Car A, Car B)
    	{
    		if (A.getMaxRange() > B.getMaxRange())
    		{
    			return 1;
    		}
    		else if (A.getMaxRange() == B.getMaxRange())
    		{
    			return 0;
    		}
    		
    		return -1;
    	}
    }
    /** An empty constructor method that creates a reference to a
     *  the instance variable list
     */
    public CarDealership()
    {
        list = new ArrayList<Car>(0);
    }
    
    /** A constructor method that creates an empty ArrayList of Car objects 
     *  and sets the instance variable to refer to it
     *  
     *  @param  Cars    The ArrayList of Car objects
     */
    public CarDealership (ArrayList<Car> Cars)
    {
        
        list = Cars;
    }
    
    /** A void addCars() method that takes in a reference to an ArrayList
     *  of Car objects and adds the objects to the ArrayList made in 
     *  the CarDealership object
     *  
     *  @param  newCars     An ArrayList of Car objects that will be added
     */
    public void addCars(ArrayList<Car> newCars)
    {
        list = newCars;
    }

    /** A buyCar method that takes in an integer which removes a Car object 
     *  from the ArrayList. Returns null if integer is out of range
     *  
     *  @param  index    The index of the ArrayList that will be removed
     */
    public Car buyCar(int index)
    {
        if (index > list.size())
        {
            return null;
        }
        list.remove(index);
        return list.get(index);
    }
    
    /** This returnCar() method takes in a Car object and adds it
     *  back to the list of cars
     *  
     *  @param  car     A Car object that will be returned
     */
    public void returnCar(Car car)
    {
        list.add(car);
    }
    
    /** The displayInventory() method that prints the info about cars */
    public void displayInventory()
    {
        ArrayList<Integer> hold  = new ArrayList<Integer>(0);
        //If the user filtered the list by Electric
        if(ifElectric == true)
        {
            for (int x = 0; x < list.size(); x++)
            {
                if(list.get(x).getPower() != Vehicle.Powersource.ELECTRIC_MOTOR)
                {
                    hold.add(x);
                }
            }
        }
        //If the user filtered the list by AWD
        if(ifAWD == true)
        {
            for (int y = 0; y < list.size(); y++)
            {
                if((list.get(y).getAWD() == false))
                {
                    hold.add(y);
                }
            }
        }
        //If the user filtered the list by price
        if(price == true)
        {
            for (int z = 0; z <list.size(); z++)
            {
                if(!(list.get(z).getPrice() < max && list.get(z).getPrice() > min))
                {
                    hold.add(z);
                }
            }
        }
        //Printing out the list of cars
        for (int w = 0; w < list.size(); w++)
        {
            if (!(hold.contains(w)))
            {
                System.out.println(w + list.get(w).display());
            }
            else
            {
                continue;
            }
        }
    }
    /** A void filterByElectric() method that sets ifElectric to true
     */
    public void filterByElectric()
    {
        ifElectric = true;
    }
    /** A void filterByAWD() method that sets ifAWD to true */
    public void filterByAWD()
    {
        ifAWD = true;
    }
    /** A void filterByPrice method that takes in a minimum price range and
     * 	a maximum price range and sorts the list accordingly
     * 
     * 	@param minPrice		The minimum price
     * 	@param maxPrice		The maximum price
     */
    public void filterByPrice(double minPrice, double maxPrice)
    {
        min = minPrice;
        max = maxPrice;
        price = true;
    }
    /** A void filtersClear() method which sets all filters to false
     */
    public void filtersClear()
    {
        price = false;
        ifAWD = false;
        ifElectric = false;
    }
    /** A void sortByPrice() method which sorts the list of cars based
     * 	on their price
     */
    public void sortByPrice()
    {
        Collections.sort(list);
    }
    /** A void sortBySafetyRating() method which sorts the list of cars
     * 	by using the SafetyComparator
     */
    public void sortBySafetyRating()
    {
        Collections.sort(list, new SafetyComparator());
    }
    /** A void sortByMaxRange() method which sorts the list of cars
     * 	by using the RangeComparator
     */
    public void sortByMaxRange()
    {
        Collections.sort(list, new RangeComparator());
    }
    
}
