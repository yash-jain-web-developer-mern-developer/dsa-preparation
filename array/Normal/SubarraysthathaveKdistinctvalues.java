package array.Normal;

import java.util.*;
import java.io.*;

class SubarraysthathaveKdistinctvalues {
    public static int count(int arr[], int n, int k) {
        int cnt = 0, left = 0, right = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        while (right < n) {
            mp.put(arr[right], mp.getOrDefault(arr[right], 0) + 1);
            while (mp.size() > k) {
                mp.put(arr[left], mp.get(arr[left]) - 1);
                if (mp.get(arr[left]) == 0)
                    mp.remove(arr[left]);
                left++;
            }
            cnt += right - left + 1;
            right++;
        }
        return cnt;

    }

    public static int excatK(int arr[], int n, int k) {
        return (count(arr, n, k) - count(arr, n, k - 1));
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(excatK(arr, n, k));
    }

}