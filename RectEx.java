class Rectt {
	int width, height;
	public Rectt(int width, int height) {
		this.width=width; this.height=height;
	}
	public boolean equals(Object obj) {
		Rectt p = (Rectt)obj;
		if (width*height == p.width*p.height) return true;
		else return false;
	}
}
public class RectEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectt a = new Rectt(2,3);
		Rectt b = new Rectt(2,3);
		Rectt c = new Rectt(3,4);
		if(a.equals(b)) System.out.println("a is equal to b");
		if(a.equals(c)) System.out.println("a is equal to c");
		if(b.equals(c)) System.out.println("b is equal to c");

	}

}
