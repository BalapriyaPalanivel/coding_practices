package Largest_Element;
// import java.util.*;
public class LargestElement{
    public static int findLargest(int[] num){
        int max = num[0];
        for(int i = 0; i<num.length;i++){
            if(max<num[i]){
                max = num[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] numbers = {2,12,4,2,1};
        System.out.println(findLargest(numbers));
    }
}

