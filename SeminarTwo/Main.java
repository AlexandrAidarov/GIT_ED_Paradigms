package SeminarTwo;

public class Main {
    public static void main(String[] args) {
        
        for (int number : new int[]{5}) {
            System.out.println(getMultiplicationTable(number));
        }

    }

    public static String getMultiplicationTable(int targetNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < 10; i++) {
            stringBuilder.append(targetNumber)
                    .append(" x ")
                    .append(i)
                    .append(" = ")
                    .append(targetNumber * i)
                    .append("\n");
        }
        return stringBuilder.toString();
    }
}