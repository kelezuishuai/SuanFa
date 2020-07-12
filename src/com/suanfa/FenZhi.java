package com.suanfa;

import java.util.Scanner;

/**
 * @Version 2019
 * @Author:kele
 * @Date:2020/7/8
 * @Content:
 */
public class FenZhi {

    private static int[] data;

    public static void main(String[] args) {
        for(int i=1;i<=2;i++){
            int A[]=new int[]{1,2,7,9,25,44,66,99};
            FenZhi f=new FenZhi(A);
            System.out.println("输入想查找的数：");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            serch(n);
            System.out.println(f.serch(n));
        }

    }

    public FenZhi(int[] data) {
        this.data = data;
    }

    public static int serch(int n) {
        int min=0;
        int max=data.length-1;
        int target=0;
        while(true){
            target=(min+max)/2;
            if(n>data[target]){
                min = target + 1;
            }
            if(n<data[target]){
                max=target-1;
            }
            if(n==data[target]){
                return target;
            }
            if(min>max){
                return -1;
            }

        }
    }


}
