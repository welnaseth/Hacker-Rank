package algorithms.warmup.findDigits;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Solution app = new Solution();
		Scanner in = new Scanner(System.in);
		int numberOfTestCases = in.nextInt();
		String answer = "";
		
		for(int i = 0; i < numberOfTestCases; i++){
			int numberToTest = in.nextInt();
			answer = answer + app.findDigits(numberToTest) +"\n";
		}
		
		System.out.println(answer);
	}
	
	public int findDigits(int numberToTest){
		
		int copyOfNumberToTest = numberToTest;
		int count = 0;
		
		while(copyOfNumberToTest != 0){
			int divisor = copyOfNumberToTest % 10;
			copyOfNumberToTest = copyOfNumberToTest/10;
			if(numberToTest%divisor == 0){
				count++;
			}
		}
		
		return count;
		
	}

}
