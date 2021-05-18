package lab7_task13_4;

public class First implements Calculate {
	
	protected Additional One = new Additional(0, 0);  //Поле типа Additional - площадь первого треугольника
	protected Additional Two = new Additional(0, 0);  //Поле типа Additional - площадь второго треугольника
	protected double C;  //Дополнительное поле
	
	public First(double C, double f1, double s1, double f2, double s2)
	{
		this.C = C;
		One.Init(f1, s1);
		Two.Init(f2, s2);
	}
	
	public double SumArea()
	{
		Additional One = new Additional(7, 4);
		Additional Two = new Additional(10, 8);
		double a, b;
		a = One.Area();
		b = Two.Area();
		if(a + b >= C)
			return 0;
		else
			return 1;
	}
}
