public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        //task #1
        int sum = 0;
        for (int i : arr) {
         sum = sum + i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
        System.out.println();


        //task #2
        int i, j;
        int count = 0;
        for (i = 0, j = 0; count < arr.length - 1; i++, j++) {
           count++;
           i = (arr[i] > arr[count]) ? (i-1) : (count - 1);
           j = (arr[j] < arr[count]) ? (j-1) : (count - 1);
         }
        System.out.println("Максимальная сумма трат за день составила " + arr[i] + " рублей.");
        System.out.println("Минимальная сумма трат за день составила " + arr[j] + " рублей.");
        System.out.println();


        //task #3
        double average = sum / 30;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");
        System.out.println();


        //task #4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int f = reverseFullName.length - 1; f >= 0; f--) {
            System.out.print(reverseFullName[f]);
        }
        System.out.println();

    }
        public static int[] generateRandomArray() {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;
        }

}