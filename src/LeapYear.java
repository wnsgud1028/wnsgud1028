import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int year;
		int result;

		System.out.print("년 수 입력:");
		year = input.nextInt();
		
		result = year%4;
		
		if (result == 0) {
			System.out.println(+year+"년은 윤년 입니다.");	
		}else {
				System.out.println(+year+"년은 윤년이 아닙니다.");
		}
	}

}

/* 입력받은 해가 윤년인지 확인하는 프로그램(4로 나눠지면 윤년)
 * 4로 나눴을때 나머지가 0이어야 윤년이라고 출력 , 아니면 윤년이 아닙니다라고 출력. */
