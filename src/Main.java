public class Main {
    public static void main(String[] args) {
        System.out.println("Array_lesson_one");
        task1();
        task2();
        task3();
        task4();
    }

    private static void task4() {
        System.out.println("Array task four");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0 || i == 0) {
                numbers[i] += 1;
            }
            System.out.print(numbers[i] + " ");
        }
    }

    private static void task3() {
        System.out.println("Array task three");
        // Array one
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 2; i != -1; i--) {
            if (i == 0) {
                System.out.println(numbers[i]);
            } else {
                System.out.print(numbers[i] + ",");
            }
        }

        // Array two
        double[] doubleNumbers = {1.57, 7.654, 9.986};
        for (int i = doubleNumbers.length - 1; i != -1; i--) {
            if (i == 0) {
                System.out.println(doubleNumbers[i]);
            } else {
                System.out.print(doubleNumbers[i] + ",");
            }
        }
        // Array three
        int[] years = new int[10];
        int x = 0;
        for (int i = years.length - 1; i != -1; i--) {
            years[i] = 2031 - x;
            x++;
            if (i == 0) {
                System.out.println(years[i]);
            } else {
                System.out.print(years[i] + ",");
            }
        }
    }
    private static void task2() {
        System.out.println("Array task two");
        // Array one
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.println(numbers[i]);
            } else {
                System.out.print(numbers[i] + ",");
            }
        }
        // Array two
        double[] doubleNumbers = {1.57, 7.654, 9.986};
        for (int i = 0; i < doubleNumbers.length; i++) {
            if (i == doubleNumbers.length - 1) {
                System.out.println(doubleNumbers[i]);
            } else {
                System.out.print(doubleNumbers[i] + ",");
            }
        }
        // Array three
        int[] years = new int[10];
        for (int i = 0; i < years.length; i++) {
            years[0 + i] = 2022 + i;
            if (i == years.length - 1) {
                System.out.println(years[i]);
            } else {
                System.out.print(years[i] + ",");
            }
        }
   }
    private static void task1() {
        System.out.println("Array task one");
        // Array one
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        // Array two
        double[] doubleNumbers = {1.57, 7.654, 9.986};
        // Array three
        int[] years = new int[10];
        for (int i = 0; i < years.length; i++) {
            years[0 + i] = 2022 + i;
            System.out.println(years[i]);
        }
    }
}