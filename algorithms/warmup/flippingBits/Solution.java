package algorithms.warmup.flippingBits;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numberOfNumbersToFlip = Integer.parseInt(in.nextLine());
		for(int i = 0; i<numberOfNumbersToFlip; i++){
			long numberToFlip = Long.parseLong(in.nextLine());
			long flippedBitNumber = (~numberToFlip)& 0xffffffffl; //trick to get around no unsigned ints in java as of java 7 (used to code solution)
			System.out.println(flippedBitNumber);
		}

	}

}
