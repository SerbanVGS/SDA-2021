package Tema4_2;

import java.util.Scanner;

public class main {
	public static void main(String []args)
	{
		int[] sir = {12,25,47,58,47,7,96,14,3,9};
		int length = 10;
		afisArray(sir,length);
		System.out.println("Introduce-ti pozitia intre 0-9: ");
		Scanner sc = new Scanner(System.in);
		int pozitie = sc.nextInt();
		while(pozitie < 0 || pozitie > 9)
		{
			System.out.println("Pozitia introdusa este gresita. Incearca din nou: ");
			pozitie = sc.nextInt();
		}
		int index = 0;
		while(index != pozitie)
			index++;
		for(int i = index; i < length-1; ++i)
		{
			sir[i] = sir[i+1];
		}
		length--;
		afisArray(sir,length);
	}

	public static void afisArray(int[] sir, int length)
	{
		System.out.println("Lista este: ");
		System.out.print("[ ");
		for(int i = 0; i < length-1; i++)
		{
			System.out.print(sir[i] + ", ");
		}
		
		if(length == 9)
		System.out.println("null ]");
		else 
System.out.println(sir[length-1] + "]");
	}
}
