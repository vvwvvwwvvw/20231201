package ch03_scanner;

// java.utill 패키지에 소속된 Scanner 클래스를 가져옴
import java.util.Scanner;

public class Ex01_Scanner {

	public static void main(String[] args) {
		// scanner 라는 이름에 Scanner 클래스 객체 선언
		
		Scanner scanner = new Scanner(System.in);
		//ln 이라는 명령어는 그 다음줄에 출력을 하는것이기 때문에 생략
		System.out.print("숫자를 입력하세요: ");
		int num1 = scanner.nextInt();
		System.out.println(num1);

	}

}
