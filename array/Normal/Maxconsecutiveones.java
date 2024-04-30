package array.Normal;

public class Maxconsecutiveones {
    public static void main(String[] args) {
        int a[] = { 1, 1, 0, 1, 1, 1, 1 };
        Maxconsecutiveones s = new Maxconsecutiveones();
        int p = s.maximum(a);
        System.out.println(p);
    }

    public int maximum(int a[]) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }

        }
        return max;
    }
}
