class demo {
    public static void main(String[] args) {
        int num[] = { 2, 3, 4, 6, 11 };
        int Target = 6;
        int result = binarySearch(num, Target);
        if (result != -1)
            System.out.println("your element is at index of :" + result);
        else
            System.out.println("Your is not present ");
    }

    private static int binarySearch(int[] num, int target) {
        int left = 0;
        int right = num.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (num[middle] == target) {
                return middle;
            } else if (num[middle] < target) {
                left = middle + 1;
            } else
                right = middle - 1;
        }

        return -1;
    }
}