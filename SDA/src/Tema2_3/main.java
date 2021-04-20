package Tema2_3;

public class main 
{

	public static void main(String[] args) 
	{

		Address ad1 = new Address(" Zizinului", "Brasov", 63);
		PaymentMethod pay1 = new PaymentMethod("Card");
		Customer c1 = new Customer("Popovici", "Popovescu", ad1, pay1, 21);

		System.out.println( "Numele este: " + c1.getCompleteName());
		System.out.println("Adresa este :" + c1.getAddress().getFullAddress());
		System.out.println("Metoda de plata aleasa este : " + c1.getPayMethod().getType());
	}
}
