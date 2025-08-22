public class findmin_in_rotated_array {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2}; // Example Test case

        int n=nums.length;
        int low = 0;
        int high = n - 1;

        // Binary search to find minimum
        while (low < high) {
            int mid = (low + high) / 2;

            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        System.out.println("Minimum element: " + nums[low]);
    }
}
