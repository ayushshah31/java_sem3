import java.util.*;

class Rectangle{
	double length;
	double breadth;
	Rectangle()
	{
		length=0;
		breadth=0;
	}
	Rectangle(double length , double breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	void area()
	{
		System.out.println("\nArea of Rectangle: " + length*breadth);
	}
}

class Cube{
	double length;
	Cube()
	{
		length=0;
	}
	Cube(double length )
	{
		this.length = length;
	}
	void volume()
	{
		System.out.println("\nVolume of Cube: " + length*length*length);
	}
}

class Size{

	void size()
	{

		Scanner sc = new Scanner(System.in);
		int choice;
		double length,breadth;
		Object z = new Rectangle();
		System.out.print("Enter\n 1-Area of Rectangle \n 2-Volume of Cube \nChoice: ");
		choice = sc.nextInt();
		if(choice==2)
		{
			z = new Cube();
		}
		// double length,breadth,ans;
		// Scanner sc = new Scanner(System.in);

		// if(choice==1)
		// {
		// 	System.out.print("\nEnter Lenght: ");
		// 	length = sc.nextDouble();
		// 	System.out.print("Enter Breadth: ");
		// 	breadth = sc.nextDouble();
		// 	Rectangle z = new Rectangle(length,breadth);
		// }
		// else if(choice == 2)
		// {
		// 	System.out.print("\nEnter Side: ");
		// 	length = sc.nextDouble();
		// 	Cube z = new Cube(length);
		// }
		// else
		// {
		// 	return;
		// }
		if(z instanceof Rectangle )
		{
			System.out.print("\nEnter Length: ");
			length = sc.nextDouble();
			System.out.print("Enter Breadth: ");
			breadth = sc.nextDouble();
			Rectangle r = new Rectangle(length,breadth);
			r.area();
		}
		else
		{
			System.out.print("\nEnter Side: ");
			length = sc.nextDouble();
			Cube c = new Cube(length);
			c.volume();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		double ans;
		// Object z = new Rectangle();
		Size z1 = new Size();
		z1.size();
	}
}