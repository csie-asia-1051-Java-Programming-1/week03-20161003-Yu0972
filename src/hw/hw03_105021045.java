package hw;
/*
 * Topic: 讓使用者輸入一正整數n，用for迴圈計算n!後輸出。
 * Date: 2016/10/04
 * Author: 105021045 郭毓呈
 */

import java.util.Scanner;
public class hw03_105021045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Scanner scn = new Scanner(System.in);
    	System.out.println("輸入一正整數=");
    	int n = scn.nextInt();
    	int x = n;
    	int m = 1;
        for (int i = x; i > 0; i -- ){ 
        m = m * i;
        }
        System.out.println(n+"!"+"="+m);
	}

}
