public class Even{
	public static void main(String args []){
	int	c=0;
		for(int i=0;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
				c+=1;
			}
			
		}
		System.out.println(c);
	}
}