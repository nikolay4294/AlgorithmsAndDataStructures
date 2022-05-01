public class Fibonachy {
    public static void main(String[] args) {
        System.out.println(febActual(10));
    }

    public static long febActual(int num) {
        long[] arr = new long[num + 1];
        arr[0] = 0;
        arr[1] = 1;
        long febonacci = 0;

        for (int i = 2; i <= num; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            febonacci = arr[num];
        }
        return febonacci;
    }
}

