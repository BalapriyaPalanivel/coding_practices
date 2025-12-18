package Second_Largest;

public class SecondLargest {
    public static int SecondLar(int[] arr){
        if(arr.length<2) return -1;
        int Largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int x : arr){
            if(x > Largest){
                secondLargest = Largest;
                Largest = x;
            }
            else if(x<Largest && x>secondLargest){
                secondLargest = x;
            }
        }
        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }
    public static void main(String[] args){
        int[] num = {5,5,4,4,3};
        System.err.println(SecondLar(num));
    }
}
