class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
    public void mergeSort(int[] nums, int low, int high) {
        if(low < high){
        int mid = (low+high)/ 2;
        // Left half
        mergeSort(nums, low, mid);
        // Right half
        mergeSort(nums, mid + 1, high);
        // Merge both sorted halves
        merge(nums, low, mid, high);
    }else return;
    }
    public void merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        // Compare elements from both halves
        while (i <= mid && j <= high) {
            if (nums[i] <= nums[j]) {
                temp[k] = nums[i];
                i++;
            } else {
                temp[k] = nums[j];
                j++;
            }
            k++;
        }
        // Remaining elements of left half
        while (i <= mid) {
            temp[k] = nums[i];
            i++;
            k++;
        }
        // Remaining elements of right half
        while (j <= high) {
            temp[k] = nums[j];
            j++;
            k++;
        }
        // Copy back to original array
        for (int x = 0; x < temp.length; x++) {
            nums[low + x] = temp[x];
        }
    }
}