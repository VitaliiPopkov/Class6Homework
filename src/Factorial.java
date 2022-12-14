public class Factorial {
    public static void main(String[] args) {
        //n!=1*2*3*4...(n-1) * n
        System.out.println(factorial(5));

    }

    public static int factorial(int n) {
        if (n==1) return 1;
        return n * (factorial(n - 1));
             //5 *               5 - 1


    }

}
