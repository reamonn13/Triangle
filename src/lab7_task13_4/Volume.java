package lab7_task13_4;

public class Volume extends Additional{
	
	private double z;  //Высота прямоугольной пирамиды
	
	public Volume(double first, double second, double z)
	{
		super(first, second);
		this.z = z;
	}
	
	public void Init(double first, double second, double z)
	{
		this.Init(first, second);
		this.z = z;
	}
	
	public double Get()
	{
		return z;
	}
	
	public void Put(int num)
	{
		z = num;
	}
	
	public double Area()
	{
		return (first * second * z) / 6;
	}
}
