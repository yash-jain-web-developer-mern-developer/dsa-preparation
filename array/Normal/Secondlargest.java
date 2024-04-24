package array.Normal;

//3
public class Secondlargest {
    public static void main(String[] args) {
        int a[] = { 20, 42, 6, 25, 30, 88 };
        Secondlargest s = new Secondlargest();
        System.out.println(s.seclarge(a));
    }

    public int seclarge(int arr[]) {
        int n = arr.length;
        if (n < 2)
            return -1;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        int i;

        for (i = 0; i < n; i++) {
            if (arr[i] > large) {
                second_large = large;
                large = arr[i];
            }

            else if (arr[i] > second_large && arr[i] != large) {
                second_large = arr[i];
            }
        }
        return second_large;
    }
}
