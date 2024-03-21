import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오:");
		int a =  input.nextInt();
		
		if (a%2==0)
		{
			System.out.println("입력된 정수는 짝수입니다.");
		}
		else
		{
			System.out.println("입력된 정수는 홀수입니다.");
		}
	}
}
