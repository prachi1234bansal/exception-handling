import java.util.*;
class P7
{
	public static void main(String args[])
	{
		Scanner v=new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		int a=v.nextInt();
		int b=v.nextInt();
		try
		{
			System.out.print("The quotient of "+a+"/"+b +"="+ a/b);
			//System.out.println(a+"/"+b +"="+ a/b);
		}
		catch (Exception s)
		{
			System.out.println("DivideByZeroException caught");
		}
		finally
		{
			System.out.println("Inside finally block");
		}

}
}