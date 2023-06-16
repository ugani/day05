package while_;

import java.util.Scanner;

public class TestClass04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, sum=0;
		while(true) {
			System.out.println("1~10 사이 수 입력 :");
			i = input.nextInt();
			if(i > 0 && i <= 10)
				break;
			//조건에 맞는 값이 나오면 반복문이 끝나고 for문으로 넘어가 계산이됨
			else if( i < 0 || i > 10) {
				System.out.println("다시 입력해라.....");
				continue;
				//조건에 맞는 값이 아니면 다시 반복문으로 올려서 다시 입력을 받음
			}
		}
		for(int k=1; k<=i; k++) {
			sum += k;
		}
		System.out.println("1~"+i+" 까지의 합 :"+sum);

	}

}
