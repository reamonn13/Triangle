package lab7_task13_4;

public class Third implements Calculate {
	
	protected Volume Five = new Volume(0, 0, 0);  //Поле типа Volume - объём первой пирамиды
	protected Volume Six = new Volume(0, 0, 0);  //Поле типа Volume - объём второй пирамиды
	protected double C;  //Дополнительное поле

	public Third(double C, double f1, double s1, double t1, double f2, double s2, double t2)
	{
		this.C = C;
		Five.Init(f1, s1, t1);
		Six.Init(f2, s2, t2);
	}
	
	public double SumArea()
	{
		double a, b;
		Volume Five = new Volume(1, 2, 3);
		Volume Six = new Volume(4, 8, 6);
		a = Five.Area();
		b = Six.Area();
		if(a + b >= C)
			return 0;
		else
			return 1;
	}
}
