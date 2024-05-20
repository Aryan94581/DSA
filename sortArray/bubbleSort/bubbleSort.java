public class bubbleSort {
    public static void main(String[] args) {

        int nums[] = { 7, 4, 3, 6, 2, 5 };
        int size = nums.length;
        int temp;

        System.err.println("before sorting ");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }

            }
        }

        System.out.println();
        System.err.println("After sorting ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

}