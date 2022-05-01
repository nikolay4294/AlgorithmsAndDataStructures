import java.util.Arrays;

public class GreedyAlgorithm {
    public static void main(String[] args) {
        System.out.println(maxNumberFromDigits(new int[]{5, 6, 8, 9, 4, 1, 0, 0, 5}));
    }

    // вариант 1
//    public static int maxNumberFromDigits(int[] digits) {
//        long startTime = System.currentTimeMillis();
//        Arrays.sort(digits);
//        StringBuilder arrInStringBuffer = new StringBuilder();
//        for (int i = 0; i < digits.length; i++) {
//            arrInStringBuffer.append(digits[i]);
//        }
//        arrInStringBuffer.reverse();
//        long endTime = System.currentTimeMillis();
//        System.out.println("Потребовалось времени - " + (endTime - startTime) + " мс");
//        return Integer.parseInt(arrInStringBuffer.toString());
//    }

    // вариант 2
    public static String maxNumberFromDigits(int[] digits){
        Arrays.sort(digits);
        String result = "";
        for(int i = digits.length - 1; i >= 0; i--){
            result += digits[i];
        }
        return result;
    }
}
