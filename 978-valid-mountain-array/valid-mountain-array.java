class Solution {
    public boolean validMountainArray(int[] arr) {

        int n = arr.length;

        if (n < 3) {
            return false;
        }

        int i = 0;

        // Increasing part
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }

        // Peak first ya last nahi hona chahiye
        if (i == 0 || i == n - 1) {
            return false;
        }

        // Decreasing part
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == n - 1;
    }
}