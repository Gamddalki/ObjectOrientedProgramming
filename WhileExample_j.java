import java.util.Scanner;

public class WhileExample_j {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int count=0, n=0;
		double sum=0;
		
		System.out.print("정수를 입력하고 마지막에 0을 입력하세요.");
		while((n=scanner.nextInt())!=0) {
			sum += n;
			count++;
		}
		System.out.print("정수의 개수는 " + count + "개이며");
		System.out.println("평균은 " + sum/count + "입니다.");
		
		scanner.close();

	}

}
