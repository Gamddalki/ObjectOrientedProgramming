class Circlee{
	int radius;
	public Circlee(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
}

public class CircleArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circlee [] c;
		c = new Circlee[5];
		
		for(int i=0;i<c.length;i++)
			c[i] = new Circlee(i);
		for(int i=0;i<c.length;i++)
			System.out.print((int)(c[i].getArea())+" ");

	}
}
