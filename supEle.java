// In an array a superior element is one which is greater than all elements to its right. The rightmost element
// will always be considered as a superior element. You are given a function,
// Int FindNumberOfSuperiorElements(int* arr, int n):| The function accepts an integer array 'arr' and its length 'n'. Implement the function to find and return the
// number of superior elements in array 'arr'.


import java.util.*;
public class supEle {
    public static int SuperiorEle(int arr[], int n){
        int count = 0;
        for(int i = 0; i<n-1; i++){
            if(arr[i] > arr[i+1]){
                count += 1;
            }
        }
        return count;
    }

    public static void main(String x[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = s.nextInt();
        }
        int result = SuperiorEle(arr, n);
        System.out.println(result);
        s.close();
    }
}
