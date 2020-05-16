//Name: Joshua Huerto
//Student Number: #500876654
//Assignment1, CPS209 W2019


public class Car extends Vehicle implements Comparable<Car>
{
    /** Along with the variables found in the Vehicle class, 
     * the Car class adds new instance variables: model (type Model), 
     * maxRange (type int), safetyRating (type double), AWD, or AllWheelDrive (type boolean),
     * and price (type double).
     */
    private Model model;
    private int maxRange;
    private double safetyRating;
    private boolean AWD;
    private double price;
    
    //The constants SEDAN, SUV, SPORTS, and MINIVAN will be used as enums
    public static enum Model
    {
        SEDAN, SUV, SPORTS, MINIVAN;
    }

    
    
    /** A constructor that sets up the four new instance variables, along with
     * the four instance variables from the parent Vehicle class by using super()
     *  
     *  @param model1           The model of the car
     *  @param price1        	The price of the car
     *  @param safetyRating1    The safety rating of the car
     *  @param AWD1             If the car is AWD or not
     *  @param manufacturer     The name of the car manufacturer
     *  @param color            The color of the car
     *  @param power2           The power of the car
     *  @param maxRange1		The max range of the car
     */
    public Car(String manufacturer, String color, Model model1, Powersource power1, double safetyRating1, boolean AWD1, int maxRange1, double price1)
    {
        super(manufacturer, color, power1);
        model = model1;
        maxRange = maxRange1;
        safetyRating = safetyRating1;
        AWD = AWD1;
        price = price1;
    }

	/**
     * A display() method that overrides the same method found in the Vehicle class
     * 
     * @return A string containing the characteristics of the Car object along
     *         with the inherited attributes from the Vehicle class 
     */ 
    public String display()
    {
        return super.display() + " Model: " + model + " Max Range = " + maxRange + " Safety Rating = " + safetyRating + " AWD: " + AWD + " Price = " + price;
    }
    
    /** An equals() method checking two Car objects and seeing if they are alike
     *  
     *  @param other   The other Car object
     */
    public boolean equals(Object other)
    {
        Car otherCar = (Car) other;
        return super.equals(otherCar) && this.model == otherCar.model && this.AWD == otherCar.AWD; 
    }
    /** A compareTo() method that compares the price of two cars
     *  
     *  @param  other    The other Car object that is being compared
     *  @return 1, if the this Car object has a higher price
     *  @return 0, if both Car objects have the same price
     *  @return -1, if the other Car object has a higher price
     */
    public int compareTo(Car other)
    {
        if(this.price > other.price)
        {
            return 1;
        }   
        else if (this.price < other.price)
        {
            return -1;
        }
        return 0;
    }
    /** A getSafetyRating() method that returns the safety rating of the car 
     *  
     *  @return safetyRating 
     */
    public double getSafetyRating()
    {
        return safetyRating;
    }
    /** A getMaxRange() method that returns the max range of the car
     * 	
     * 	@return maxRange 
     */
    public int getMaxRange()
    {
        return maxRange;
    }
/** 
    public Model getModel()
    {
        return model;
    }
*/
    /** A getPrice() method that returns the price of the car
     * 	
     * 	@return price
     */
    public double getPrice()
    {
        return price;
    }
    /** A getAWD() method that returns either true or false depending on if the car is AWD
     * 	
     * 	@return AWD
     */
    public boolean getAWD()
    {
        return AWD;
    }

}
