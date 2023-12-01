package ch03_scanner;

import java.util.Scanner;

public class Ex02_calculator {

	public static void main(String[] args) {
		/**
		 * 정수 2개를 각각 스캐너로 num1, num2에 입력 받은 수의 합을 출력하세요.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 수: ");
		int num1 = scanner.nextInt();
		System.out.print("두번째 수: ");
		int num2 = scanner.nextInt();
		int sum = num1 + num2;
		System.out.println("합계: "+ sum);
		System.out.println(num1 + "과 " + num2 + "의 합계는 " + sum + "입니다.");
		System.out.println(num1 + "+ " + num2 + "=");
		System.out.print(num1+num2);
		
		System.out.print("이름을 입력하세요: ");
		String name = scanner.next();
		System.out.println(name);
		
		//띄어쓰기가 필요한 경우 nextLine를 사용한다
		
		scanner.nextLine();  // 중간에 scanner.nextLine를 사용하면 해결됨
		
		// next 다음 nextLine를 사용할경우 작동이 안되는 경우가 많다
		System.out.println("주소를 입력하세요: ");
		String address = scanner.nextLine(); 
		System.out.print(address);
	}

}
