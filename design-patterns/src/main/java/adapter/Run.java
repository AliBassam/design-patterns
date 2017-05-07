package adapter;

/**
 * Convert the interface of a class into another interface that clients expect.
 * The adapter pattern lets classes work together that couldn’t otherwise
 * because of incompatible interfaces.
 * 
 * The most common example of this type can be found with mobile charging
 * devices. If our charger is not supported by a particular kind of switchboard,
 * we need to use an adapter. Even the translator who is translating language
 * for one person is following this pattern in real life.
 * 
 * @author ali
 * 
 */
public class Run {
	public static void main(String[] args) {

		CalculatorAdapter cal=new CalculatorAdapter();
		Triangle t = new Triangle(20,10);
		System.out.println("Area of Triangle is :" + cal.getArea(t));
	}
}
