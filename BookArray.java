import java.util.Scanner;

class Booke {
	String title, author;
	public Booke(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

public class BookArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Booke [] book = new Booke[2];
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<book.length;i++) {
			System.out.print("제목>>");
			String title = scanner.nextLine();
			System.out.print("저자>>");
			String author = scanner.nextLine();
			book[i] = new Booke(title, author);
		}
		
		for(int i=0;i<book.length;i++)
			System.out.print("(" + book[i].title + ", " + book[i].author + ")");

		scanner.close();
	}

}
