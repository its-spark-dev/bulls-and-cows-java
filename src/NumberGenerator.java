import java.util.Random;

public class NumberGenerator {
    public int[] getNumbers(int length) {
        int[] result = new int[length];
        int[] storage = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        Random r = new Random();

        // Mix deck of card randomly
        for (int i = 0; i < storage.length; i++) {
            int temp = storage[i];
            int target = r.nextInt(storage.length);
            storage[i] = storage[target];
            storage[target] = temp;
        }

        // Put them into the result deck
        for (int j = 0; j < length; j++) {
            result[j] = storage[j];
        }

        return result;
    }

}