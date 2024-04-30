package array.Normal;

//element which is greater than all the elemwnt to its right
//traverse start from last because last element is always a leader
public class Leaderinarray {
    public static void main(String[] args) {
        int a[] = { 8, 11, 5, 11, 7, 6, 3 };
        Leaderinarray s = new Leaderinarray();
        s.leader(a);

    }

    public void leader(int a[]) {
        int currleader = a[a.length - 1];
        System.out.println(currleader);
        for (int i = a.length - 2; i >= 0; i--) {
            if (a[i] > currleader) {
                currleader = a[i];
                System.out.println(currleader);
            }
        }
    }
}
