package com.suanfa;

import java.util.Scanner;

/**
 * @Version 2019
 * @Author:kele
 * @Date:2020/7/8
 * @Content:
 */
public class DiGui {

    //计算n的阶乘
    public static void main(String[] args) {
        System.out.println("输入计算的数：");
        for (int i=1;i<=2;i++){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            fact(n);
            System.out.println(fact(n));
        }


    }

    private static int fact(int n) {
        if(n==0){
            return 1;
        }
        else {
            return n* fact(n-1);
        }
    }
}
