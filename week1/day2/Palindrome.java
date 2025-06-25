package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int inputNumber = 151;
		//System.out.println(inputNumber%10);
		//System.out.println(inputNumber/10);
		int reverse = 0;
		for (int temp = inputNumber; temp !=0; temp = temp/10 ) {
			int rem = temp%10;
			reverse = reverse *10 + rem;
			
		}
		if (inputNumber==reverse)
		{ 
			System.out.println("It is a palindromenumber"); 
			}
		
		
	}

}
