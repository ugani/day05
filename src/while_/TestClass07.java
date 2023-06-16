package while_;

public class TestClass07 {

	public static void main(String[] args) {
//		for(int k=0; k < 3; k++) {
//			System.out.println("-----상위 반복문 시작");
//			for ( int i = 0; i < 3; i++) {
//				System.out.println(i+".for");
//			}
//			
//			System.out.println("------상위 반복문 끝");
//		}
		
		int kk = 0 , ii = 0;
		while( kk  < 3) {
			System.out.println("-----상위 반복문 시작");
			ii = 0;
			while ( ii < 3) {
				System.out.println(ii+".for");
				ii++;
			}
			
			System.out.println("------상위 반복문 끝");
			
			kk++;
		}
	}

}
