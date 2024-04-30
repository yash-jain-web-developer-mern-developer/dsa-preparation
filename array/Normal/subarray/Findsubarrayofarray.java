package array.Normal.subarray;

//4
//i show start point jshow end point and k is used to print from i to j
public class Findsubarrayofarray {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        Findsubarrayofarray s = new Findsubarrayofarray();
        s.subarray(a);
    }

    public void subarray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(a[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
