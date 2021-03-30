import java.util.InputMismatchException;
import java.util.Scanner;

public class InputExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요.");
		int sum=0, n=0;
		for(int i=1; i<4; i++) {
			System.out.print(i + ">>");
			try {
				n=scanner.nextInt();
			}
			catch(InputMismatchException e){
				System.out.println("정수가 아닙니다. 다시 입혁하세요!");
				scanner.next();
				i--;
				continue;
			}
			sum += n;
		}
		
		System.out.println("합은 " + sum);
		scanner.close();
	}

}
