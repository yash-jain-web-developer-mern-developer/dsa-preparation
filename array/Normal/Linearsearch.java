package array.Normal;

//1
public class Linearsearch {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 6, 3, 1 };
        Linearsearch a = new Linearsearch();
        System.out.println(a.Linear(arr, 5));
    }

    public int Linear(int a[], int k) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == k) {
                return (i + 1);
            }
        }
        return -1;
    }
}
