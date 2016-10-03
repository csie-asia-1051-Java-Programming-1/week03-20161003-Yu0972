package ex;
/*
 * Topic: 輸入一個字串，並把它反向輸出。
 * Date: 2016/10/03
 * Author: 105021045 郭毓呈
 */

import java.util.Scanner;
public class ex01_105021045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Scn = new Scanner(System.in); 
        String str = Scn.next();
        char []data=str.toCharArray();
        for (int i = data.length-1;i>=0;i--){
        System.out.print(data[i]);
        }
	}

}
