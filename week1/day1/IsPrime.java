package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		int n=11;
		int count=0;
		if(n<=1)
		{
			System.out.println("Number is not a prime");
			return;
		}
		for(int i=1;i<=n/2;i=i+1)			
		{
			if(n % i == 0)
			{
				count++;
			}
		}
		if(count>1)
		{
			System.out.println("The number is not a prime");
		}
		else
		{
			System.out.println("The number is Prime");
		}
	}

}
