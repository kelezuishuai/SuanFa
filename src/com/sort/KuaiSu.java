package com.sort;

import java.util.Arrays;

/**
 * @Version 2019
 * @Author:kele
 * @Date:2020/6/23
 * @Content:
 */
public class KuaiSu {

    public static int Mid(int a[],int low,int high){
        int t=a[low];//数组第一个数为基准数
        while(low<high){
            while(low<high&&a[high]>t){
                high--;
            }
            a[low]=a[high];//比基准数小移动到低端
            while(low<high&&a[low]<t){
                low++;
            }
            a[high]=a[low];//比基准数大移动到高端
        }
        a[low]=t;
        return low;
    }
    public static void quicksort(int a[],int low,int high){
        if(low<high){
            int mid=Mid(a,low, high);
            quicksort(a, low, mid-1);
            quicksort(a, mid+1, high);
        }
    }
    public static void quick(int a[]){
        if(a.length>0){
            quicksort(a, 0,a.length-1);
        }
    }
    public static void main(String[] args) {
        int a[]={42,96,23,89,58,75,36,30,57,61};
        System.out.println("未快速排序前 :"+Arrays.toString(a));
        quick(a);
        System.out.println("快速排序后 :"+ Arrays.toString(a));
    }

}
