class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
     private static int mergeSort(int[] arr, int low, int high) {
        int count = 0;
        if (low >= high) return count;
        int mid = (low + high) / 2;
        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid + 1, high);
        count += merge(arr, low, mid, mid + 1, high);
        return count;
    }

    private static int merge(int[] arr, int left, int mid, int right, int high) {
        int ans = 0;
        int[] temp = new int[high - left + 1];
        int ind = 0;
        int low = left;
        int tleft = left;
        int tright = right;
        while (tleft <= mid && tright <= high) {
            if ((long)arr[tleft] > (long)2*arr[tright]) {
                ans += (mid - tleft + 1);
                tright++;
            } else {
                tleft++;
            }
        }

        while (left <= mid && right <= high) {
            if (arr[left] > arr[right]) {
                temp[ind++] = arr[right];
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
