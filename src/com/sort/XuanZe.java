package com.sort;

/**
 * @Version 2019
 * @Author:kele
 * @Date:2020/6/22
 * @Content:
 */
public class XuanZe {

    public static void main(String[] args) {
        int a[]=new int[]{6,5,4,1,3};

        for (int i=0;i<a.length;i++){
            //默认第一个是最小的
            int min=a[i];
            int index=i;
            int flag=0;
            for (int j=i+1;j<a.length;j++){
                if(min>a[j]){
                    min=a[j];
                    index=j;
                    flag+=1;
                }
            }
                //然后将最小值与本次循环的，开始值交换
                int temp = a[i];
                a[i] = min;
                a[index] = temp;
                //说明：将i前面的数据看成一个排好的队列，i后面的看成一个无序队列。每次只需要找无需的最小值，做替换
        }

        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
