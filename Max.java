// # Maximum Sum Subarray (Kadane’s Algorithm)

// Problem Statement: Given an integer array, find the maximum sum of a contiguous subarray.

// Example Input: [1, -2, 3, 4, -1, 2, 1, -5, 4]

// Example Output: 9 (The subarray [3, 4, -1, 2, 1] has the largest sum)


public class Max{
    public static int Maxsum(int arr[]){
        // Method 1
        int maxSum = 0; int curSum = 0;
        for(int i = 0; i<arr.length; i++){
            curSum += arr[i];
            maxSum = Math.max(maxSum, curSum);
            if(curSum<0){
                curSum = 0;
            }
        }
        return maxSum;
    }
    public static int MaxSum(int arr[]){
        // Method 2
        int Sum = arr[0];
        int curr_sum = arr[0];
        int n = arr.length;
        for(int i = 1; i<n; i++){
            curr_sum = Math.max(arr[i], curr_sum + arr[i]);
            Sum = Math.max(curr_sum, Sum);
        }
        return Sum;
    }
    public static void main(String x[]){
        int arr[] ={1, -2, 3, 4, -1, 2, 1, -5, 4};
        int sum = MaxSum(arr);
        // int sum = Maxsum(arr);
        System.out.println(sum);
    }
}