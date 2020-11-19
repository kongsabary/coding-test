package test;

import java.util.Scanner;

public class Test02 {
	// 직사각형 별찍기
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("가로값(정수)를 입력해주세요.");
        int a = sc.nextInt();
        System.out.println("세로값(정수)를 입력해주세요.");
        int b = sc.nextInt();
        
        for(int i = 1; i <= b; i++) {
            for(int j = 1; j <= a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

