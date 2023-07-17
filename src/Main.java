import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task_1();
        task_2();


    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

    }

    public static void task_1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int salaryMonth = 0;

        for (int salary : arr) {
            salaryMonth += salary;
        }
        System.out.println("Сумма трат за месяц составила " + salaryMonth + " рублей.");

        System.out.println("Задача 2");

        Arrays.sort(arr);
        System.out.println("Минимальная сумма трат за день составила " + arr[0] + " рублей." + "Максимальная сумма трат за день составила " + arr[29] + " рублей.");

        System.out.println("Задача 3");
        double srSum = salaryMonth / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + srSum + " рублей.");

    }

    public static void task_2() {
        System.out.println("Задача 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }
    }

}