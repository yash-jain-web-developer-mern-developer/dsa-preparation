package array.Normal;

//in sorted array
public class Frequencyofelements {
    public static void main(String[] args) {
        int a[] = { 20, 20, 30, 30, 30, 40, 40, 80, 80, 90 };
        Frequencyofelements s = new Frequencyofelements();
        s.frequency(a);

    }

    public void frequency(int a[]) {
        int count = 1;
        int elem = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] == elem) {
                count++;
            } else {
                System.out.print(elem + " " + "=" + " " + count);
                System.out.println();
                count = 1;
                elem = a[i];
            }
        }
        System.out.print(elem + " " + "=" + " " + count);
    }
}
