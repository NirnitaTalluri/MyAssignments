package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int inputNumber=13;
		int count=0;
		
		for(int i=2;i<=inputNumber-1;i++) {
			if(inputNumber%i==0) {
				count++;
			}
		}
		
		if(count == 0) {
			System.out.println("It is a prime number");
		} else {
			System.out.println("Not a prime number");
		}
	}

}
