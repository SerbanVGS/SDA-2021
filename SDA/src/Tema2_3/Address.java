package Tema2_3;

public class Address 
{

	private String street, city;
	private int number;

	public Address(String street, String city, int number) 
	{
		super();
		this.street = street;
		this.city = city;
		this.number = number;
	}

	public String getStreet() 
	{
		return this.street;
	}

	public String getCity() 
	{
		return this.city;
	}

	public int getNumber() 
	{
		return this.number;
	}

	public String getFullAddress() 
	{
		return " Orasul " + this.city + ", strada " + this.street + ", numarul " + this.number;

	}

}