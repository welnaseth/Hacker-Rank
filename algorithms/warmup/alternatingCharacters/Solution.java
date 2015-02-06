package algorithms.warmup.alternatingCharacters;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int numberOfCases = Integer.parseInt(in.nextLine());
		for(int i = 0; i<numberOfCases; i++){
			String toCheck = in.nextLine();
			int numberOfDeletions = 0;
			for(int j = 0; j<toCheck.length()-1; j++){
				if(toCheck.charAt(j) == toCheck.charAt(j+1)){
					numberOfDeletions++;
				}
			}
			System.out.println(numberOfDeletions);
		}

	}

}
