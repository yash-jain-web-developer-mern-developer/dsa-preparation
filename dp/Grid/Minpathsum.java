package dp.Grid;

public class Minpathsum {
    public static void main(String[] args) {

    }
    public static int uniquepath(int a[][], int i, int j) {
        if (i == 0&&j==0)
            return a[0][0];
        if(j<0&&i<0)
        return (int) Math.pow(10, 9); // If we're out of bounds, return a large value 
        int up = a[i][j]+uniquepath(a, i - 1, j);
        int left =a[i][j]+ uniquepath(a, i, j - 1);
        return Math.min(up, left); 
    }
}
