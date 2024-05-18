import java.util.java;
public class Fibonacci{
	public static void main(string args[])
	{
		System.out.println("enter the number:");
		Scanner sc=new Scanner(System.in);
		int n=nextInt();
		int f=0;
		int s=1;
		int t=0;
		while(f<n){
			System.out.println(f+" ");
			t=f+s;
			f=s;
			s=t;
		}
	}
}