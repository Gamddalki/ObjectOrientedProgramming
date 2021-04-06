
public class CircleEx {
	
	int radius;
	String name;
	
	public double getArea() {
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleEx pizza;
		pizza = new CircleEx();
		pizza.radius = 10;
		pizza.name = "고구마피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);

		CircleEx donut;
		donut = new CircleEx();
		donut.radius = 2;
		donut.name = "크림도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);

	}

}
