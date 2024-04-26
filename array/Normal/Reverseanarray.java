package array.Normal;

//5
public class Reverseanarray {
    public static void main(String[] args) {
        int a[] = { 2, 3, 5, 6, 4, 8 };
        Reverseanarray s = new Reverseanarray();
        int arr[] = s.reverse(a);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public int[] reverse(int a[]) {
        int start = 0;
        int end = a.length - 1;
        int temp = 0;
        while (start < end) {
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        return a;
    }
}
