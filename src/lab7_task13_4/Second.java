package lab7_task13_4;

public class Second implements Calculate {
	
	protected Additional Three = new Additional(0, 0);  //Поле типа Additional - площадь первого треугольника
	protected Volume Four = new Volume(0, 0, 0);  //Поле типа Volume - объём пирамиды
	protected double C;  //Дополнительное поле
	
	public Second(double C, double f1, double s1, double f2, double s2, double t2)
	{
		this.C = C;
		Three.Init(f1, s1);
		Four.Init(f2, s2, t2);
	}
	
	public double SumArea()
	{
		Additional Three = new Additional(4, 5);
		Volume Four = new Volume(15, 15, 4);
		double a, b;
		a = Three.Area();
		b = Four.Area();
		if(a + b >= C)
			return 0;
		else
			return 1;
	}
}
