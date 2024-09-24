package dp;

public class Houserobber {
    public static void main(String[] args) {
        int n = 10;
        int a[];
        int temp1[],temp2[];
       
        for(int i=0;i<n;i++){
           if(i!=0) temp1[i]=a[i];
           if(i!=n-1) temp2[i]=a[i];
        }
        System.out.println(Math.max( roober(n-1,temp1), roober(n-1,temp2)));
    }

    public static int roober(int n, int h[]) {
        int n = h.length - 1;
        if (n == 0)
        return h[0];
    if (n < 0) {
        return 0;
    }    
    int firstpick = h[n] + h[n - 2];
    int secondpick = 0 + h[n - 1];
    return Math.max(firstpick, secondpick);
   }
}
