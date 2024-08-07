//Problem statement

// An odd number is an integer which is not a multiple of 2.
// You are required to implement the following function:
// Int SumOddIntegers(int arr[], int n): The function accepts an integer array 'arr' of length 'n' as its argument. You are required to
// calculate the sum of all odd integers in an array 'an' and return the same.


import java.util.*;
public class SumOdd {
    public static int SumofOdd(int arr[], int n){
        int sum = 0;
        for(int i = 0; i<n; i++){
            // if(arr[i] < 0){
            //     arr[i] = Math.abs(arr[i]);
            // }
            if(arr[i]%2 != 0){
                sum += arr[i];
            }
        }
        return sum;
    }
    public static void main(String x[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = s.nextInt();
        }
        int result = SumofOdd(arr, n);
        System.out.println(result);
        s.close();
    }
}
