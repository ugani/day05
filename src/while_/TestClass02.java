package while_;

public class TestClass02 {

	public static void main(String[] args) {
		/*
		 break
		 -switch 또는 반복문 안에서 사용가능하다.
		 -break를 마나는 순간 해당 종속문장을 빠져나간다.
		 continue
		 -반복문 안에서 사용가능하다.
		 -continue를 만나는 순간 반복문의 위로 올라간다.
		 */
		
		int i = 0;
		while(true) {
			i++;
			System.out.println("i :" +i);
			if(i > 3) {
				break;
			//i가 증감식에 따라 1이 계속 증가되고
			//if문에 i가 3보다 클때까지 출력되고
			//4가 되면 참이 되어 break를 만나서 멈춤
			//if문 단독으로 브레이크를 사용할순 없지만
			// 반복문 안에선 if문에서 브레이크가 사용 가능하다.
			}
		}
		System.out.println("다음 문장들 실행");
		
		System.out.println();
		for(; ; ) {
			System.out.println("for");
			if(i == 4)
				break;
		}
		System.out.println("다음 문장들 실행");

	}

}
