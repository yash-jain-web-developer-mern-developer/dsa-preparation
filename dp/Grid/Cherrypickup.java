package dp.Grid;

public class Cherrypickup {
    public static void main(String[] args) {

    }

    public static int cherrry(int a[][], int i, int j1, int j2) {
        if (j1 <= 0 || j1 >= a.length - 1 || j2 <= 0 || j2 >= a.length - 1) {
            return (int) Math.pow(10, 9); // If we're out of bounds, return a large value 
        }
        if (i == a.length - 1) {
            if (j1 == j2)
                return a[i][j1];
            else {
                return a[i][j1] + a[i][j2];
            }
        }int maxi=0;
        for (int dj1 = -1; dj1 <= 1; dj1++) {
            for (int dj2 = -1; dj2 <= 1; dj2++) {
                if (j1 == j2) {
                    maxi = Math.max(maxi, a[i][j1] + cherrry(a, i + 1, j1 + dj1, j2 + dj2));
                } else {
                    maxi = Math.max(maxi, a[i][j1] + a[i][j2] + cherrry(a, i + 1, j1 + dj1, j2 + dj2));
                }
            }
        }
        return maxi;
   }
}
