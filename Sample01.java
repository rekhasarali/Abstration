package Abstraction;

abstract class Shape
{
	abstract void draw();
}
class circle extends Shape
{
	void draw()
	{
		System.out.println("drawing circle");	}
	
}
class rectangle extends Shape
{
	void draw()
	{
		System.out.println("drawing rectangle");	}
	
}

public class Sample01 {

	public static void main(String[] args) {
		Shape s=new circle();
		s.draw();
		Shape r=new rectangle();
		r.draw();
	

	}

}
