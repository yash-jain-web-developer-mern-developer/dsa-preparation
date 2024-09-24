// A number is ugly only when its prime factor is 2,3 and 5
// Ex 6=2*3
package Math;

public class Ugly {
    public static void main(String[] args) {
        Ugly a = new Ugly();
        System.out.println(a.check());
    }

    public static boolean check(){
        int n = 6;
        while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else if (n % 3 == 0) {
                n = n / 3;
            } else if (n % 5 == 5) {
                n = n / 5;
            } else {
                return false;
            }
        }
        if (n == 1)
            return true;
        return false;
    }
} 