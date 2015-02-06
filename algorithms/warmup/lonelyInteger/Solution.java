package algorithms.warmup.lonelyInteger;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	static int lonelyinteger(int[] a) {

		int[] numberCount = new int[101];
		for(int i = 0; i<a.length; i++){
			numberCount[a[i]]++;
		}
		for(int i = 0; i<numberCount.length; i++){
			if(numberCount[i] == 1){
				return i;
			}
		}
		
		return 0;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int res;

		int numberOfNumbers = Integer.parseInt(in.nextLine());
		int[] numberArray = new int[numberOfNumbers];
		int temp;
		String next = in.nextLine();
		String[] next_split = next.split(" ");

		for(int i = 0; i < numberOfNumbers; i++) {
			numberArray[i] = Integer.parseInt(next_split[i]);	
		}

		res = lonelyinteger(numberArray);
		System.out.println(res);

	}
}
