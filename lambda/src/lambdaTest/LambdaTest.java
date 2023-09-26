package lambdaTest;

public class LambdaTest {
	public static void main(String[] args) {
		LambdaInter1 lambdaInter = number -> number % 10 == 0;
		LambdaInter2 lambdaInter2 = () -> { 
			int total = 0;
			
			for (int i = 0; i < 10; i++) {
				total += i + 1;
			}
			return total;
		};
		
		LambdaInter3 lambdaInter3 = number -> number % 2 == 1;
		
		
	}
}
