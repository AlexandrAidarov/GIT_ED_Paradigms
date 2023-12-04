import java.util.*;

public class Main {
    public static void main(String[] args) {
    }

    public static void sort_list_imperative(List<Integer> numbers) {
        int numbersSize = numbers.size();
        while (numbersSize > 0) {
            for (int i = 0; i < numbersSize - 1; i++) {
                int currentElement = numbers.get(i);
                int nextElement = numbers.get(i + 1);
                if (currentElement > nextElement) {
                    numbers.set(i + 1, currentElement);
                    numbers.set(i, nextElement);
                }
            }
            numbersSize -= 1;
        }
    }

    public static void sort_list_declarative(List<Integer> numbers) {
        Collections.sort(numbers);
    }




}