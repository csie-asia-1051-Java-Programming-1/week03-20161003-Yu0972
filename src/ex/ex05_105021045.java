package ex;
/*
 * Topic: 輸入一正整數，判斷其奇偶數。
 * Date: 2016/10/03
 * Author: 105021045 郭毓呈
 */

import java.util.Scanner;
public class ex05_105021045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scn = new Scanner(System.in); 
		int n = Scn.nextInt();
		if (n%2==0){
			System.out.print("偶數");
		}else{
			System.out.print("奇數");
		}

	}

}
