package while_;

public class TestClass08 {

	public static void main(String[] args) {
//		for(int i=0; i<3; i++) {
//			for(int k=0; k<5; k++) {
//				System.out.println(i+" , "+k);
//			}
//		}
		//i가 0일때 다음 조건문으로 가서 k가 0이면 
		//종속문장 0,0이 출력되고
		//k가 증가 후에 1이되면 다시 0,1 출력하고
		//k가 0,4가 되면 반복문을 탈출해서 
		//다시 k가 1이 증감되고
		//i조건식이 맞으면 똑같이 1,0~1,4까지 출력하고
		//k가 3이 될떄까지 반복함
		
		for(int i=2; i<10; i++) {
			for(int k = 1; k<10; k++) {
				System.out.println(i+"*"+k+"="+(i*k));
			}
		}

	}

}
