package lab7_task13_4;

public class Primary {
	
	public static void main (String args[] )
	{
		double k;
		
		First S = new First(50, 2, 3, 4, 5);
		k = S.SumArea();
		if(k == 0)
			System.out.printf("Cумма площадей треугольников больше/равна С - ложь (%f).", k);
		if(k == 1)
			System.out.printf("Cумма площадей треугольников меньше С - истина (%f).", k);
		System.out.printf("\n\n");
		
		Second SV = new Second(930, 15, 15, 8, 7, 6);
		k = SV.SumArea();
		if(k == 0)
			System.out.printf("Cумма площадей треугольников больше/равна С - ложь (%f).", k);
		if(k == 1)
			System.out.printf("Cумма площадей треугольников меньше С - истина (%f).", k);
		System.out.printf("\n\n");
		
		Third V = new Third(10, 3, 4, 5, 4, 6, 3);
		k = V.SumArea();
		if(k == 0)
			System.out.printf("Cумма площадей треугольников больше/равна С - ложь (%f).", k);
		if(k == 1)
			System.out.printf("Cумма площадей треугольников меньше С - истина (%f).", k);
	}
}
