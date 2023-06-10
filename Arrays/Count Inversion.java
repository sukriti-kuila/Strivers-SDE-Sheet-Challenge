import java.util.*;
import java.io.*;

public class Solution {
    public static long getInversions(long arr[], int n) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    private static long mergeSort(long[] arr, int low, int high) {
        long count = 0;
        if (low >= high) return count;
        int mid = (low + high) / 2;
        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid + 1, high);
        count += merge(arr, low, mid, mid + 1, high);
        return count;
    }

    private static long merge(long[] arr, int left, int mid, int right, int high) {
        long ans = 0;
        long[] temp = new long[high - left + 1];
        int ind = 0;
        int low = left;
        while (left <= mid && right <= high) {
            if (arr[left] > arr[right]) {
                temp[ind++] = arr[right];
                ans += (mid - left + 1);
                right++;
            } else {
                temp[ind++] = arr[left++];
            }
        }
        while (left <= mid) {
            temp[ind++] = arr[left++];
        }
        while (right <= high) {
            temp[ind++] = arr[right++];
        }
        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
        return ans;
    }
}
