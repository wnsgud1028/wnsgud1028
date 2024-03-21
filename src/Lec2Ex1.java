import java.util.Scanner;

public class Lec2Ex1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int a;
		int b;

		System.out.println("첫 번째 수: ");
		a = input.nextInt();
		System.out.println("두 번째 수: ");
		b = input.nextInt();
		
		if (a>b) {
			System.out.println("둘 중에 더 큰 수는 :"+a);
		}
		else {
			System.out.println("둘 중에 더 큰 수는 :"+b);
		}
	}

}
