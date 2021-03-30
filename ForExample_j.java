
public class ForExample_j {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, sum=0;
		
		for(i=1; i<=10; i++) {
			sum +=i;
			System.out.print(i);
			
			if(i<=9)
				System.out.print("+");
			else {
				System.out.print("=");
				System.out.print(sum);
			}
		}
	}

}
