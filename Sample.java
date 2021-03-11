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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to line comparision computation program!!!");
		Sample obj=new Sample();
		//System.out.println(obj.calculate_length());
	}

}
