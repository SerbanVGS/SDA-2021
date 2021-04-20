package Tema2_3;

public class Customer 
{
	
	private String lastName;
	private String firstName;
	private Address address;
	private PaymentMethod payMethode;
	private int age;

	public Customer(String lastName, String firstName, Address address, PaymentMethod payMethode, int age) 
	{
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = address;
		this.payMethode = payMethode;
		this.age = age;
	}

	public String getlastName() 
	{
		return lastName;
	}

	public String getfirstName() 
	{
		return firstName;
	}

	Address getAddress() 
	{
		return address;
	}

	PaymentMethod getPayMethod() 
	{
		return payMethode;
	}

	public String getCompleteName() 
	{
		return   getfirstName() + " " + getlastName();
	}

}
