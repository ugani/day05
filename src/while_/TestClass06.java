package while_;

public class TestClass06 {

	public static void main(String[] args) {
		// 무조건 1번은 실행된다.
		int su = 5, i =10;
		do {
			//종속문장
			System.out.println("do while :"+i);
			i++;
		}while(i < su); //조건식
		System.out.println("다음 문장들 실행!");
		//i가 su보다 크면 반복문은 실행되지 않음
		//ex) 10이면 반복문은 실행되지 않고, 1이면 1~4까지 출력이되고 5가되면 멈춤
		while(i < su) {
			System.out.println("와일 :" +i);
			i++;
		}
		System.out.println("다음 문장들 실행!");
	}

}
