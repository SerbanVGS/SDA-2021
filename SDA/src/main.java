import java.io.*;


public class main 
{

	public static void main(String[] args) throws IOException
	{
		int a, b, suma, diferenta, produs, distanta, max, min;
		double average;
		
		System.out.println("Insert two integers. ");
		System.out.println("First number: ");
		
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));	
		a = Integer.parseInt(x.readLine());

		System.out.println("Second number: ");
		b = Integer.parseInt(x.readLine());
		
		suma = a + b;
		System.out.println("Sum of two integers: " + suma);
		
		diferenta = a - b;
		System.out.println("Difference of two integers: " + diferenta);
		
		produs = a * b;
		System.out.println("Product of two integers: " + produs);
		
		average = (a + b) / 2;
		System.out.println("Average of two integers: " + String.format("%.2f", average));
		
		if(a < b)
		{
			max = b;
			min = a;
		}
		else
		{
			max = a;
			min = b;
		}
		
		distanta = max - min;
		System.out.println("Distance of two integers: " + distanta);
		System.out.println("Max integer: " + max);
		System.out.println("Min integer: " + min);
				
	}

}