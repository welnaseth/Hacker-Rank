package algorithms.warmup.utopianTree;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int numberOfTestCases = in.nextInt();
		
		for(int i = 0; i < numberOfTestCases; i++){
			
			int heightOfTree = 1;
			int numberOfCycles = in.nextInt();
			
			for(int j = 0; j < numberOfCycles; j++){
				if(j%2 == 0){
					heightOfTree *= 2;
				} else {
					heightOfTree += 1;
				}
			}
			
			System.out.println(heightOfTree);
		}

	}

}
