public class Diamonds{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i*2-1;j++)
			{
				System.out.print("*");
			}
			for(int j=i;j<9;j++)
			{
				System.out.print(" ");
			}
		System.out.println();
	}
	for(int i=4;i>=1;i--)
	{
		for(int j=1;j<=i*2-1;j++)//decreasing
		{
			System.out.print("*");
		}
		for(int j=1;j<=4-i;j++)
		{
			System.out.print(" ");
		}
		System.out.println();
	
		
	}
}
}
			
			

