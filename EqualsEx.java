class Pointtt {
	int x,y;
	public Pointtt(int x, int y) {
		this.x=x; this.y=y;
	}
	public boolean equals(Object obj) {
		Pointtt p = (Pointtt)obj;
		if(x == p.x && y == p.y) return true;
		else return false;
	}
}

public class EqualsEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pointtt a = new Pointtt(2,3);
		Pointtt b = new Pointtt(2,3);
		Pointtt c = new Pointtt(3,4);
		if(a==b) System.out.println("a==b");
		if(a.equals(b)) System.out.println("a is equal to b");
		if(a.equals(c)) System.out.println("a is equal to c");
	}
}
