package dp.Grid;

public class Uniquepaths {
    public static void main(String[] args) {

    }

    public static int uniquepath(int a[][], int i, int j) {
        if (i == 0&&j==0)
            return 1;
        if(j<0&&i<0)
        return 0;    
        int up = uniquepath(a, i - 1, j);
        int left = uniquepath(a, i, j - 1);
        return up + left;
    }
}
