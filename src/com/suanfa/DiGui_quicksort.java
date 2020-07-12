package com.suanfa;

import java.util.Arrays;

/**
 * @Version 2019
 * @Author:kele
 * @Date:2020/7/8
 * @Content:
 */
public class DiGui_quicksort {

    public static void main(String[] args) {

        int a[]=new int[]{3,1,6,38,11,44};
        quicksort(a,a.length-1);
        System.out.println("排序完成："+ Arrays.toString(a));
    }

    private static void quicksort(int[] a, int i) {
        if(i>0){
            quicksort(a,i-1);
            for (;i>0&&a[i]<a[i-1];i--){
                int temp= a[i];
                a[i]=a[i-1];
                a[i-1]=temp;
            }

        }
    }
}
