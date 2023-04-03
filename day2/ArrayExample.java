package week1.day2;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		int count=0;
		int[] empID = {1,5,7,8,9,0,4,5,2,5,11,21,32,5,23,67};
		Arrays.sort(empID);
		for(int i=0;i<empID.length;i++)
		{
			if(empID[i]==5)
			{
			    count++;
			}
		}
			System.out.println("Count of 5 is "+count);
		}

}
