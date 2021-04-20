package Tema1_2;

import java.io.*;
import java.util.Scanner;

public class main 
{
	public static int i, j, n;
	public static Scanner x;
	public static void main(String[] args) throws IOException
	{
		x = new Scanner(System.in);
		System.out.println("Introduceti numarul de elemente n: ");
		n = x.nextInt();
		double [][] A = new double[n][n];
		
		for(i = 0; i < n; i++)
			for(j = 0; j < n; j++)
			{
				System.out.println("A[" + i + "][" + j + "]");
				A[i][j] = x.nextDouble();
			}
		
		double sum = 0;
		for(i = 0; i < n; i++)
			for(j = 0; j < n; j++)
				if(i == j)
					sum += A[i][j];
					
		System.out.println("Suma este: " + sum);
	}

}
