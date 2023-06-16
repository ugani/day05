package while_;

import java.util.Scanner;

public class TestClass05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//입력한 정수를 값을 하나씩 출력하는 프로그램
		int i, temp;
		System.out.print("수 입력 : ");
		i = input.nextInt();
		
		boolean bool = true;
		//boolean -> 참과 거짓만 판별함 
		// true일 경우 bool로 와일문이 실행됨
		while(bool) {
			// ex) i -> 123일 경우
			temp = i%10;
			// 123을 10으로 나눠서 나머지는 3이 되고 temp에는 3이 들어가고
			i = i/10;
			//i는 123이고 10으로 나누면 i에 12라는 숫자가 들어가게 되고
			System.out.println(temp + ", ");
			// 그리고 템프를 출력하면 3이라는 숫자를 가지고 있어서 3을 출력하고
			if(i == 0) {
//				break;
				bool = false;
				//i가 0이되면 bool이 거짓이 되어 브레이크 역할을 함
				//i가 0이 될때까지 위로 올라가서 다시 반복함
				//i는 123에서 12가 되고 12에서 1이 되고 0이 될때 반복문을 빠져나옴
			}
		}
		System.out.println("다음 문장들 실행");
	}

}
