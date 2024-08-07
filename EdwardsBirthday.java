// It is Edward's birthday today. His friends have bought him a huge circular cake. Edward wants to find out the maximum number of pieces he can get by making exactly N straight vertical
// cuts on the cake.
// Your task is to write a function that returns the maximum number of pieces that can be obtained by making
// N number of cuts.


import java.util.*;
public class EdwardsBirthday {
    public static int Birthday(int n){
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum += i; 
        }
        int piece = sum + 1;
        return piece%1000000007;
    }
    public static void main(String x[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int result = Birthday(n);
        System.out.println(result);
        s.close();
    }
}
