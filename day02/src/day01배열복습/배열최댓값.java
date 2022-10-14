package day01배열복습;
import java.util.Random;

public class 배열최댓값 {

	public static void main(String[] args) {
		double[] dArr = {1.1, 3.3, 5.5, 2.3};
		
		double max = dArr[0];
		for (int i = 0; i < dArr.length; i++) {
			if(max < dArr[i]) {
				max = dArr[i];
			}
		}
		System.out.println(max);
		
		Random random = new Random();
		System.out.println( random.nextInt(7) );
		
	}

}
