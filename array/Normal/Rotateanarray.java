package array.Normal;

public class Rotateanarray {
    public static void main(String[] args) {
        int a[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
        int k = 4;
        Rotateanarray s = new Rotateanarray();
        s.reverse(a, 0, k - 1);
        s.reverse(a, k, a.length - 1);
        s.reverse(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public void reverse(int a[], int start, int end) {
        int temp = 0;
        while (start < end) {
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }

    }
}
