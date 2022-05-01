public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[] {-5, 1, 6, 9, 12, 66, 88}, 8));
    }

    public static int binarySearch(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (key < a[middle]) {
                high = middle - 1;
            } else if (key > a[middle]) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
