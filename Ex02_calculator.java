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
		
		System.out.print(num1+num2);
	}

}
