package algorithms.warmup.isFibo;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Solution app = new Solution();
		Scanner in = new Scanner(System.in);
		int numberOfTestCases = in.nextInt();
		
		for(int i = 0; i < numberOfTestCases; i++){
			long numberToTest = in.nextLong();
			if(app.isFibo(numberToTest)){
				System.out.println("IsFibo");
			} else {
				System.out.println("IsNotFibo");
			}
		}

	}
	
	public boolean isFibo(long numberToTest){
		
		long fib1 = 0;
		long fib2 = 1;
		
		while(true){
			if(numberToTest == fib1){
				return true;
			} else if(numberToTest < fib1){
				return false;
			} else {
				long temp = fib1;
				fib1 = fib2;
				fib2 += temp;
			}
		}
	}

}
