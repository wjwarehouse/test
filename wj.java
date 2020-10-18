package CG;
import java.util.Scanner;
public class wj {
        public static void main(String[] args) {
            System.out.println("Please input 10 numbers:");
            int arr[]=new int[10];
            Scanner in=new Scanner(System.in);
            for(int i=0;i<arr.length;i++){
                arr[i] =in.nextInt();
            }
            System.out.println("Your numbers are:");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println("\nPlease input m:");
            int m=in.nextInt();
            int temp[]=new int[m];
            int i,j;
            for(i=arr.length-1,j=m-1;i>arr.length-m||j>=0;i--,j--){//储存在temp
                temp[j] = arr[i];
            }
            for(i=arr.length-1;i>=m;i--){//后移
                arr[i]=arr[i-m];
            }
            for(i=0,j=0;i<m;i++,j++) {//重新赋值
                arr[i] = temp[j];
            }
            System.out.println("The new numbers are:");
            for(i=0;i<arr.length;i++)
                System.out.print(arr[i]+" ");
        }
}

