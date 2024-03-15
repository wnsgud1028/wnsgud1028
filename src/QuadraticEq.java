import java.util.Scanner; // 스캐너 함수 포함

public class QuadraticEq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); // 스캐너 함수 입력
		System.out.println("2차 방정식의 계수를 입력하세요");
		System.out.println("ax^2+bx+c");
		System.out.print("a:");
		double a = input.nextDouble();
        System.out.print("b:");
        double b = input.nextDouble();
        System.out.print("c:");
        double c = input.nextDouble();
        // 2차방정식의 형태를 제공하고 각 계수를 입력 받음
        
        double discriminant = b*b-4*a*c; //판별식 연산
        
        		
        if (discriminant > 0) { // 판별식이 0보다 클때 근이 2개
        	   double root1 = (-b + Math.sqrt(discriminant)) / (2 * a); //루트 연산을 위해 함수 호출
               double root2 = (-b - Math.sqrt(discriminant)) / (2 * a); //루트 연산을 위해 함수 호출
               System.out.println("두 근:"+root1 +","+root2);
           } else if (discriminant == 0) { // 판별식이 0일때 근이 1개 
               double root = -b / (2 * a);
               System.out.println("한 근:"+root);
           } else { // 판별식이 0보다 작을때 근이 0개
               System.out.println("실근이 없습니다.");
           }
        }
	}

