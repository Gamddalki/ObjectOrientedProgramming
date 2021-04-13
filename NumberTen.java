import java.util.Scanner;

public class NumberTen {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("커피 주문하세요>>");
		String coffee = scanner.next();
		int num = scanner.nextInt();
		
		if(coffee.equals("에스프레소")) {
			int sum = 2000*num;
			if(num >= 10)
				sum *= 0.95;
			System.out.println(sum+"원입니다.");
		}
		else if(coffee.equals("아메리카노"))
			System.out.println(2500*num + "원입니다.");
		else if(coffee.equals("카푸치노"))
			System.out.println(3000*num + "원입니다.");
		else if(coffee.equals("카페라떼"))
			System.out.println(3500*num + "원입니다.");
		else
			System.out.println("잘못된 입력입니다.");
	}
}
