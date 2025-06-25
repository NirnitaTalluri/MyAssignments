package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int range = 8;
		int firstNumber = 0;
		int secondNumber = 1;
		
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		for(int i = 2; i < range; i++) {
		
			int total = firstNumber+secondNumber;
			System.out.println(total);
			firstNumber = secondNumber;
			secondNumber = total;
			
		}
		
		
	}

}
