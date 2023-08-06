package Bitwise;

public class noOfDigits {
    public static void main(String[] args) {
        //Formula for gettting no of digits in any base i.e. binary, decimal is
        //log(b)a = log(x)a/log(x)b + 1
        //complexity : log n 

        int n = 34535;
        int base = 2;

        int ans = (int)(Math.log(n)/ Math.log(base)) + 1;
        System.out.println(ans);
    }
}
