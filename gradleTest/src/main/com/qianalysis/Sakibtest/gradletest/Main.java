package com.qianalysis.Sakibtest.gradletest;

import org.apache.commons.lang3.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main extends Multiply{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("hello world!");
		int a=in.nextInt();
		int b=in.nextInt();
		mul(a,b);
		System.out.println(StringUtils.swapCase(Arrays.toString(args)));
	}		

}

class Multiply{
	static void mul(int a,int b){
		int n=a*b;
		System.out.println("ans "+n);

	}

}