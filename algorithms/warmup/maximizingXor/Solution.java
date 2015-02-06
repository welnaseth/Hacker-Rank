package algorithms.warmup.maximizingXor;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args){
		
		Solution app = new Solution();
		Scanner in = new Scanner(System.in);
		int left = in.nextInt();
		int right = in.nextInt();
		
		System.out.println(app.maximizingXor(left, right));
	}
	
	public int maximizingXor(int left, int right){
		int max = 0;
		for(int i = left; i <= right; i++){
			for(int j = i; j <= right; j++){
				if((i^j) > max){
					max = i^j;
				}
			}
		}
		return max;
	}

}
