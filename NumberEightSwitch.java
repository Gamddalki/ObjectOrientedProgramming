import java.util.Scanner;

public class NumberEightSwitch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("커피 주문하세요>>");
		String coffee = scanner.next();
		int num = scanner.nextInt();
		
		switch (coffee) {
		case "에스프레소":
			System.out.println(2000*num + "원입니다.");
			break;
		case "아메리카노": 
			System.out.println(2500*num + "원입니다.");
			break;
		case "카푸치노": 
			System.out.println(3000*num + "원입니다.");
			break;
		case "카페라떼": 
			System.out.println(3500*num + "원입니다.");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}
	}
}
