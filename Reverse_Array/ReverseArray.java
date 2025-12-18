package Reverse_Array;
import java.util.*;
public class ReverseArray {
    public static int[] ReverseArr(int[] arr){
        int [] result = new int[arr.length];
        int n = arr.length;
        for(int i = 0;i<arr.length; i++){
            result[i] = arr[n-1-i]; //Adding the last element to the increasing order of result array
        }
         return result;
    }
    public static void main(String[] args){
        int[] arr = {1,56,23,14,98};
        if(arr.length==0) System.out.println(0);
        if(arr.length==1) System.out.println(arr[0]);
        System.out.println(Arrays.toString(ReverseArr(arr)));
    }
}
