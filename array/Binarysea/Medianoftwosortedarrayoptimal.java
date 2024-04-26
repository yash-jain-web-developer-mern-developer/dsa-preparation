package array.Binarysea;
//median is the element which is middle of array so bascically we have to find mid element

// in the case of even array mid and mid-1 used so we to divide the combination in to two half
// last elemet of first half and first element of second half 
// used so we have to make combination that all element of first half is smaller than all element in second half
// and right most element of first half is greater than all element in first half and
// left most element of second half is smaller than all element in second half

//that can achieve such that x=x1,x2|x3,x4,x5,x6
//y=y1,y2,y3,y4,y5|y6,y7,y8
// all element of left half is achieve x2<-y6 and y5<=x3
// partition line determine by small array m1=l+h/2
// for second array ((len(ar1)+len(ar2)+1)/2)-m1
// x1=ar1[m1-1]
// x3=ar1[m1]
// y5=ar2[m2-1]
// y6=ar2[m2]

import java.util.*;

public class Medianoftwosortedarrayoptimal {
    public static double median(int[] a, int[] b) {
        int n1 = a.length, n2 = b.length;
        // if n1 is bigger swap the arrays:
        if (n1 > n2)
            return median(b, a);

        int n = n1 + n2; // total length
        int left = (n1 + n2 + 1) / 2; // length of left half
        // apply binary search:
        int low = 0, high = n1;
        while (low <= high) {
            int mid1 = (low + high) / 2;
            int mid2 = left - mid1;
            // calculate l1, l2, r1 and r2;
            int l1 = (mid1 > 0) ? a[mid1 - 1] : Integer.MIN_VALUE;
            int l2 = (mid2 > 0) ? b[mid2 - 1] : Integer.MIN_VALUE;
            int r1 = (mid1 < n1) ? a[mid1] : Integer.MAX_VALUE;
            int r2 = (mid2 < n2) ? b[mid2] : Integer.MAX_VALUE;

            if (l1 <= r2 && l2 <= r1) {
                if (n % 2 == 1)
                    return Math.max(l1, l2);
                else
                    return ((double) (Math.max(l1, l2) + Math.min(r1, r2))) / 2.0;
            } else if (l1 > r2)
                high = mid1 - 1;
            else
                low = mid1 + 1;
        }
        return 0; // dummy statement
    }

    public static void main(String[] args) {
        int[] a = { 1, 4, 7, 10, 12 };
        int[] b = { 2, 3, 6, 15 };
        System.out.println("The median of two sorted arrays is " + median(a, b));
    }
}
