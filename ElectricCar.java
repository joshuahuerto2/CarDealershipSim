//Name: Joshua Huerto
//Assignment1, CPS209 W2019


public class ElectricCar extends Car 
{
    public static final Class<? extends Car> Class = null;
	/** Using the variables found in the previous classes, Car and Vehicle,
     *  ElectricCar adds two more instance variables: rechargeTime (type int),
     *  and batteryType (type String)
     */
    private int rechargeTime;
    private String batteryType;

    /** A constructor initializing the variables  
     *  
     *  @param  rechargeTime1   The time needed to recharge the electric car in minutes
     *  @param  batteryType1    The type of battery 
     *  @param  model1          The model of the car
     *  @param  maxRange1       The max range of the car
     *  @param  safetyRating1   The safety rating of the car
     *  @param  AWD1            If the car is AWD or not
     *  @param  manufacturer    The name of the car manufacturer
     *  @param  color           The color of the car
     *  @param  power1          The power of the car
     */
    public ElectricCar(String manufacturer, String color, Model model1, Powersource power1, double safetyRating1, boolean AWD1, int maxRange1, double price1, int rechargeTime1, String batteryType1 )
    {
        super(manufacturer, color, model1, power1, safetyRating1, AWD1, maxRange1, price1);
        rechargeTime = rechargeTime1;
        batteryType = batteryType1;
    }

    /**A getRechargeTime() method which returns the minutes required to recharge the car
     * 
     * @return rechargeTime
     */
    public int getRechargeTime()
    {
        return rechargeTime;
    }
    
    /**A getBatteryType() method which returns the type of battery the car is using
     * 
     * @return batteryType
     */
    public String getBatteryType()
    {
        return batteryType;
    }
    
    /** A void setRechargeTime method which sets the recharge time to whatever is inputed
     *  
     *  @param  timeChange      The new number of minutes the car needs to recharge
     */
    public void setRechargeTime(int timeChange)
    {
        rechargeTime = timeChange;
    }

    /** A void setBatteryType method which sets the battery type to whatever is inputed
     *  
     *  @param   newBattery     The new battery type
    */
    public void setBatteryType(String newBattery)
    {
        batteryType = newBattery;
    }

    /** A display method that overrides the same method from the car class and adds the instance variables from this class
     * 
     * 	@return A string containing the characteristics of the ElectricCar object along
     *         with the inherited attributes from the Car and Vehicle classes*/
    public String display()
    {
        return super.display() + " Recharge Time = " + rechargeTime + " Battery Type: " + batteryType;
    }
    
}
