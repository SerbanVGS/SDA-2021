package Tema2_1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class problema1 
{
	
	public static void main(String[] args) throws IOException
	{
		
		System.out.println("Introduceti tipul de drum (Zona Rezidentiala, Oras, Drum Express, Autostrada): ");
		
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		String drum = x.readLine();
		
		//If() {}else{If(){}
		System.out.println("\nIf else: ");
		if( drum.equals("Zona Rezidentiala"))
			System.out.println(drum + " - 30");
		else if( drum.equals("Oras"))
			System.out.println(drum + " - 50");
		else if( drum.equals("Drum Express"))
			System.out.println(drum + " - 100");
		else if( drum.equals("Autostrada"))
			System.out.println(drum + " - 130");
		else 
			System.out.println("0");
		
		
		//if else
		System.out.println("\nIf() {}else{If(){} ");
		
		if( drum.equals("Zona Rezidentiala"))
			System.out.println(drum + " - 30");
		else
		{
			if( drum.equals("Oras"))
				System.out.println(drum + " - 50");
			else
			{
				if( drum.equals("Drum Express"))
					System.out.println(drum + " - 100");
				else
				{
					if( drum.equals("Autostrada"))
						System.out.println(drum + " - 130");
					else
					{
						System.out.println("0");
					}
				}
			}
		}
			
		//switch
		System.out.println("\nSwitch ");
		
		switch(drum)
		{
		case "Zona Rezidentiala":
			System.out.println(drum + " - 30");
			break;
		case "Oras":
			System.out.println(drum + " - 50");
			break;
		case "Drum Express":
			System.out.println(drum + " - 100");
			break;
		case "Autostrada":
			System.out.println(drum + " - 130");
			break;
		default: 
			System.out.println("0");
		}
		
	}

}
