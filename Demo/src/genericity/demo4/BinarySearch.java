package genericity.demo4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {
        int arr[] ={2,3,4,5,6,7,8,9,10};
        int key =2;
       /* boolean flag =searchKey(arr,key);*/
        int search = Arrays.binarySearch(arr, key);
        System.out.println(search);
    }
   /* public static boolean searchKey(int[] arr,int key){
        int min = 0;
        int max=arr.length-1;
        int mid;
        boolean flag =false;
        while (min<=max){
            mid =(min+max)/2;
            int num = arr[mid];
            if(num==key){
                System.out.println("数字在第"+(mid+1)+"位");
                flag =true;
                break;
            }else if (num>key){
              max=mid-1;
            }else {
                min = mid+1;
            }
        }
        return flag;
    }*/
}
