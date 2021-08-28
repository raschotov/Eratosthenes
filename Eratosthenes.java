import java.util.Arrays;
import java.util.Scanner;

public class Eratosthenes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = primeNumbers(n);
        System.out.println(Arrays.toString(array));
    }

    static int[] primeNumbers(int n) {
        int[] candidates = rangeFrom2To(n);

        for (int i = 0; i < candidates.length; i++) {
            int p = candidates[i];
            if (p != -1) {
                removeMultiples(candidates, p);
            }
        }

        return removeEmpty(candidates);
    }

    // returns [2, 3, 4,... n]
    static int[] rangeFrom2To(int n) {
        int[] range = new int[n - 1];

        for (int i = 0; i < range.length; i++) {
            range[i] = i + 2;
        }

        return range;
    }

    static void removeMultiples(int[] list, int multiplier) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] != multiplier && list[i] % multiplier == 0) {
                list[i] = -1;
            }
        }
    }

    static int[] removeEmpty(int[] array) {
        int filledCells = countFilled(array);
        int[] onlyFilled = new int[filledCells];

        int j = 0; // iterates onlyFilled
        for (int i = 0; i < array.length; i++) {
            if (array[i] != -1) {
                onlyFilled[j] = array[i];
                j++;
            }
        }
        return onlyFilled;
    }

    static int countFilled(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != -1) {
                count++;
            }
        }
        return count;
    }
}
