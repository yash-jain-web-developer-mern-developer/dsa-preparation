package array.Twopointer;

//3
// trick
// always nz variable point to non zero
// and zvariable point to zero
public class Movezerotoend {
    public static void main(String[] args) {
        int a[] = {};
        Movezerotoend s = new Movezerotoend();
        s.Move(a);
    }

    public void Move(int a[]) {
        int size = a.length;
        if (size == 0 || size == 1) {
            System.out.println("");
        }
        int z = 0;
        int nz = 0;
        while (nz < size) {
            if (a[nz] != 0) {
                int temp = a[nz];
                a[nz] = a[z];
                a[z] = temp;
                nz++;
                z++;
            } else {
                nz++;
            }
        }
    }
}
