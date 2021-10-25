public class HotelRoom 
{
	//protected data member
	private String hotelName;
	private int numberOfSqFeet;
	private boolean hasTV;
	private boolean hasWifi;
	//constructor to initialize all data members mentioned above
	public HotelRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi)
	{
		super();
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTV = hasTV;
		this.hasWifi = hasWifi;
	}
	/**
	 * @return the hotelName
	 */
	public String getHotelName() 
	{
		return hotelName;
	}


	/**
	 * @return the numberOfSqFeet
	 */
	public int getNumberOfSqFeet() 
	{
		return numberOfSqFeet;
	}

	/**
	 * @return the hasTV
	 */
	public boolean isHasTV()
	{
		return hasTV;
	}

	/**
	 * @return the hasWifi
	 */
	public boolean isHasWifi() 
	{
		return hasWifi;
	}


	//calculateTariff
	public int calculateTariff()
	{
		return this.numberOfSqFeet*getRatePerSqFeet();
	}
	public int getRatePerSqFeet() 
	{
		return 0;
	}
}

 	//DeluxeRoom class which is the sub class of HotelRoom class
class DeluxeRoom extends HotelRoom
{
	//protected attributes of DeluxeRoom class
	private int ratePerSqFeet;

	//Constructor which gives a default value of 10 to the variable ratePerSqFeet
	public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) 
	{
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		ratePerSqFeet = 10;
	}
	//getRatePerSqFeet
	public int getRatePerSqFeet() 
	{
		if (this.isHasWifi()) 
		{
			return this.ratePerSqFeet+2;
		}
		else 
		{
			return this.ratePerSqFeet; //WHY MY VARIABLE ratePerSqFeet IS NOT STOING GIVEN VALUE THAT IS 10 IN LINE NO. 74??? PLEASE HELP;
		}
	}
	int rate = this.calculateTariff();

}
class DeluxeACRoom extends DeluxeRoom
{
	private int ratePerSqFeet;

	public DeluxeACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi)
	{
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 12;
	}
	int rate = this.calculateTariff();

}

class SuiteACRoom extends HotelRoom
{
	private int ratePerSqFeet;

	public SuiteACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi)
	{
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 15;
	}
	public int getRatePerSqFeet() 
	{
		if (this.isHasWifi()) 
		{
			return this.ratePerSqFeet+2;
		}
		else 
		{
			return this.ratePerSqFeet;
		}
}
int rate = this.calculateTariff();
}