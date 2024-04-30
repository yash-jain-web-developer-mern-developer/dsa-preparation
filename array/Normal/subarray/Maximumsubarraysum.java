package array.Normal.subarray;

//kadanes algorithm in O(n)
//consider invest his money in business one by one and it invest only if previous company not in lossi.e., sum
//if in loss so it new start
//where -ve show loan
//simply iterate i over array and make two var sum and maxsum
//simply i iterate and add to sum and make maxsum if possible
//if total sum is 0 its fine another businessman come and its money but if sum is negative
// then they simply individually start another business
public class Maximumsubarraysum {
    public static void main(String[] args) {
        int a[] = { 5, 6, -3, 7, -13, 8, -2, 5, -6, 7, -11, 3, 10, -10, -6, -10, 7, 2 };
        Maximumsubarraysum s = new Maximumsubarraysum();
        System.out.println(s.maxsum(a));
    }

    public int maxsum(int a[]) {
        int sum = a[0], maxsum = a[0];
        for (int i = 1; i < a.length; i++) {
            if (sum >= 0) {
                sum = sum + a[i];
            } else {
                sum = a[i];
            }
            if (sum > maxsum) {
                maxsum = sum;
            }
        }
        return maxsum;
    }
}
