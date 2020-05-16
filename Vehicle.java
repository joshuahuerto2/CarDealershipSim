//Name: Joshua Huerto
//Assignment1, CPS209 W2019


public class Vehicle
{
	//Instance Variables
    private String mfr;
    private String color;
    public Powersource power;
    private int numWheels;
    
    //The powersource enum
    public static final Powersource GAS_ENGINE = null;
    public static enum Powersource 
    {
        ELECTRIC_MOTOR, GAS_ENGINE;
        
    }
    /** A constructor that sets up the instance variables with four paramaters
     *  
     *  @param  manufacturer   a name for the maker of the vehicle
     *  @param  color1         a color for the vehicle
     *  @param  power1         the powersource of the vehicle
     */
    public Vehicle(String manufacturer, String color1, Powersource power1)
    {
        mfr = manufacturer;
        color = color1;
        power = power1;
    }
    
    /** A getManufacturer() method which returns the name of the manufacturer of the vehicle
     *  
     *  @return The manufacturer of the vehicle
     */
    public String getManufacturer()
    {
        return mfr;
    }

    /** A getColor() method which returns the color of the vehicle
     *  
     *  @return The color of the vehicle
     */
    public String getColor()
    {
        return color;
    }
    
    /** A getPower() method which returns the  of the vehicle
     *  
     *  @return The powersource of the vehicle
     */
    public Powersource getPower()  
    {
        return power;
    }
    
    /** A getNumWheels() method which returns the number of wheels on the vehicle
     *  
     *  @return the number of wheels on the vehicle
     */
    public int getNumWheels()
    {
        return numWheels;
    }
    
    /** A void setManufacturer method which changes the name of the manufacturer
     *  
     *  @param  newMfr  the name of the new manufacturer
     */
    public void setManufacturer(String newMfr)
    {
        mfr = newMfr;
    }
    
    /** A void setColor method which changes the color of the vehicle
     *  
     *  @param newColor   the new color of the vehicle
    */
    public void setColor(String newColor)
    {
        color = newColor;
    }

    /** A void setPower method which changes the horsepower of the vehicle
     *  
     *  @param newPower   the new powersource of the vehicle
     */
    public void setPower(Powersource newPower)
    {
        power = newPower;
    }

    /** A void setWheels method which changes the number of wheels on the vehicle
     *  
     *  @param newWheels    the new number of wheels on the vehicle
     */
    public void setWheels(int newWheels)
    {
        numWheels = newWheels;
    }
    /** An equals method where two Vehicle objects are compared for equality;
     *  vehicles are equal if their mfr, power, and numWheels are equal 
     *  
     *  @param  other   The other vehicle that is being compared to the vehicle referenced as this.vehicle
     *  @return         True or false based on the equality
     */
    public boolean equals(Object other)
    {
        Vehicle otherVehicle = (Vehicle) other;
        return mfr.equals(otherVehicle.mfr) && color.equals(otherVehicle.color) && power == otherVehicle.power && numWheels == otherVehicle.numWheels;
    }

    /** A display() method returns a string containing the manufacturer name and color of the vehicle
     *  
     *  @return A string containing the manufacturer and the color of the vehicle
     */
    public String display()
    {
        return " Manufacturer: " + mfr + " Color: " + color;
    }
}
