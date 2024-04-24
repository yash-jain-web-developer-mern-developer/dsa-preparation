package array.Normal;

// 2 max-min=span
public class Spanofarray {
    public static void main(String[] args) {
        int a[] = { 20, 42, 88, 10, 99, 6 };
        Spanofarray s = new Spanofarray();
        System.out.println(s.span(a));
    }

    public int span(int a[]) {
        int max = a[0];
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
            if (min > a[i]) {
                min = a[i];
            }
        }
        return max - min;
    }
}
