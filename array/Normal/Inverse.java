package array.Normal;

//interchange value and index
public class Inverse {
    public static void main(String[] args) {
        int a[] = { 2, 3, 1, 0, 4 };
        Inverse s = new Inverse();
        int b[] = s.inverse(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(b[i]);
        }
    }

    public int[] inverse(int a[]) {
        int b[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int v = a[i];
            b[v] = i;
        }
        return b;
    }
}
