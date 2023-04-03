package week1.day2;

public class CarAssignment {
	public void printCarName()
	{
		System.out.println("Toyoto");
	}
	public void printCarModel()
	{
		System.out.println("SUV");
	}
	private String getCarRegNo()
	{
		String carNo = "TN2255";
		return carNo;
	}
	public boolean checkPuncture()
	{
		boolean Puncture = false;
		if(Puncture)
		{	System.out.println("Puncture");
		}
		else
		{		System.out.println("Not Puncture");
		}
		return Puncture;
	}
	public int getMultiple(int a,int b,int c)
	{
		int d = a*b*c;
		return d;
	}

	public static void main(String[] args) {
	    CarAssignment obj = new CarAssignment();
		obj.printCarName();
		obj.printCarModel();
		int multiple = obj.getMultiple(2,2,2);
		System.out.println(multiple);
		String carRegNo = obj.getCarRegNo();
		System.out.println(carRegNo);
		obj.checkPuncture();
		
		

	}

}
