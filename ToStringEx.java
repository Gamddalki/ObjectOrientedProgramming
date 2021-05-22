class Pointt {
	private int x, y;
	public Pointt(int x, int y) {
		this.x=x; this.y=y;
	}
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}
}

public class ToStringEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pointt a = new Pointt(2,3);
		System.out.println(a.toString());
		System.out.print(a);
	}
}
