package array.Normal;

//array of integer which show height of bar
//find total amount of water is wraaped
//we calculate the maximum height bar on the left then on the right for each bar
// then min of both -height of bar give wrapped water
public class Trappingrainwater {
    public static void main(String[] args) {
        int a[] = { 4, 2, 0, 3, 2, 5 };
        Trappingrainwater s = new Trappingrainwater();
        s.trap(a);
    }

    public void trap(int a[]) {
        int lb[] = new int[a.length];
        int rb[] = new int[a.length];
        int res = 0;
        lb[0] = a[0];
        for (int i = 1; i < a.length - 1; i++) {
            lb[i] = Math.max(a[i], lb[i - 1]);
        }
        rb[a.length - 1] = a[a.length - 1];
        for (int i = a.length - 2; i >= 0; i--) {
            rb[i] = Math.max(a[i], rb[i + 1]);
        }
        for (int i = 1; i < a.length - 1; i++) {
            res = res + Math.min(lb[i], rb[i]) - a[i];
        }
        System.out.println(res);
    }
}
