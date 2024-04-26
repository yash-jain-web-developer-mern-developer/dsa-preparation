package array.Normal;

//4
public class Checkarraysortedornot {
    public static void main(String[] args) {
        int a[] = { 2, 4, 6, 8, 10, 12, 14 };
        Checkarraysortedornot s = new Checkarraysortedornot();
        System.out.println(s.check(a));
    }

    public boolean check(int a[]) {
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] < a[i]) {
                return true;
            }
        }
        return false;
    }
}
