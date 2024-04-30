package array.Twopointer;

//2
public class Removeduplicate {
    public static void main(String[] args) {
        int a[] = { 2, 2, 3, 3, 4, 6, 6 };
        Removeduplicate s = new Removeduplicate();
        int rd = s.Remove(a);
        for (int i = 0; i < rd; i++) {
            System.out.println(a[i]);
        }
    }

    public int Remove(int a[]) {
        int rd = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[rd] != a[i]) {
                rd++;
                a[rd] = a[i];
            }
        }
        return rd + 1;
    }
}
