package hw;
/*
 * Topic: 讓使用者輸入一正整數n，計算1(1+1) + 2(2+1) + 3(3+1) + … + n(n+1)並輸出結果。
 * Date: 2016/10/04
 * Author: 105021045 郭毓呈
 */

import java.util.Scanner;
public class hw05_105021045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("輸入一正整數 n =");
		int n = scn.nextInt();
		int m = 0;
		for(int x = n ; x > 0 ; x -- ) {
			m = x * ( x + 1 ) + m ; }
		System.out.println( "1(1+1) + 2(2+1) + 3(3+1) + … + n(n+1) ="+" "+ m );

	}

}
