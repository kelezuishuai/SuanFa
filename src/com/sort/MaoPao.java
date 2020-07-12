package com.sort;

/**
 * @Version 2019
 * @Author:kele
 * @Date:2020/6/22
 * @Content:
 */
public class MaoPao {

    public static void main(String[] args) {
        int a[]=new int[]{6,5,4,1,3};

        for (int i=0;i<a.length;i++){
            //外层循环，控制循环次数

            //优化排序
            int flag=0;
            for (int j=0;j<a.length-i-1;j++){
                //内层循环，升序（如果前一个值比后一个值大，则交换）
                //内层循环一次，获取一个最大值
                if (a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                    flag=1;
                }

            }
//            if(flag==0);
//            {
//                return;
//            }
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
}
