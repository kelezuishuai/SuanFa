package com.sort;

/**
 * @Version 2019
 * @Author:kele
 * @Date:2020/6/22
 * @Content:
 */
public class ChaRu {

    public static void main(String[] args) {
        int a[]=new int[]{3,2,1,5,9};

        //外层循环，默认从第二个开始比较
        for (int i=1;i<a.length;i++){
            for (int j=i;j>0;j--){
                //内层循环，与前面排好序的数据相比，如果后面的数小于前面的则交换
                if (a[j]<a[j-1]){
                    int t=a[j-1];
                    a[j-1]=a[j];
                    a[j]=t;

                }
                else {
                    break;
                }
            }
        }

        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
