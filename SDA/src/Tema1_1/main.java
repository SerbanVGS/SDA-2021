package Tema1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main
{
	public static void main(String[] args) throws IOException
	{
		double max;
		int n;
		int i;
		
		System.out.println("Introduceti numarul de elemente n: ");
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(x.readLine());
		double[] V = new double[n];
		
		for(i = 0; i < n; i++)
		{
			System.out.println("V[" + i + "]=");
			V[i] = Double.parseDouble(x.readLine());
		}
		
		max = V[0];
		
		for(i = 1; i < n; i++)
			if( max < V[i])
				max = V[i];
		
		System.out.println("Cel mai mare numar este: " + max);
	}
}
