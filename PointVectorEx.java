import java.util.Vector;

class Pointttt{
	private int x,y;
	public Pointttt(int x, int y) {
		this.x=x; this.y=y;
	}
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}

public class PointVectorEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Pointttt> v = new Vector<Pointttt>();
		
		v.add(new Pointttt(2,3));
		v.add(new Pointttt(-5,20));
		v.add(new Pointttt(30, -8));
		
		v.remove(1);
		
		for(int i=0; i<v.size(); i++) {
			Pointttt p = v.get(i);
			System.out.println(p);
		}
	}
}
