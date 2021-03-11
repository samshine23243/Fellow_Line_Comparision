import java.util.Scanner;

public class Sample {
	int x1,x2,y1,y2;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter x co-ordinate for first point:");
		x1=sc.nextInt();
		System.out.println("Enter y co-ordinate for first point:");
		y1=sc.nextInt();
		System.out.println("Enter x co-ordinate for second point:");
		x2=sc.nextInt();
		System.out.println("Enter y co-ordinate for second point:");
		y2=sc.nextInt();
	}
	double calculate_length()
	{
		input();
		int temp1=x2-x1;
		int temp2=y2-y1;
		double length=Math.sqrt((Math.pow(temp1, 2)+ Math.pow(temp2, 2)));
		return length;
	}
	void compare1()
	{
		System.out.println("for first length");
		double length1=calculate_length();
		System.out.println("for second length ");
		double length2=calculate_length();
		if(length1==length2)
		{
			System.out.println("lengths are equal...");
		}
		else
		{
			System.out.println("lengths are not equal");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to line comparision computation program!!!");
		Sample obj=new Sample();
		obj.compare1();
		//System.out.println(obj.calculate_length());
	}

}
