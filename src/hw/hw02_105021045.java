package hw;
/*
 * Topic: 讓使用者輸入多個數，統計正數、負數及零各有多少個。
 * Date: 2016/10/04
 * Author: 105021045 郭毓呈
 */

import java.util.Scanner;
public class hw02_105021045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a = 0 ;
		int b = 0 ;
		int c = 0 ;
		System.out.print("輸入多少個數=");
		int d = scn.nextInt();
		System.out.print("輸入"+d+"個數:");
		for(int f = 0 ; f < d ; f ++ ){
		int g = scn.nextInt();
		if(g > 0)
		a ++ ;
		else if(g < 0)
		c ++ ;
		else
		b ++ ;
		  }
		System.out.println("正數"+a+"個，負數"+c+"個，零"+b+"個");
	}
}
