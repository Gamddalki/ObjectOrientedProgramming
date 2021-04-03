
public class foreachEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] n = {1,2,3,4,5};
		int sum=0;
		
		for(int k : n) {
			System.out.print(k + " ");
			sum += k;
		}
		System.out.println("합은 " + sum);
		
		String f[] = {"사과", "배", "포도", "귤", "복숭아", "오렌지"};
		for(String s : f) {
			System.out.print(s + " ");
		}

	}
}
