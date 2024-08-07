import java.util.*;

public class BuyNsell {
    public static int BuySell(int[] a, int n) {
        //prices = {7 ,1 ,5 ,3 ,6 ,4}
        //          0  1  2  3  4  5
        //We have to choose one day for buying the stocks and one day for selling the stocks
        //During this transaction Profit must me maximise
        int maxProfit = 0;
        int buyStocks = a[0]; 
        for (int i = 1; i < n; i++) {
            if (a[i] < buyStocks) {
                buyStocks = a[i]; 
            }
            int curr = a[i] - buyStocks; 
            maxProfit = Math.max(maxProfit, curr); 
            
        }

        return maxProfit;
}

    public static void main(String x[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int result = BuySell(a, n);
        System.out.println(result);
        s.close();
    }
}