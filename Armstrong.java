import java.util.Scanner;
public class Armstrong{
	public static void main(String args[]){
		System.out.println("enter the number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rem=0;
		int arm=0;
		int n=num;
		while(num>0){
			rem=num%10;
			arm=arm+(rem*rem*rem);
			num=num/10;
		}
		if(arm==n)
		{
			System.out.println("armstrong");
		}
		else{
			System.out.println("not armstrong");
		}
	}
}
		
		