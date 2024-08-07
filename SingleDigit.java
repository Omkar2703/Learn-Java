



import java.util.*;
public class SingleDigit {
    public static int Singledigit(int n){
        int mod = n % 10;
        if(mod == n){
            return n;
        }
        if(n%2 == 0){
            return Math.floorDiv((n-2),2);
        }
        else if(n%2 != 0){
            return Math.floorDiv(n,2);
        }
        return -1;//error handeled;
    }
    public static void main(String x[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int result = Singledigit(n);
        System.out.println(result);
        s.close();
    }
}
