package lab7_task13_4;

public class Additional {

	protected double first;  //����� � �������������� ������������
	protected double second;  //����� b �������������� ������������
	
	public Additional(double first, double second) {
		this.first = first;
		this.second = second;
	}
	
	public void Init(double first, double second) {
		this.first = first;
		this.second = second;
	}
	
	public void Display() {
		System.out.printf("����� a = %f, ����� b = %f\n\n", first, second);
	}
	
	public double GetFirst() {
		return first;
	}
	
	public double GetSecond() {
		return second;
	}
	
	public double Area() {  //����� ���������� ������� �������������� ������������
		return 0.5 * first * second;
	}
}
