package lab7_task13_4;

public class Additional {

	protected double first;  //Катет а прямоугольного треугольника
	protected double second;  //Катет b прямоугольного треугольника
	
	public Additional(double first, double second) {
		this.first = first;
		this.second = second;
	}
	
	public void Init(double first, double second) {
		this.first = first;
		this.second = second;
	}
	
	public void Display() {
		System.out.printf("Катет a = %f, катет b = %f\n\n", first, second);
	}
	
	public double GetFirst() {
		return first;
	}
	
	public double GetSecond() {
		return second;
	}
	
	public double Area() {  //Метод нахождения площади прямоугольного треугольника
		return 0.5 * first * second;
	}
}
