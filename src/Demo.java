/**
 * @Version 2019
 * @Author:kele
 * @Date:2020/6/20
 * @Content:
 */
public class Demo {

    public static void main(String[] args) {

        int a[]=new int []{5,1,3,4};

        //冒泡
//        for(int i=0;i<a.length-1;i++){
//
//            for (int j=0;j<a.length-i-1;j++){
//                if(a[j]>a[j+1]){
//                    int t=a[j+1];
//                    a[j+1]=a[j];
//                    a[j]=t;
//                }
//            }
//        }

        //选择
        for(int i=0;i<a.length;i++){
            int min=a[i];
            int index=i;

            for (int j=i+1;j<a.length;j++){
                if(min>a[j]){
                    min=a[j];
                    index=j;
                }
            }
            int t=a[i];
            a[i]=min;
            a[index]=t;
        }

        System.out.println("排序后的数组为:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }

    }
}
