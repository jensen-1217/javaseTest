package genericity.demo4;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr ={3,5,4,1,2};
        /*for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0;  j< arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }*/
        Arrays.sort(arr);
       /* for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/
        System.out.println(Arrays.toString(arr));
    }

}
