class Points {
	private int x, y;
	public Points() {
		this.x = this.y = 0;
	}
	public Points(int x, int y) {
		this.x = x; this.y = y;
	}
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoints extends Points{
	private String color;
	public ColorPoints(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}

public class SuperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoints cp = new ColorPoints(5, 6, "blue");
		cp.showColorPoint();

	}

}
