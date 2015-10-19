package com.qianalysis.Sakibtest.gradletest;

import org.apache.commons.lang3.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main extends sum{
	public static void main(String[] args){
		int n;
		Scanner in = new Scanner(System.in);
		
		System.out.println("hello world!");

		n = in.nextInt();
		summation(n);
		
		System.out.println(StringUtils.swapCase(Arrays.toString(args)));

	}		

}

class sum{
	static void summation(int n){
		int ans=0;
		while(n>0){
			ans+=n%10;
			n/=10;
		}
		System.out.println("blah blah "+ans);
	}
	
}