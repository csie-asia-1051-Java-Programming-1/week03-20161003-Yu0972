package hw;
/*
 * Topic: 輸入一個正整數值(不含 0)，傳回該數值是幾位數(# ofdigits)。
 * Date: 2016/10/04
 * Author: 105021045 郭毓呈
 */

import java.util.Scanner;
public class hw01_105021045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("輸入一個正整數值=");
		int sum = 0;
		int n = scn.nextInt();
		for(int m=1 ;; m ++){
		if(Math.pow(10,m) > n){
		sum = m;
		break;
			}
		}
		System.out.print("該數字為"+sum + "位數");
	}
}
