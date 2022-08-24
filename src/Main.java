public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] costs = {101000, 102000, 103000, 104000, 105000, 106000, 107000, 108000, 109000, 110000, 112000, 113000, 114000, 115000, 116000,
                117000, 118000, 119000, 120000, 121000, 122000, 123000, 124000, 125000, 126000, 127000, 128000, 129000, 130000, 131000};
        costs[0] = 101000;
        double mediumSummaryCostsOfDay = 1;
        int sum = 0;
        int maxCost = 0;
        int minCost = 201000;
        if (costs.length == 30) {
            System.out.println("верно");
        } else {
            System.out.println("неверно");
        }
        // task01//
        for (int i = 0; i < costs.length; i++) {
            sum = sum + costs[i];

            // task 02//
            if (maxCost < costs[i]) {
                maxCost = costs[i];
            }
            if (minCost > costs[i]) {
                minCost = costs[i];
            }

            //task03//
        }        mediumSummaryCostsOfDay = (float) sum / costs.length;

        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + maxCost + " рублей. " +
                "Минимальная сумма трат за день составила " + minCost + " рублей.");
        System.out.println("Средняя сумма трат за месяц составила " + mediumSummaryCostsOfDay + " рублей.");
        //task 04//
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        reverseFullName[0] = 'n';
        for (int b = 0; b < reverseFullName.length; b++)
            System.out.print(reverseFullName[b]);
        System.out.println();
        for (int v = reverseFullName.length - 1; v >= 0; v--) {
            System.out.print(reverseFullName[v]);
        }

    }


}