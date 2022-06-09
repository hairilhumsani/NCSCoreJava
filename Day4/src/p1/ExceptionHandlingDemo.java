package p1;

import java.util.Scanner;

/*  All Runtime Exception Demo*/
class Car
{
	public void startCar() {
		//...
	}
}

class SportsCar extends Car
{
	public void doRacing() {}
}

class SUV extends Car
{
	public void doHiking() {}
}

public class ExceptionHandlingDemo {
	
	public static void main(String[] args) {
		ExceptionHandlingDemo obj = new ExceptionHandlingDemo();
		Scanner sc = new Scanner(System.in);
		
		  Car cars[] = new Car[3];
		  cars[0] = new Car();
		  cars[1] = new Car();
		  cars[2] = new Car();
		  
		  try
		  {
			  obj.doBusinessObjectives(cars);
		  }
		  catch(ArrayIndexOutOfBoundsException e)
		  {
			  
		  }
		 
		 
		
		
		
		/*
		String str = "Hello";
		char ch = str.charAt(85);
		System.out.println(ch);
		*/
		
		System.out.println(" ---- A -----");
		
		System.out.println("Enter Value :- ");
		String userInput = sc.nextLine();
		
		try {
			System.out.println(" --- code inside try ---");
			
			int sum = obj.doBusinessObjectives(userInput);
			System.out.println(" --- try block ends ----");
		}
		catch(NumberFormatException e)
		{
			System.out.println("---- inside catch block ----");
			System.out.println(e);
		}
		
		System.out.println(" ---- B -----");
		
		
		/*
		Car car = new SUV();
		obj.doBusinessObjectives(car);
		*/
		
	}
	
	public int doBusinessObjectives(String y)
	{
		int x = Integer.parseInt(y);
		return x+x;
	}
	
	public void doBusinessObjectives(Car car)
	{
		car.startCar();
		
			SportsCar sc = (SportsCar)car;
			sc.doRacing();
		
		
	} 
	
	public void doBusinessObjectives(Car cars[])throws ArrayIndexOutOfBoundsException
	{
		for(int i = 0;i<=cars.length;i++)
		{
			cars[i].startCar();
		}
	} 
	
	         // apply of . operator over null

}
