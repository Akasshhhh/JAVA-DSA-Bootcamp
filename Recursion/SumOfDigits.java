
public class SumOfDigits {
    public static void main(String[] args) {
        int ans = sumOfDigits(23456);
        System.out.println(ans);
    }

    static int sumOfDigits(int n){
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        int sum = rem + sumOfDigits(n/10);
        return sum;
    }
}
