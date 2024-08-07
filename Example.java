import java.util.*;
public class Example {
    public static int differenceofSum(int n, int m){
        //m = 6; n = 30;
        int div = 0; int ndiv = 0;
        for(int i = 1; i<=n; i++){
            int modu = i % m;
            if(modu == 0){
                div += i;
            }
            else{
                ndiv += i;
            }
        }
        int diff = ndiv - div;
        return diff;
    }
    public static void main(String x[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int result = differenceofSum(n, m);
        System.out.println(result);
        s.close();
    }
}