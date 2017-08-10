package io.zipcoder.fundamentals.day2.lab1;
import java.util.*;

public class Greeting {

    public static void main(String[] args)
    {
    	Greeting greeting = new Greeting();
    	greeting.askName();

    }
    
    public void askName()
    {
    	Scanner in = new Scanner(System.in);
    	
    	System.out.print("Hello, what is your name?");
    	String name = in.nextLine();
    	
    	System.out.print("Oh, heeeyyyy ");
    	if(name.equals("Alice") || name.equals("Alice"))
    	{
    		System.out.print(name);

    	}
    	

    	in.close();      
    }
}
