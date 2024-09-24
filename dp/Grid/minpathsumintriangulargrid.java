package dp.Grid;

public class minpathsumintriangulargrid {
    public static void main(String[] args) {

    }
    public static int uniquepath(int a[][], int i, int j) {
        if (i == a.length-1)
            return a[a.length-1][j];
        if(j<0&&i<0)
        return (int) Math.pow(10, 9); // If we're out of bounds, return a large value 
        int down = a[i][j]+uniquepath(a, i + 1, j);
        int diag =a[i][j]+ uniquepath(a, i+1, j+1);
        return Math.min(down, diag); 
    }
}
