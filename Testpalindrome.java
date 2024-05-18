import java.util.Scanner;
public class Testpalindrome{
public static void main (String args[]){
System.out.println(" enter the number");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int n=num;
int rem;
int rev=0;
while(n!=0)
rem=num%10;
rev=(rev*10)+rem;
 num=num/10;
if(rev==n)
{
System.out.println("it is a palindrome");
}
else
{
System.out.println("it is not  a palindrome");
}
}
}